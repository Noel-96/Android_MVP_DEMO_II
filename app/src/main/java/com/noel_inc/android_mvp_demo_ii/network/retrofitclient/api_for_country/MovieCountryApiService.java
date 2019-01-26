package com.noel_inc.android_mvp_demo_ii.network.retrofitclient.api_for_country;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieCountryApiService {

    @GET("/")
    Observable<OmdbApi> getCountryb (@Query("t") String title);
}
