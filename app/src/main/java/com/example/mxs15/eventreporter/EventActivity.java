package com.example.mxs15.eventreporter;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class EventActivity extends AppCompatActivity {
    private Fragment mEventFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        if(mEventFragment == null) {
            mEventFragment = new EventsFragment();
        }

        getSupportFragmentManager().beginTransaction().add(R.id.relativelayout_event, mEventFragment).commit();
    }
}
