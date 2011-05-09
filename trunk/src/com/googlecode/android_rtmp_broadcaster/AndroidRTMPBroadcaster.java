package com.googlecode.android_rtmp_broadcaster;

import android.app.Activity;
import android.os.Bundle;

public class AndroidRTMPBroadcaster extends Activity {

  private static final String _LOG_TAG = 'main-activity'

  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState) {
    Log.d(_LOG_TAG, "AndroidRTMPBroadcaster onCreate()");
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
  }
}