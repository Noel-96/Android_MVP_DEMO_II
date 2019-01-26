package com.noel_inc.android_mvp_demo_ii.root;

import com.noel_inc.android_mvp_demo_ii.network.retrofitclient.api_for_more_info.ApiModuleForMoreInfo;
import com.noel_inc.android_mvp_demo_ii.network.retrofitclient.api_for_movie_name.ApiModuleForName;
import com.noel_inc.android_mvp_demo_ii.top_movies.module.TopMoviesModule;
import com.noel_inc.android_mvp_demo_ii.top_movies.view.TopMoviesActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class , ApiModuleForName.class, ApiModuleForMoreInfo.class , TopMoviesModule.class})
public interface ApplicationComponent {


    void inject (TopMoviesActivity target);
}

