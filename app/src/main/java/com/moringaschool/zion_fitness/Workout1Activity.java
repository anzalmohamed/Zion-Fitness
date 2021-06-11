package com.moringaschool.zion_fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Workout1Activity extends AppCompatActivity {
    private TextView mLink, mLink2, mLink3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout1);
        mLink = (TextView) findViewById(R.id.link);
        mLink2 = (TextView) findViewById(R.id.link2);
        mLink3 = (TextView) findViewById(R.id.link3);
        if (mLink != null) {
            mLink.setMovementMethod(LinkMovementMethod.getInstance());

              if (mLink2 != null) {
                mLink.setMovementMethod(LinkMovementMethod.getInstance());
            }

            if (mLink3 != null) {
                mLink.setMovementMethod(LinkMovementMethod.getInstance());
            }

        }
    }
}

