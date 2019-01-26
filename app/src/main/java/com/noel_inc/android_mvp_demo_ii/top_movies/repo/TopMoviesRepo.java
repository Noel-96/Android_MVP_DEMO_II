package com.noel_inc.android_mvp_demo_ii.top_movies.repo;

import android.provider.Settings;

import com.noel_inc.android_mvp_demo_ii.network.apimodel.get_topmovies_api.Result;
import com.noel_inc.android_mvp_demo_ii.network.retrofitclient.api_for_more_info.MovieMoreInfoApiService;
import com.noel_inc.android_mvp_demo_ii.network.retrofitclient.api_for_movie_name.MovieApiService;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;

public class TopMoviesRepo implements  Repo{

    private MovieApiService movieApiService;
    private MovieMoreInfoApiService movieMoreInfoApiService;
    private List<String> countries;
    private List<Result> results;
    private long timestamp;

    private static final long STALE_MS = 20*1000; // Data is stale after 20 seconds

    public TopMoviesRepo(MovieApiService movieApiService, MovieMoreInfoApiService movieMoreInfoApiService) {
        this.movieApiService = movieApiService;
        this.movieMoreInfoApiService = movieMoreInfoApiService;
        this.timestamp = System.currentTimeMillis();
        countries = new ArrayList<>();
        results = new ArrayList<>();
    }

    public boolean isUpToDate(){
        return System.currentTimeMillis() - timestamp < STALE_MS;
    }

    @Override
    public Observable<List<Result>> getMoviesFromMemory() {

        if(isUpToDate()){
            return  Observable.fromArray(results);
        } else {
            timestamp = System.currentTimeMillis();
            results.clear();
            return  Observable.empty();
        }
    }

    @Override
    public Observable<Result> getMoviesFromNetwork() {
        return null;
    }

    @Override
    public Observable<String> getCountriesFromMemory() {
        return null;
    }

    @Override
    public Observable<String> getCountriesFromNetwork() {
        return null;
    }

    @Override
    public Observable<String> getCountryData() {
        return null;
    }

    @Override
    public Observable<Result> getResultData() {
        return null;
    }

}
