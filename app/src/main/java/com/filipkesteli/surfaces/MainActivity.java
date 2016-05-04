package com.filipkesteli.surfaces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CardView cvSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        setupListeners();
    }

    private void initWidgets() {
        cvSecondActivity = (CardView) findViewById(R.id.cvSecondActivity);
    }

    private void setupListeners() {
        cvSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentGoToSecondActivity();
            }
        });
    }

    private void intentGoToSecondActivity() {
        Intent intent = new Intent(this, FullscreenActivity.class);
        startActivity(intent);
    }
}
