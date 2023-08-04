package com.lybratepuneetverma.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lybratepuneetverma.R;

import java.util.ArrayList;

public class SearchResultsAdapter extends RecyclerView.Adapter<SearchResultsAdapter.SearchResultViewHolder>{

    Context context;
    ArrayList<String> list_TrackID;
    ArrayList<String> list_TrackName;
    ArrayList<String> list_TrackTime;
    ArrayList<String> list_GenreName;
    ArrayList<String> list_ArtistName;
    ArrayList<String> list_ArtistId;

    public SearchResultsAdapter(Context context, ArrayList<String> list_TrackID, ArrayList<String> list_TrackName, ArrayList<String> list_TrackTime, ArrayList<String> list_GenreName, ArrayList<String> list_ArtistName, ArrayList<String> list_ArtistId) {
        this.context = context;
        this.list_TrackID = list_TrackID;
        this.list_TrackName = list_TrackName;
        this.list_TrackTime = list_TrackTime;
        this.list_GenreName = list_GenreName;
        this.list_ArtistName = list_ArtistName;
        this.list_ArtistId = list_ArtistId;
    }



    @NonNull
    @Override
    public SearchResultViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view =inflater.inflate(R.layout.search_results_layout_recycler_view,parent,false);

        return new SearchResultViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull SearchResultViewHolder holder, int position) {

        holder.trackID.setText(list_TrackID.get(position));
        holder.trackName.setText(list_TrackName.get(position));
        holder.trackTime.setText(list_TrackTime.get(position));
        holder.genreName.setText(list_GenreName.get(position));
        holder.artistName.setText(list_ArtistName.get(position));
        holder.artistId.setText(list_ArtistId.get(position));


    }

    @Override
    public int getItemCount() {
        return list_TrackID.size();
    }

    public class SearchResultViewHolder extends RecyclerView.ViewHolder
    {

        TextView trackID;
        TextView trackName;
        TextView trackTime;
        TextView genreName;
        TextView artistName;
        TextView artistId;


        public SearchResultViewHolder(@NonNull View itemView) {
            super(itemView);

            trackID=itemView.findViewById(R.id.tv_track_id);
            trackName=itemView.findViewById(R.id.tv_track_name);
            trackTime=itemView.findViewById(R.id.tv_track_time);
            genreName=itemView.findViewById(R.id.tv_genre_name);
            artistName=itemView.findViewById(R.id.tv_artist_name);
            artistId=itemView.findViewById(R.id.tv_artist_id);


        }
    }
}
