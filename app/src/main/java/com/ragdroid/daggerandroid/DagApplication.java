package com.ragdroid.daggerandroid;

import android.app.Activity;
import android.app.Application;

import com.ragdroid.daggerandroid.dagger.DaggerApplicationComponent;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasDispatchingActivityInjector;

/**
 * Created by garima-fueled on 25/04/17.
 */

public class DagApplication extends Application implements HasDispatchingActivityInjector {

	@Inject DispatchingAndroidInjector<Activity> androidInjector;

	@Override
	public void onCreate() {
		super.onCreate();
		DaggerApplicationComponent.create().inject(this);
	}

	@Override
	public DispatchingAndroidInjector<Activity> activityInjector() {
		return androidInjector;
	}
}
