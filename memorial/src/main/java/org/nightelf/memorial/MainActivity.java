package org.nightelf.memorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.nightelf.memorial.adapters.ArrayRecyclerViewAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = findViewById(R.id.recyclerView);
        view.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        RecyclerView.Adapter adapter = new ArrayRecyclerViewAdapter(new String[]{
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
                "item",
        });
        view.setAdapter(adapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
