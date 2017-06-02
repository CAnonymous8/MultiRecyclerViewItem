package com.tencent.neilchen.testrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by neil.chen on 2017/6/1.
 */

public class GridRecyclerViewAdapter extends RecyclerView.Adapter<TitleViewHolder> {
  String[] titles = {"生活服务","周边商户","生活服务","周边商户","生活服务","周边商户","生活服务","周边商户","更多"};

  int[] images = {R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,
      R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,};

  @Override public TitleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View itemView =
        LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview, parent, false);
    return new TitleViewHolder(itemView);
  }


  @Override public void onBindViewHolder(TitleViewHolder holder, int position) {
    holder.image.setBackgroundResource(images[position]);
    holder.title.setText(titles[position]);
  }

  @Override public int getItemCount() {
    return titles.length;
  }
}
