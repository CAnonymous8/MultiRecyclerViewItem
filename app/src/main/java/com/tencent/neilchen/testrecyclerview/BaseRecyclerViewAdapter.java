package com.tencent.neilchen.testrecyclerview;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

/**
 * Created by neil.chen on 2017/6/1.
 */

public class BaseRecyclerViewAdapter extends RecyclerView.Adapter<BaseViewHolder> {

  private Context context;

  private static final int TYPEONE = 0; //三个图样式，1，2
  private static final int TYPETWO = 1; //横向两个图 1111
  private static final int TYPETHREE = 2; //横向三个图 111
  private static final int TYPEFOUR = 3;  //横向四个图 11



  public BaseRecyclerViewAdapter(Context context) {
    this.context = context;
  }

  @Override public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    BaseViewHolder viewHolder = null;
      View itemView = LayoutInflater.from(context).inflate(R.layout.base_item_recyclerview, null);
      viewHolder = new BaseViewHolder(itemView);
    return viewHolder;
  }

  @Override public void onBindViewHolder(BaseViewHolder holder, final int position) {

    int itemViewType = getItemViewType(position);
    if (itemViewType == TYPEONE){
      holder.linearLayoutHorizontal.setVisibility(View.GONE);

      ViewGroup.LayoutParams lp = holder.ivOne.getLayoutParams();
      lp.width = (int) (ScreenUtils.getScreenWidth(context)*0.5);
      lp.height = (int) (ScreenUtils.getScreenWidth(context)*0.5);
      holder.ivOne.setLayoutParams(lp);


    }else if (itemViewType == TYPETWO){
      holder.relativeLayoutMulti.setVisibility(View.GONE);

      int sum = 4;
      int[] images = {R.mipmap.ic_launcher,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher,R.mipmap.ic_launcher_round};

      AddImageViewItemUtils.addImageView(context, holder.linearLayoutHorizontal, sum, images, new ClickListener() {
        @Override public void onClick(View view, int p) {

          Toast.makeText(context,position+ "-->" + p,Toast.LENGTH_SHORT).show();
        }
      });



    }else if (itemViewType == TYPETHREE){
      holder.relativeLayoutMulti.setVisibility(View.GONE);

      int sum = 3;
      int[] images = {R.mipmap.ic_launcher_round,R.mipmap.ic_launcher,R.mipmap.ic_launcher_round};

      AddImageViewItemUtils.addImageView(context, holder.linearLayoutHorizontal, sum, images, new ClickListener() {
        @Override public void onClick(View view, int p) {
          Toast.makeText(context,position+ "-->" + p,Toast.LENGTH_SHORT).show();
        }
      });

    }else if (itemViewType == TYPEFOUR){
      holder.relativeLayoutMulti.setVisibility(View.GONE);

      int sum = 2;
      int[] images = {R.mipmap.ic_launcher,R.mipmap.ic_launcher_round};

      AddImageViewItemUtils.addImageView(context, holder.linearLayoutHorizontal, sum, images, new ClickListener() {
        @Override public void onClick(View view, int p) {
          Toast.makeText(context,position+ "-->" + p,Toast.LENGTH_SHORT).show();
        }
      });
    }

  }

  @Override public int getItemCount() {
    return 4;
  }

  @Override public int getItemViewType(int position) {
    return position;
  }
}
