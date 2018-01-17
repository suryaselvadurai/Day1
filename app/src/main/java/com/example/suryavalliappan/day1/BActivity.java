package com.example.suryavalliappan.day1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class BActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Log.v("ActivityB","in");
        int randomnum = -1;
        Bundle b = getIntent().getExtras();
        if (b!=null)
            randomnum = b.getInt("randomnum");

        Log.v("ActivityB",String.valueOf(randomnum));

        TextView textB = findViewById(R.id.activityB_text_view);
        Button btnB = findViewById(R.id.activityB_btn);

        textB.setText(String.valueOf(randomnum));

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
