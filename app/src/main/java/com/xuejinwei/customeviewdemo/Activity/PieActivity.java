package com.xuejinwei.customeviewdemo.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.xuejinwei.customeviewdemo.Diagram.PieData;
import com.xuejinwei.customeviewdemo.Diagram.PieDiagram;
import com.xuejinwei.customeviewdemo.R;

import java.util.ArrayList;

/**
 * Created by xuejinwei on 2017/3/28.
 * Email:xuejinwei@outlook.com
 */

public class PieActivity extends AppCompatActivity {
    private PieDiagram mPieDiagram;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie);
        mPieDiagram = (PieDiagram) findViewById(R.id.pid);
        ArrayList<PieData> pieDatas = new ArrayList<>();
        pieDatas.add(new PieData("aaa", 20));
        pieDatas.add(new PieData("aaa", 30));
        pieDatas.add(new PieData("aaa", 40));
        pieDatas.add(new PieData("aaa", 50));
        pieDatas.add(new PieData("aaa", 30));
        pieDatas.add(new PieData("aaa", 70));
        mPieDiagram.setData(pieDatas);
    }
}
