package org.nightelf.memorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button detailBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        detailBtn = findViewById(R.id.detail_btn);
        detailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);
                MainActivity.this.startActivity(detailIntent);
            }
        });
    }
}
