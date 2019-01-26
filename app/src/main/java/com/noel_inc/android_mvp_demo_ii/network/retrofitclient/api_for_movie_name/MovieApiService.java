package com.noel_inc.android_mvp_demo_ii.network.retrofitclient.api_for_movie_name;

import com.noel_inc.android_mvp_demo_ii.network.apimodel.get_topmovies_api.TopRated;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApiService {

    @GET("top_rated")
    Observable<TopRated> getTopRatedMovies(@Query("page") Integer page);
}
