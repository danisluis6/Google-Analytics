package io.branch.google_analyticsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.branch.google_analyticsexample.app.Application;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Application.getInstance().trackScreenView("Second Screen");
    }
}
