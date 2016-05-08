package com.example.smalljay1117.taipeiyoubike;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.smalljay1117.taipeiyoubike.model.TaipeiYouBikes;
import com.example.smalljay1117.taipeiyoubike.myapp.MyApp;

public class YouBikesRecyclerViewAdapter
        extends RecyclerView.Adapter<YouBikesRecyclerViewAdapter.MyViewHolder> {

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView m_tv_title;
        private TextView m_tv_sbi;
        private TextView m_tv_bemp;

        public MyViewHolder(View itemView) {
            super(itemView);

            m_tv_title = (TextView) itemView.findViewById(R.id.tv_snatitle);
            m_tv_sbi = (TextView) itemView.findViewById(R.id.tv_sbi);
            m_tv_bemp = (TextView) itemView.findViewById(R.id.tv_bemp);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_youbike, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(v);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        TaipeiYouBikes taipeiYouBikes = MyApp.getTaipeiYouBikes();
        if (taipeiYouBikes == null) {
            holder.m_tv_title.setText("" + position);
            return;
        }

        holder.m_tv_title.setText(taipeiYouBikes.getSnaTitle(position));
        holder.m_tv_sbi.setText(taipeiYouBikes.getSbi(position));
        holder.m_tv_bemp.setText(taipeiYouBikes.getBemp(position));
    }

    @Override
    public int getItemCount() {
        TaipeiYouBikes taipeiYouBikes = MyApp.getTaipeiYouBikes();
        if (taipeiYouBikes == null) {
            return 10;
        }
        return taipeiYouBikes.getCount();
    }
}
