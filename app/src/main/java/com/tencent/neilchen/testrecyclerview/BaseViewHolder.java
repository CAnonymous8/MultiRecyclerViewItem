package com.tencent.neilchen.testrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by neil.chen on 2017/6/1.
 */

public class BaseViewHolder extends ViewHolder {
  public View mitemView;
  public final RelativeLayout relativeLayoutMulti;
  public final LinearLayout linearLayoutHorizontal;
  public final ImageView ivOne;
  public final ImageView ivSecond;
  public final ImageView ivThree;
  //public final ImageView ivHorizontal;

  public BaseViewHolder(View itemView) {
    super(itemView);
    this.mitemView = itemView;

    relativeLayoutMulti = (RelativeLayout) itemView.findViewById(R.id.rlyMulti);
    ivOne = (ImageView) itemView.findViewById(R.id.ivOne);
    ivSecond = (ImageView) itemView.findViewById(R.id.ivSecond);
    ivThree = (ImageView) itemView.findViewById(R.id.ivThree);

    linearLayoutHorizontal = (LinearLayout) itemView.findViewById(R.id.llyHorizontal);
    //ivHorizontal = (ImageView) itemView.findViewById(R.id.ivHorizontal);
  }
}
