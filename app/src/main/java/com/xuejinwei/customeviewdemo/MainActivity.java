package com.xuejinwei.customeviewdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.xuejinwei.customeviewdemo.Activity.ClorkActivity;
import com.xuejinwei.customeviewdemo.Activity.CreditActivity;
import com.xuejinwei.customeviewdemo.Activity.NumberProgressBarActivity;
import com.xuejinwei.customeviewdemo.Activity.PieActivity;
import com.xuejinwei.customeviewdemo.Activity.ViewGroupActivity;
import com.xuejinwei.customeviewdemo.Path.PathActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private String TAG = "MainActivity";
    private Button mBtnNumberProgressbar, mBtnClork, mBtnCredit, mBtnPie, mBtnBezier, mBtnViewGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnNumberProgressbar = (Button) findViewById(R.id.btn_number_progressbar);
        mBtnClork = (Button) findViewById(R.id.btn_clork);
        mBtnCredit = (Button) findViewById(R.id.btn_credit);
        mBtnPie = (Button) findViewById(R.id.btn_pie);
        mBtnBezier = (Button) findViewById(R.id.btn_bezier);
        mBtnViewGroup = (Button) findViewById(R.id.btn_view_group);

        mBtnNumberProgressbar.setOnClickListener(this);
        mBtnClork.setOnClickListener(this);
        mBtnCredit.setOnClickListener(this);
        mBtnPie.setOnClickListener(this);
        mBtnBezier.setOnClickListener(this);
        mBtnViewGroup.setOnClickListener(this);

        printScreenLog();

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
            case R.id.btn_credit:
                startActivity(new Intent(this, CreditActivity.class));
                break;
            case R.id.btn_pie:
                startActivity(new Intent(this, PieActivity.class));
                break;
            case R.id.btn_bezier:
                startActivity(new Intent(this, PathActivity.class));
                break;
            case R.id.btn_view_group:
                startActivity(new Intent(this, ViewGroupActivity.class));
            default:
                break;
        }
    }

    public void printScreenLog() {
        // 获取屏幕密度(在Context环境下，比如在Activity中执行这些代码或者传入Context对象去获得DisplayMetrics）
        DisplayMetrics dm = getResources().getDisplayMetrics();

        float density = dm.density;        // 屏幕密度（像素比例：0.75/1.0/1.5/2.0,3.0,4等）
        int densityDPI = dm.densityDpi;        // 屏幕密度(这里是系统密度）（每寸像素：120/160/240/320,480,640等）
        float xdpi = dm.xdpi; //这两个是水平和垂直方向上的dpi，如果要计算水平和垂直方向上的实际dp值，可以通过后面`屏幕的宽高差异`中的内容计算。不过你倒是可以通过这两个值大致计算屏幕的宽和高的英寸
        float ydpi = dm.ydpi;
        int screenWidth = dm.widthPixels;        // 屏幕像素宽（像素，如：480px）
        int screenHeight = dm.heightPixels;        // 屏幕像素高（像素，如：800px）
        Log.i(TAG, "  DisplayMetrics: " + "xdpi=" + xdpi + "; ydpi=" + ydpi);
        Log.i(TAG, "  DisplayMetrics: " + "density=" + density + "; densityDPI=" + densityDPI);
        Log.i(TAG, "  DisplayMetrics" + "screenWidth=" + screenWidth + "; screenHeight=" + screenHeight);
    }
}
