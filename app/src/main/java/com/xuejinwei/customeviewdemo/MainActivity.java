package com.xuejinwei.customeviewdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.xuejinwei.customeviewdemo.Activity.ClorkActivity;
import com.xuejinwei.customeviewdemo.Activity.NumberProgressBarActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtnNumberProgressbar, mBtnClork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnNumberProgressbar = (Button) findViewById(R.id.btn_number_progressbar);
        mBtnClork = (Button) findViewById(R.id.btn_clork);

        mBtnNumberProgressbar.setOnClickListener(this);
        mBtnClork.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_number_progressbar:
                startActivity(new Intent(this, NumberProgressBarActivity.class));
                break;
            case R.id.btn_clork:
                startActivity(new Intent(this, ClorkActivity.class));
                break;
            default:
                break;
        }
    }
}
