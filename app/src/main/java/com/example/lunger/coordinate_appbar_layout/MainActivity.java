package com.example.lunger.coordinate_appbar_layout;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.list)
    RecyclerView vRecyclerView;

    @BindView(R.id.toolbar)
    Toolbar vToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        vToolbar.setTitle("Hello AppBarLayout");
        setSupportActionBar(vToolbar);
        vRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        vRecyclerView.setAdapter(new MyAdapter());
    }


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main3;
    }


    class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder>{

        @Override
        public MyAdapter.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new MyHolder(LayoutInflater.from(MainActivity.this).inflate(R.layout.item_recycle_view, null));
        }

        @Override
        public void onBindViewHolder(MyAdapter.MyHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 50;
        }

       class MyHolder extends RecyclerView.ViewHolder{

           public MyHolder(View itemView) {
               super(itemView);
           }
       }
    }
}
