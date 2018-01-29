# Tracking Fragment
⇒ Automatic Screen Tracking

Another ways to approach GA. Follow code below:
![alt text](https://github.com/danisluis6/Google-Analytics/blob/explore_modules_fragment/g1.png)

=> Configure in Application without file app_tracker.xml

        tracker = analytics.newTracker("UA-113169160-1");

=> Follow code below to tracker ScreenView(Typically HomeActivity in onResume())

    @Override
        public void onCreate() {
            super.onCreate();
            analytics = GoogleAnalytics.getInstance(this);

            // TODO: Replace the tracker-id with your app one from https://www.google.com/analytics/web/
            tracker = analytics.newTracker("UA-113169160-1");

            // Provide unhandled exceptions reports. Do that first after creating the tracker
            tracker.enableExceptionReporting(true);

            // Enable Remarketing, Demographics & Interests reports
            // https://developers.google.com/analytics/devguides/collection/android/display-features
            tracker.enableAdvertisingIdCollection(true);
        }

=> Custom in HomeActivity.java:

        Application.tracker().setScreenName("Home Screen");
        Application.tracker().send(new HitBuilders.ScreenViewBuilder().build());
![alt text](https://github.com/danisluis6/Google-Analytics/blob/explore_modules_fragment/g2.png)

=> Here is link: https://developers.google.com/analytics/devguides/collection/android/v4/sessions