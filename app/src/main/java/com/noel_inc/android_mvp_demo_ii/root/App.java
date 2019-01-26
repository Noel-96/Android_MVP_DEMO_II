package com.noel_inc.android_mvp_demo_ii.root;

import android.app.Application;

import com.noel_inc.android_mvp_demo_ii.network.retrofitclient.api_for_more_info.ApiModuleForMoreInfo;
import com.noel_inc.android_mvp_demo_ii.network.retrofitclient.api_for_movie_name.ApiModuleForName;
import com.noel_inc.android_mvp_demo_ii.top_movies.module.TopMoviesModule;

public class App  extends Application {

    private  ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .topMoviesModule(new TopMoviesModule())
                .apiTopMovies(new ApiModuleForName())
                .apiMoreInfo(new ApiModuleForMoreInfo())
                .build();

    }

    public ApplicationComponent getComponent() {
        return component;
    }

}
