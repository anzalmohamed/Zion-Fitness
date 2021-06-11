package com.moringaschool.zion_fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EasyActivity extends AppCompatActivity {
    private Button day1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);
        day1 = findViewById(R.id.day1);
    }

    public static class Day1easyActivity extends AppCompatActivity {
private Button mworkout2;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_day1easy);
            mworkout2=findViewById(R.id.workout2);
            mworkout2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(EasyActivity.Day1easyActivity.this, Workout2Activity.class);
                    startActivity(intent);
                    finish();
                }
            });

        }
    }
}