package com.noel_inc.android_mvp_demo_ii.network.retrofitclient.api_for_country;


import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.noel_inc.android_mvp_demo_ii.network.retrofitclient.api_for_movie_name.MovieApiService;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class ApiModuleForCountry {


    public final String BASE_URL = "http://www.omdbapi.com";

    @Provides
    public OkHttpClient provideClient (){

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        return  new OkHttpClient.Builder().addInterceptor(interceptor).build();
    }

    @Provides
    public Retrofit provideRetrofit(String baseURL, OkHttpClient client){


        return  new Retrofit.Builder()
                .baseUrl(baseURL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }


    @Provides
    public MovieCountryApiService movieCountryApiService(){
        return provideRetrofit(BASE_URL,provideClient()).create(MovieCountryApiService.class);
    }
}
