package com.tencent.neilchen.testrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //titleGridRecyclerview();


  }

  @Override protected void onResume() {
    super.onResume();
    multiRecyclerview();
  }

  private void multiRecyclerview() {

    RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvMulti);
    recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()){
      @Override public boolean canScrollVertically() {
        return false;
      }
    });
    BaseRecyclerViewAdapter baseRecyclerViewAdapter =
        new BaseRecyclerViewAdapter(getApplicationContext());
    recyclerView.setAdapter(baseRecyclerViewAdapter);
  }

  private void titleGridRecyclerview() {
    RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv);
    recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),5,GridLayoutManager.VERTICAL,false));
    GridRecyclerViewAdapter gridRecyclerViewAdapter = new GridRecyclerViewAdapter();
    recyclerView.setAdapter(gridRecyclerViewAdapter);
  }
}
