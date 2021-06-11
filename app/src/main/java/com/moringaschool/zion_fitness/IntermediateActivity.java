package com.moringaschool.zion_fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntermediateActivity extends AppCompatActivity {
    private Button day1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate);
        day1 = findViewById(R.id.day1);
    }

    public static class Day1intermediateActivity extends AppCompatActivity {
        private Button mworkout3;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_day1intermediate);
            mworkout3=findViewById(R.id.workout3);
            mworkout3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(IntermediateActivity.Day1intermediateActivity.this, Workout3Activity.class);
                    startActivity(intent);
                    finish();
                }
            });
        }
    }
}