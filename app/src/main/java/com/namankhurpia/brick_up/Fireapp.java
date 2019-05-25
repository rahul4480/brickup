package com.namankhurpia.brick_up;

import android.app.Application;

import com.firebase.client.Firebase;

public class Fireapp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);

    }
}
