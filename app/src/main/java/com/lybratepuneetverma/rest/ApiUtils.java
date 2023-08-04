package com.lybratepuneetverma.rest;

import retrofit2.Retrofit;

public class ApiUtils {

    public static  SearchApi getSearchApi() {
        return RetrofitClient.getClient().create(SearchApi.class);
    }

}
