package com.example.smalljay1117.taipeiyoubike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.smalljay1117.taipeiyoubike.observer.Observer;
import com.example.smalljay1117.taipeiyoubike.util.TaipeiOpenDataUtil;

public class MainActivity extends AppCompatActivity implements Observer {

    private RecyclerView m_rv_youbikes;
    private YouBikesRecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TaipeiOpenDataUtil.loadTaipeiYouBikes(this);
        m_rv_youbikes = (RecyclerView) findViewById(R.id.rv_youbikes);
        m_rv_youbikes.setHasFixedSize(true);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        m_rv_youbikes.setLayoutManager(llm);

        mAdapter = new YouBikesRecyclerViewAdapter();
        m_rv_youbikes.setAdapter(mAdapter);
    }

    @Override
    public void OnCompletde() {
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void OnError(String message) {

    }
}
