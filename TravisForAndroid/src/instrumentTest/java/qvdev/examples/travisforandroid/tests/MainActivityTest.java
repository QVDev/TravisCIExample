package qvdev.examples.travisforandroid.tests;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

import qvdev.examples.travisforandroid.MainActivity;

/**
 * Created by dirkwilmer on 7/3/13.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    Activity mainActivity = null;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mainActivity = getActivity();

    }

    public void testActivityCreation() {
        assertNotNull("Activity is null, check creating of activity", mainActivity);
    }

}
