package com.noel_inc.android_mvp_demo_ii.network.retrofitclient.api_for_more_info;

import com.noel_inc.android_mvp_demo_ii.network.apimodel.more_info_api.OmdbApi;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieMoreInfoApiService {

    @GET("/")
    Observable<OmdbApi> getCountry (@Query("t") String title);
}
