package com.subbu.flutterapp;

import android.os.Bundle;
import android.widget.Toast;

import io.flutter.app.FlutterActivity;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class MainActivity extends FlutterActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
      Toast.makeText(this, "Testing", Toast.LENGTH_LONG).show();
    GeneratedPluginRegistrant.registerWith(this);

  }
}
