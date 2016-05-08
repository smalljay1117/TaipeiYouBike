package com.example.smalljay1117.taipeiyoubike.api;

import com.example.smalljay1117.taipeiyoubike.beans.TaipeiYouBikeBean;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface TaipeiYouBikeOpenData {
    @GET("/opendata/datalist/apiAccess?scope=resourceAquire&rid=ddb80380-f1b3-4f8e-8016-7ed9cba571d5")
    Call<TaipeiYouBikeBean> getYouBikeInTaipeiBean();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://data.taipei/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    TaipeiYouBikeOpenData apiService = retrofit.create(TaipeiYouBikeOpenData.class);
}
