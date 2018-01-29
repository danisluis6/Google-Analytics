package io.branch.google_analyticsexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.analytics.HitBuilders;

import io.branch.google_analyticsexample.app.Application;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Application.tracker().setScreenName("Second Screen");
        Application.tracker().send(new HitBuilders.ScreenViewBuilder().build());
    }
}
