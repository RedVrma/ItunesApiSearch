package com.lybratepuneetverma.ui;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.lybratepuneetverma.R;
import com.lybratepuneetverma.rest.ApiUtils;
import com.lybratepuneetverma.models.ResponseModel;
import com.lybratepuneetverma.adapter.SearchResultsAdapter;
import com.lybratepuneetverma.models.Track;
import com.lybratepuneetverma.rest.SearchApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    String TAG = "Main";

    EditText et_search;
    Button btn_search;
    TextView tv_no_of_results;

    RecyclerView rcv;
    ArrayList<String> list_TrackID;
    ArrayList<String> list_TrackName;
    ArrayList<String> list_TrackTime;
    ArrayList<String> list_GenreName;
    ArrayList<String> list_ArtistName;
    ArrayList<String> list_ArtistId;




    LoadingScreen loadingScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_search = findViewById(R.id.et_search);
        et_search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.toString().length()>0)
                {
                    btn_search.setEnabled(true);
                }
                else
                {
                    btn_search.setEnabled(false);
                }
            }
        });
        btn_search = findViewById(R.id.btn_search);
        tv_no_of_results = findViewById(R.id.tv_number_of_results);

        list_TrackID = new ArrayList<>();
        list_TrackName = new ArrayList<>();
        list_TrackTime = new ArrayList<>();
        list_GenreName = new ArrayList<>();
        list_ArtistName = new ArrayList<>();
        list_ArtistId = new ArrayList<>();

        rcv = findViewById(R.id.rcv_search_results);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        loadingScreen = new LoadingScreen(this);



        SearchApi searchApi = ApiUtils.getSearchApi();


        btn_search.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {


                InputMethodManager imm = (InputMethodManager) getApplicationContext().getSystemService(Activity.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(et_search.getWindowToken(), 0);

                loadingScreen.startLoading();

                Map<String, String> searchMap = new HashMap<>();
                searchMap.put("term", et_search.getText().toString().trim());
                searchMap.put("entity", "musicTrack");

                Call<ResponseModel> call = searchApi.getTracks(searchMap);

                call.enqueue(new Callback<ResponseModel>() {
                    @Override
                    public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {

                        if (response.isSuccessful()) {
                            list_TrackID.clear();
                            list_TrackName.clear();
                            list_TrackTime.clear();
                            list_GenreName.clear();
                            list_ArtistName.clear();
                            list_ArtistId.clear();


                            tv_no_of_results.setText("Total " + response.body().resultCount + " results found!");

                            ArrayList<Track> tracks = response.body().results;

                            for (int i = 0; i < tracks.size(); i++) {

                                list_TrackID.add("TrackID : " + response.body().results.get(i).getTrackId().toString());
                                list_TrackName.add("Track Name : " + response.body().results.get(i).getTrackName().toString());

                                int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(response.body().results.get(i).getTrackTimeMillis());
                                list_TrackTime.add("Time : " + String.valueOf(minutes));

                                list_GenreName.add("Genre : " + response.body().results.get(i).getPrimaryGenreName().toString());
                                list_ArtistName.add("Artist : " + response.body().results.get(i).getArtistName().toString());
                                list_ArtistId.add("ArtistID : " + response.body().results.get(i).getArtistId().toString());

                            }
                            SearchResultsAdapter adaptor = new SearchResultsAdapter(MainActivity.this, list_TrackID, list_TrackName, list_TrackTime, list_GenreName, list_ArtistName, list_ArtistId);
                            adaptor.notifyDataSetChanged();
                            rcv.setAdapter(adaptor);
                            loadingScreen.stopLoading();
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseModel> call, Throwable t) {

                    }
                });


            }
        });


    }
}