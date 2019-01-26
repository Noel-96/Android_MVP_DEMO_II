package com.noel_inc.android_mvp_demo_ii.root;

import com.noel_inc.android_mvp_demo_ii.top_movies.view.TopMoviesActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class })
public interface ApplicationComponent {


    void inject (TopMoviesActivity target);
}

