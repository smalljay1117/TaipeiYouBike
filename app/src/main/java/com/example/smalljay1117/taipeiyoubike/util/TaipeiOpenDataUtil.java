package com.example.smalljay1117.taipeiyoubike.util;

import com.example.smalljay1117.taipeiyoubike.api.TaipeiYouBikeOpenData;
import com.example.smalljay1117.taipeiyoubike.beans.TaipeiYouBikeBean;
import com.example.smalljay1117.taipeiyoubike.model.TaipeiYouBikes;
import com.example.smalljay1117.taipeiyoubike.myapp.MyApp;
import com.example.smalljay1117.taipeiyoubike.observer.Observer;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TaipeiOpenDataUtil {

    public static void loadTaipeiYouBikes(final Observer observer) {

        Call<TaipeiYouBikeBean> call = TaipeiYouBikeOpenData.apiService.getYouBikeInTaipeiBean();
        call.enqueue(new Callback<TaipeiYouBikeBean>() {
            @Override
            public void onResponse(Call<TaipeiYouBikeBean> call, Response<TaipeiYouBikeBean> response) {
                if (!response.isSuccessful()) {
                    String message = "onResponse() : Unsuccessful , response_code = " + response.code();
                    observer.OnError(message);
                    return;
                }
                TaipeiYouBikeBean bean = response.body();
                MyApp.setTaipeiYouBikes(new TaipeiYouBikes(bean));
                observer.OnCompletde();
            }

            @Override
            public void onFailure(Call<TaipeiYouBikeBean> call, Throwable t) {
                observer.OnError(t.toString());
            }
        });
    }
}
