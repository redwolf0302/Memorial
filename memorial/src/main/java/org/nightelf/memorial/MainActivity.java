package org.nightelf.memorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {

    private Timer timer = new Timer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);
                MainActivity.this.startActivity(detailIntent);
                MainActivity.this.finish();
            }
        }, 3000l);
    }
}
