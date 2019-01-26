package com.noel_inc.android_mvp_demo_ii.top_movies;

import com.noel_inc.android_mvp_demo_ii.top_movies.model.ViewModel;

import java.util.Observable;

public interface TopMovies_MVP {

    interface  View{

        void updateData(ViewModel viewModel);

        void showSnackbar (String s);
    }


    interface  Presenter{

        void setView(TopMovies_MVP.View view);

        void loadData();

        void rxUnsubscribe();
    }


    interface  Model {
        Observable<ViewModel> result();

    }
}
