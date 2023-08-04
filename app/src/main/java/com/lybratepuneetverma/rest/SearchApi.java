package com.lybratepuneetverma.rest;

import com.lybratepuneetverma.models.ResponseModel;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface SearchApi {


    @FormUrlEncoded
    @POST("search")
    Call<ResponseModel> getTracks(@FieldMap Map<String, String> fields);
}
