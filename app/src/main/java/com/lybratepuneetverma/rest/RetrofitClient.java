package com.lybratepuneetverma.rest;

import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    public static Retrofit retrofit=null;
    static String baseSearchUrl = "https://itunes.apple.com/";


    public static Retrofit getClient()
    {
        if(retrofit==null)
        {
             retrofit = new Retrofit.Builder()
                    .baseUrl(baseSearchUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }


}
