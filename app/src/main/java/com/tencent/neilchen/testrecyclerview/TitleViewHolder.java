package com.tencent.neilchen.testrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by neil.chen on 2017/6/1.
 */

public class TitleViewHolder extends RecyclerView.ViewHolder{

  public final ImageView image;
  public final TextView title;
  public View itemView;

  public TitleViewHolder(View itemView) {
    super(itemView);

    image = (ImageView) itemView.findViewById(R.id.iv);
    title = (TextView) itemView.findViewById(R.id.tvTitle);
    this.itemView = itemView;
  }

}
