package com.example.alcthreeactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchAboutActivity(View view) {
        Log.d(LOG_TAG, "About Button Clicked!");
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    public void launchProfileActivity(View view) {
        Log.d(LOG_TAG, "Profile Activity Clicked!");
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
}
