package com.nistart.redbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ViewFlipper;

public class Guanggao extends AppCompatActivity {

    private ViewFlipper view_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guanggao);
        initView();
    }

    private void initView() {
        view_flipper = (ViewFlipper) findViewById(R.id.view_flipper);
        for(int i=0;i<3;i++){
            View view = getLayoutInflater().inflate(R.layout.item_flipper,null);
            view_flipper.addView(view);

            /*view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("Guanggao", "点击了" + i);
                }
            });*/
        }
        view_flipper.setFlipInterval(2000);
        view_flipper.startFlipping();
       /* if(view_flipper.getDisplayedChild()==0){
            view_flipper.getCurrentView().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View arg0) {
                    Log.d("Guanggao", "点击了");
                }
            });*/
        }
    }

