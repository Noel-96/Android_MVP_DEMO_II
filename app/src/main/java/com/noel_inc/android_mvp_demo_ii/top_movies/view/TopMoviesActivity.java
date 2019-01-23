package com.noel_inc.android_mvp_demo_ii.top_movies.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.noel_inc.android_mvp_demo_ii.R;
import com.noel_inc.android_mvp_demo_ii.top_movies.TopMovies_MVP;

public class TopMoviesActivity extends AppCompatActivity implements TopMovies_MVP {


    private  final  String TAG = TopMoviesActivity.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topmovies_activity);
    }
}

