package com.noel_inc.android_mvp_demo_ii.top_movies.presenter;

import com.noel_inc.android_mvp_demo_ii.top_movies.TopMovies_MVP;

import rx.Subscription;


public class TopMoviesPresenter implements TopMovies_MVP.Presenter {



    private  TopMovies_MVP.View view;
    private Subscription subscription;
    private  TopMovies_MVP.Model model;

    public TopMoviesPresenter(TopMovies_MVP.Model model) {
        this.model = model;
    }

    @Override
    public void setView(TopMovies_MVP.View view) {
        this.view = view ;
    }

    @Override
    public void loadData() {

        subscription = model.

    }

    @Override
    public void rxUnsubscribe() {

    }
}
