# Google-Analytics
> @link: https://firebase.google.com/docs/analytics/
>> - Link: https://firebase.google.com/docs/analytics/android/start/
>> - Setup Firebase (Done)
>> - Sample: https://firebase.google.com/docs/samples/

>> - Open overview: https://console.firebase.google.com/project/ik0012dkkkd/overview <br>
>> Overview in Firebase:
![alt text](https://github.com/danisluis6/Google-Analytics/blob/master/g1.png)
>> <br>Done get file and synchronize
![alt text](https://github.com/danisluis6/Google-Analytics/blob/master/g2.png)

>> Here we go:
>>> - @link: https://www.androidhive.info/2015/08/android-integrating-google-analytics-v4/
>>> - @link: https://developers.google.com/analytics/devguides/collection/android/v4/#set-up-your-project

# Sign in to your Google Analytics account.
![alt text](https://github.com/danisluis6/Google-Analytics/blob/master/g3.png)
=> Link: https://analytics.google.com/analytics/web/provision/?authuser=0#provision/SignUp/

# Configure app
![alt text](https://github.com/danisluis6/Google-Analytics/blob/master/g4.png)

# Overview Dashboard
![alt text](https://github.com/danisluis6/Google-Analytics/blob/master/g5.png)

# Creating Android Project
![alt text](https://github.com/danisluis6/Google-Analytics/blob/master/g6.png)

# Adding Google Analytics
![alt text](https://github.com/danisluis6/Google-Analytics/blob/master/g7.png)
=> compile 'com.google.android.gms:play-services-analytics:10.0.1'

# Create a folder named xml
![alt text](https://github.com/danisluis6/Google-Analytics/blob/master/g7.png)

    <?xml version="1.0" encoding="utf-8"?>
    <resources>
        <!-- End current session if app sleeps for a period of time -->
        <integer name="ga_sessionTimeout">300</integer>

        <!-- Enable automatic Activity measurement -->
        <bool name="ga_autoActivityTracking">true</bool>

        <!--  The property id associated with this analytics tracker -->
        <string name="ga_trackingId">UA-113169160-1</string>

        <string name="ga_sampleFrequency">100.0</string>

        <bool name="ga_reportUncaughtExceptions">true</bool>

        <!--
          See Project Structure -> Analytics -> Google Analytics -> Learn More
          to learn more about configuring this file.
        -->
    </resources>

Make sure that you replaced the ga_trackingId with your tracking ID which we retrieved in above section. This step is very important, otherwise you won’t be able to see the stats on your analytics dashboard.

# Create AnalyticsTrackers.java

# Create MyApplication.java



This call contains below important methods.
trackScreenView() – Function to track screen view (Activity or Fragment).
trackException() – Function to track exceptions using try & catch.
trackEvent() – Function to track event.