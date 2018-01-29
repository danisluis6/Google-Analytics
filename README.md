# Tracking Event
⇒ Take notes:

Event tracking allows us to record any kind of user interaction within the app. The interaction can be anything like button press,
selecting a spinner, swiping gestures, completing game level etc.,

Event tracking accepts four parameters. Category, Action, Label and Value. Below is a simple event example when user presses
the book download button.

![alt text](https://github.com/danisluis6/Google-Analytics/blob/explore_modules_event/g1.png)

Code example:

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
                // Application.tracker().send(new HitBuilders.EventBuilder()
                //        .setCategory("Book")
                //        .setAction("Download")
                //        .setLabel("Track event example")
                //        .build());

                HitBuilders.EventBuilder eventBuilder = new HitBuilders.EventBuilder();
                eventBuilder.setAction("Download").setCategory("Book").setValue(1L).setLabel("Track event example");
                Application.tracker().send(eventBuilder.build());

                Toast.makeText(getApplicationContext(), "Event \'Book\' \'Download\' \'Event example\' is sent. Check it on Google Analytics Dashboard!", Toast.LENGTH_LONG).show();
            }
        });
    }