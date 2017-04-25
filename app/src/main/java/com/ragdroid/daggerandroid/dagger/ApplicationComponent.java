package com.ragdroid.daggerandroid.dagger;

import com.ragdroid.daggerandroid.DagApplication;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by garima-fueled on 25/04/17.
 */
@Component(modules = {ActivityModule.class, AndroidInjectionModule.class})
public interface ApplicationComponent {
	void inject(DagApplication dagApplication);
}
