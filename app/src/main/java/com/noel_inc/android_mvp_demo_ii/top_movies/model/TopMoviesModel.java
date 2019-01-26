package com.noel_inc.android_mvp_demo_ii.top_movies.model;

import com.noel_inc.android_mvp_demo_ii.network.apimodel.get_topmovies_api.Result;
import com.noel_inc.android_mvp_demo_ii.top_movies.TopMovies_MVP;
import com.noel_inc.android_mvp_demo_ii.top_movies.repo.Repo;

import java.util.Observable;

import rx.functions.Func2;

public class TopMoviesModel implements TopMovies_MVP.Model {

    private Repo repo;

    public TopMoviesModel(Repo repo) {
        this.repo = repo;
    }


    @Override
    public Observable<ViewModel> result() {
        return io.reactivex.Observable.zip(repo.getResultData() , repo.getCountryData(), new Func2<Result,String,ViewModel>)
    }
}
