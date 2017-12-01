package com.johnwatsondev.testandroidplugin300demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by johnwatsondev on 01/12/2017.
 */
public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    AppClassInFree appClassInFree = new AppClassInFree();
    //AppClassInPaid appClassInPaid = new AppClassInPaid();
    AppClassInCommon appClassInDiscount = new AppClassInCommon();
  }
}