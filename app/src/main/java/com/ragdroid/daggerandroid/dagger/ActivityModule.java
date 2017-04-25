package com.ragdroid.daggerandroid.dagger;

import android.app.Activity;

import com.ragdroid.daggerandroid.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by garima-fueled on 25/04/17.
 */
@Module(subcomponents = {MainActivitySubComponent.class})
public abstract class ActivityModule {


	@Binds
	@IntoMap
	@ActivityKey(MainActivity.class)
	abstract AndroidInjector.Factory<? extends Activity>
			bindYourAcitivityInjectorFactory(MainActivitySubComponent.Builder builder);

}
