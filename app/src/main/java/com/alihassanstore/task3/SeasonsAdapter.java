package com.alihassanstore.task3;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class SeasonsAdapter extends RecyclerView.Adapter<SeasonsAdapter.ViewHolder> {

    LayoutInflater iLayoutInflater ;
    Context iContext;
    ArrayList <SeasonData> mSeasonData;

    public SeasonsAdapter(Context iContext, ArrayList<SeasonData> seasonData) {
        this.iLayoutInflater = LayoutInflater.from(iContext);
        this.iContext = iContext;
        mSeasonData = seasonData;
    }

    class ViewHolder extends RecyclerView.ViewHolder{


        ImageView iv;
        Button btn ;
        RelativeLayout rl;

        public ViewHolder(View itemView) {
            super(itemView);

            iv = itemView.findViewById(R.id.iv_season_img);
            btn = itemView.findViewById(R.id.btn_website);
            rl = itemView.findViewById(R.id.seasons_container);

        }
    }

    @NonNull
    @Override
    public SeasonsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(iLayoutInflater.inflate(R.layout.seasons_design,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SeasonsAdapter.ViewHolder holder, int position) {
        SeasonData tata = mSeasonData.get(position);
       holder.iv.setImageDrawable(iContext.getDrawable(tata.getPictures()));
        holder.btn.setText(tata.getSeasonName());

    }

    @Override
    public int getItemCount() {
        return (mSeasonData == null)? 0: mSeasonData.size();
    }
}
