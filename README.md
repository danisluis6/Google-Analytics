# Tracking Activity

⇒ Automatic Screen Tracking
Take a look below:

    <!-- Enable automatic Activity measurement -->
    <bool name="ga_autoActivityTracking">true</bool>

If you set ga_autoActivityTracking to true in app_tracker.xml, all the activities tracking will be automatically. However if you want to keep a name to screen, you need to mention the activity screen name in app_tracker.xml.
If you have multiple activities, you have to mention the screen names for every activity.

 ![alt text](https://github.com/danisluis6/Google-Analytics/blob/explore_modules_activity/g1.png)

⇒ Manual Screen Tracking

* Remove:

        <!-- Enable automatic Activity measurement -->
        <bool name="ga_autoActivityTracking">true</bool>

* Change:

        <screenName name="io.branch.google_analyticsexample.HomeActivity">Home Screen</screenName>
        <screenName name="io.branch.google_analyticsexample.SecondActivity">Second Screen</screenName>

    ![alt text](https://github.com/danisluis6/Google-Analytics/blob/explore_modules_activity/g2.png)
    ![alt text](https://github.com/danisluis6/Google-Analytics/blob/explore_modules_activity/g3.png)

