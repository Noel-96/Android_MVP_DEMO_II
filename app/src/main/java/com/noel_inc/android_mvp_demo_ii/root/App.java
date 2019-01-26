package com.noel_inc.android_mvp_demo_ii.root;

import android.app.Application;

import com.noel_inc.android_mvp_demo_ii.top_movies.module.TopMoviesModule;

public class App  extends Application {

    private  ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this))
                .topMoviesModule(new TopMoviesModule())
                .build();

    }

    public ApplicationComponent getComponent() {
        return component;
    }

}
