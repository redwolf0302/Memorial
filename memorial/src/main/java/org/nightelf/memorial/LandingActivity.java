package org.nightelf.memorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class LandingActivity extends Activity {

    private Timer timer = new Timer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
    }

    @Override
    protected void onResume() {
        super.onResume();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent detailIntent = new Intent(LandingActivity.this, MainActivity.class);
                LandingActivity.this.startActivity(detailIntent);
                LandingActivity.this.finish();
            }
        }, 3000l);
    }
}
