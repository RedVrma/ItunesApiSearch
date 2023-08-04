package com.lybratepuneetverma.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.airbnb.lottie.LottieAnimationView;
import com.lybratepuneetverma.R;

public class LoadingScreen extends AppCompatActivity {

    Activity activity;
    AlertDialog loading;

    public LoadingScreen(Activity activity) {
        this.activity = activity;
    }

    LottieAnimationView lottieAnimationView;

    @Override
    protected void onStart() {

        lottieAnimationView=findViewById(R.id.lottie_loading);

        super.onStart();


    }

    void startLoading()
    {


        AlertDialog.Builder builder= new AlertDialog.Builder(activity,R.style.Theme_Transparent);

        LayoutInflater inflater= activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.activity_loading_screen,null));

        loading=builder.create();
        loading.show();
        loading.setCancelable(false);

    }

    void stopLoading()
    {
        loading.dismiss();
    }




}