package com.tencent.neilchen.testrecyclerview;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;

/**
 * Created by neil.chen on 2017/6/2.
 */

public class AddImageViewItemUtils {



  /**
   *
   * @param context
   * @param parent 父布局
   * @param sum 总数
   * @param images 图片背景
   */
  public static void addImageView(Context context, LinearLayout parent,int sum, int[] images, final ClickListener onClickListener){
    parent.removeAllViews();
    ArrayList<ImageView> imageViews = new ArrayList<>();


    LinearLayout.LayoutParams lp =
        new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT);
    lp.width = ScreenUtils.getScreenWidth(context) / sum;
    lp.setMargins(0,15,0,15);
    lp.gravity = Gravity.CENTER;



    for (int i = 0; i < sum; i++){
      final ImageView imageView = new ImageView(context);
      imageView.setClickable(true);
      final int finalI = i;
      imageView.setOnClickListener(new View.OnClickListener() {
        @Override public void onClick(View v) {
          onClickListener.onClick(imageView, finalI);

        }
      });
      imageView.setLayoutParams(lp);
      imageView.setBackgroundResource(images[0]);
      imageViews.add(imageView);
    }

    for (int i = 0; i < imageViews.size(); i++){
      parent.addView(imageViews.get(i),lp);
      if (i != imageViews.size() - 1){
        //分割线
        View view = new View(context);
        view.setBackgroundColor(Color.BLUE);
        view.setLayoutParams(new LinearLayout.LayoutParams(2, ViewGroup.LayoutParams.MATCH_PARENT));
        parent.addView(view);

      }
    }


  }
  /**
   *
   * @param context
   * @param parent 父布局
   * @param sum 总数
   * @param images 图片背景
   * @param percent 百分比
   */
  public static void addImageView(Context context, LinearLayout parent,int sum, int[] images,int[] percent, final ClickListener onClickListener){

    parent.removeAllViews();
    ArrayList<ImageView> imageViews = new ArrayList<>();
    int screenWidth = ScreenUtils.getScreenWidth(context); //屏幕宽度
    int sumPercent = 0;
    for (int i=0; i < percent.length; i++){
      sumPercent = sumPercent + percent[i];
    }





    for (int i = 0; i < sum; i++){
      final ImageView imageView = new ImageView(context);
      imageView.setScaleType(ImageView.ScaleType.FIT_XY);
      imageView.setClickable(true);
      final int finalI = i;
      imageView.setOnClickListener(new View.OnClickListener() {
        @Override public void onClick(View v) {
          onClickListener.onClick(imageView, finalI);

        }
      });
      LinearLayout.LayoutParams lp =
          new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
              ViewGroup.LayoutParams.WRAP_CONTENT);

      //lp.setMargins(0,15,0,15);
      lp.gravity = Gravity.CENTER;
      lp.width = screenWidth * percent[i]/sumPercent;
      imageView.setLayoutParams(lp);
      imageView.setImageResource(images[0]);


      imageView.setScaleType(ImageView.ScaleType.FIT_XY);


      imageViews.add(imageView);
    }

    for (int i = 0; i < imageViews.size(); i++){
      parent.addView(imageViews.get(i));
      if (i != imageViews.size() - 1){
        //分割线
        View view = new View(context);
        view.setBackgroundColor(Color.BLUE);
        view.setLayoutParams(new LinearLayout.LayoutParams(2, ViewGroup.LayoutParams.MATCH_PARENT));
        parent.addView(view);

      }
    }


  }
}
