package com.example.mxs15.eventreporter;

import android.location.Location;

import org.json.JSONObject;

import java.util.List;

/**
 * Created by mxs15 on 9/14/2017.
 */

public class Test {
    public static void main(String[] args) {
        //Location location = LocationTracker.
        //JSONObject object = LocationTracker.getLocationInfo()
        //JSONObject object = LocationTracker.getLocationInfo(42,-87);
        List<String> res = LocationTracker.getCurrentLocationViaJSON(42,-87);
        for(String x : res) {
            System.out.println(x);
        }
    }
}
