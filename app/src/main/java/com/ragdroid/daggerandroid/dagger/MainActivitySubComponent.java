package com.ragdroid.daggerandroid.dagger;

import com.ragdroid.daggerandroid.MainActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by garima-fueled on 25/04/17.
 */
@Subcomponent
public interface MainActivitySubComponent extends AndroidInjector<MainActivity> {

	@Subcomponent.Builder
	abstract class Builder extends AndroidInjector.Builder<MainActivity> {}

}
