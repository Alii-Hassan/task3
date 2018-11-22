package com.alihassanstore.task3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager iLayoutManager;
    RecyclerView.Adapter seasonsAdapter;
    ArrayList<SeasonData> mSeasonData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.horizontal_recycler_view);
        mSeasonData = new ArrayList<>();


        SeasonData season = new SeasonData(R.drawable.img_btn_website,"Summer","test 1");
        mSeasonData.add(season);

        season = new SeasonData(R.drawable.img_btn_dialer,"Winter","test 2");
        mSeasonData.add(season);

        season = new SeasonData(R.drawable.img_btn_location,"Spring","test 3");
        mSeasonData.add(season);

        seasonsAdapter = new SeasonsAdapter(this, mSeasonData);

        iLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);

        mRecyclerView.setLayoutManager(iLayoutManager);
        mRecyclerView.setAdapter(seasonsAdapter);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        seasonsAdapter.notifyDataSetChanged();


    }
}
