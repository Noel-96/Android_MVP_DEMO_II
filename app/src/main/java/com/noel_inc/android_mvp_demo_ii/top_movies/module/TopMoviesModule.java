package com.noel_inc.android_mvp_demo_ii.top_movies.module;


import com.noel_inc.android_mvp_demo_ii.network.retrofitclient.api_for_more_info.MovieMoreInfoApiService;
import com.noel_inc.android_mvp_demo_ii.network.retrofitclient.api_for_movie_name.ApiModuleForName;
import com.noel_inc.android_mvp_demo_ii.network.retrofitclient.api_for_movie_name.MovieApiService;
import com.noel_inc.android_mvp_demo_ii.top_movies.TopMovies_MVP;
import com.noel_inc.android_mvp_demo_ii.top_movies.model.TopMoviesModel;
import com.noel_inc.android_mvp_demo_ii.top_movies.presenter.TopMoviesPresenter;
import com.noel_inc.android_mvp_demo_ii.top_movies.repo.Repo;
import com.noel_inc.android_mvp_demo_ii.top_movies.repo.TopMoviesRepo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module( includes = {ApiModuleForName.class})
public class TopMoviesModule {

    @Provides
    public  TopMovies_MVP.Presenter provideTopMoviesActivityPresenter (TopMovies_MVP.Model topmoviesModel){
        return  new TopMoviesPresenter(topmoviesModel);
    }


    @Provides
    public  TopMovies_MVP.Model provideTopMoviesActivityModel (Repo repo){
        return new TopMoviesModel(repo);
    }


    @Singleton
    @Provides
    public  Repo  provideRepo (MovieApiService movieApiService, MovieMoreInfoApiService movieMoreInfoApiService){
        return new TopMoviesRepo(movieApiService,movieMoreInfoApiService);
    }
}
