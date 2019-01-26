package com.noel_inc.android_mvp_demo_ii.top_movies.repo;

import com.noel_inc.android_mvp_demo_ii.network.apimodel.get_topmovies_api.Result;

import java.util.List;

import io.reactivex.Observable;

public interface Repo {


    Observable<List<Result>> getMoviesFromMemory();

    Observable<Result>getMoviesFromNetwork();

    Observable<String>getCountriesFromMemory();

    Observable<String>getCountriesFromNetwork();

    Observable<String> getCountryData();

    Observable<Result>getResultData();
}
