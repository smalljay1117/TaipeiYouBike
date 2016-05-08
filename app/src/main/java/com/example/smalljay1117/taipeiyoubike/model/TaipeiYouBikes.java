package com.example.smalljay1117.taipeiyoubike.model;

import com.example.smalljay1117.taipeiyoubike.beans.TaipeiYouBikeBean;

import java.util.List;

public class TaipeiYouBikes {

    private TaipeiYouBikeBean bean;
    private List<TaipeiYouBikeBean.ResultBean.ResultsBean> youbikes;

    public TaipeiYouBikes(TaipeiYouBikeBean bean) {
        this.bean = bean;
        this.youbikes = bean.getResult().getYoubikes();
    }

    public int getCount() {
        return bean.getResult().getCount();
    }

    public String getSnaTitle(int index) {
        return youbikes.get(index).getSna();
    }

    public String getTot(int index) {
        return youbikes.get(index).getTot();
    }

    public String getSbi(int index) {
        return youbikes.get(index).getSbi();
    }

    public String getBemp(int index) {
        return youbikes.get(index).getBemp();
    }
}
