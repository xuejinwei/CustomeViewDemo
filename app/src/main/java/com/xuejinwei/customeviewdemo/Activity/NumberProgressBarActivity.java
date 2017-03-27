package com.xuejinwei.customeviewdemo.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.xuejinwei.customeviewdemo.NumberProgressBar.NumberProgressBar;
import com.xuejinwei.customeviewdemo.NumberProgressBar.OnProgressBarListener;
import com.xuejinwei.customeviewdemo.R;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by xuejinwei on 2017/3/27.
 * Email:xuejinwei@outlook.com
 */

public class NumberProgressBarActivity extends AppCompatActivity implements OnProgressBarListener {
    private Timer timer;

    private NumberProgressBar bnp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_progressbar);

        bnp = (NumberProgressBar) findViewById(R.id.numberbar1);
        bnp.setOnProgressBarListener(this);
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        bnp.incrementProgressBy(1);
                    }
                });
            }
        }, 1000, 100);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.number_progressbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_start) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        timer.cancel();
    }

    @Override
    public void onProgressChange(int current, int max) {
        if (current == max) {
            Toast.makeText(getApplicationContext(), "完成！", Toast.LENGTH_SHORT).show();
            bnp.setProgress(0);
        }
    }
}
