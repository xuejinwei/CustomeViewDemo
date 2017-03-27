package com.xuejinwei.customeviewdemo.Activity;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.xuejinwei.customeviewdemo.Credit.NewCreditSesameView;
import com.xuejinwei.customeviewdemo.R;

/**
 * Created by xuejinwei on 2017/3/27.
 * Email:xuejinwei@outlook.com
 */

public class CreditActivity extends AppCompatActivity {
    private final int[] mColors = new int[]{
            0xFFFF80AB,
            0xFFFF4081,
            0xFFFF5177,
            0xFFFF7997
    };
    private Button              mButton;
    private NewCreditSesameView newCreditSesameView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit);
        mButton = (Button) findViewById(R.id.btn);
        newCreditSesameView = (NewCreditSesameView) findViewById(R.id.sesame_view);
        mButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                newCreditSesameView.setSesameValues(639);
                startColorChangeAnim();
            }
        });
    }

    public void startColorChangeAnim() {

        ObjectAnimator animator = ObjectAnimator.ofInt(newCreditSesameView, "backgroundColor", mColors);
        animator.setDuration(3000);
        animator.setEvaluator(new ArgbEvaluator());
        animator.start();
    }
}
