package io.branch.google_analyticsexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.analytics.HitBuilders;

import io.branch.google_analyticsexample.app.Application;

public class HomeActivity extends AppCompatActivity {

    private static String TAG = HomeActivity.class.getSimpleName();

    private Toolbar mToolbar;

    private Button btnSecondScreen, btnSendEvent, btnException, btnAppCrash, btnLoadFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.toolbar);
        btnSecondScreen = findViewById(R.id.btnSecondScreen);
        btnSendEvent = findViewById(R.id.btnSendEvent);
        btnException = findViewById(R.id.btnException);
        btnAppCrash = findViewById(R.id.btnAppCrash);
        btnLoadFragment = findViewById(R.id.btnLoadFragment);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        /**
         * Launching another activity to track the other screen
         */
        btnSecondScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        /**
         * Event tracking
         * Event(Category, Action, Label)
         */
        btnSendEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Tracking Event
                // MyApplication.getInstance().trackEvent("Book", "Download", "Track event example");

                // Get tracker.
                // Build and send an Event.
//                Application.tracker().send(new HitBuilders.EventBuilder()
//                        .setCategory("Book")
//                        .setAction("Download")
//                        .setLabel("Track event example")
//                        .build());

                HitBuilders.EventBuilder eventBuilder = new HitBuilders.EventBuilder();
                eventBuilder.setAction("Download").setCategory("Book").setValue(1L).setLabel("Track event example");
                Application.tracker().send(eventBuilder.build());

                Toast.makeText(getApplicationContext(), "Event \'Book\' \'Download\' \'Event example\' is sent. Check it on Google Analytics Dashboard!", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Application.tracker().setScreenName("Home Screen");
        Application.tracker().send(new HitBuilders.ScreenViewBuilder().build());
    }
}
