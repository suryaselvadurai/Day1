package com.example.suryavalliappan.day1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        Log.v("ActivityA","in");
        Random randomnum = new Random();
        String temp = String.valueOf(randomnum.nextInt(100));
        Log.v("ActivityA", temp);
        TextView activityA_num = findViewById(R.id.activityA_random_num);
        activityA_num.setText(temp);

        Button btnA = findViewById(R.id.activityA_btn);
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,BActivity.class);
                TextView activityA_num = findViewById(R.id.activityA_random_num);
                Bundle b = new Bundle();
                b.putInt("randomnum",Integer.parseInt(activityA_num.getText().toString()));
                intent.putExtras(b);
                startActivity(intent);
                finish();
            }
        });
    }
}
