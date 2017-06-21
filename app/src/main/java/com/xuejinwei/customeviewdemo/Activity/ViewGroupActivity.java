package com.xuejinwei.customeviewdemo.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.xuejinwei.customeviewdemo.R;

/**
 * Created by xuejinwei on 2017/6/21.
 * Email:xuejinwei@outlook.com
 */

public class ViewGroupActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewgroup);
        findViewById(R.id.ll_item).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ViewGroupActivity.this, "item", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
