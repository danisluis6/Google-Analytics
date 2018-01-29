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

# Tracking Activity

⇒ Automatic Screen Tracking
Take a look below:

    <!-- Enable automatic Activity measurement -->
    <bool name="ga_autoActivityTracking">true</bool>

If you set ga_autoActivityTracking to true in app_tracker.xml, all the activities tracking will be automatically. However if you want to keep a name to screen, you need to mention the activity screen name in app_tracker.xml.
If you have multiple activities, you have to mention the screen names for every activity.
 ![alt text](https://github.com/danisluis6/Google-Analytics/blob/explore_modules_activity/g1.png)