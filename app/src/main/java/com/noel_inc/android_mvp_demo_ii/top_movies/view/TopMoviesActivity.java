package com.noel_inc.android_mvp_demo_ii.top_movies.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.noel_inc.android_mvp_demo_ii.R;
import com.noel_inc.android_mvp_demo_ii.root.App;
import com.noel_inc.android_mvp_demo_ii.top_movies.TopMovies_MVP;
import com.noel_inc.android_mvp_demo_ii.top_movies.adapter.ListAdapter;
import com.noel_inc.android_mvp_demo_ii.top_movies.model.ViewModel;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TopMoviesActivity extends AppCompatActivity implements TopMovies_MVP.View {


    private  final  String TAG = TopMoviesActivity.class.getName();


    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    @BindView(R.id.listActivity_rootView)
    ViewGroup rootView;

    @Inject
    TopMovies_MVP.Presenter presenter;


    private ListAdapter listAdapter;
    private List<ViewModel> resultList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topmovies_activity);


        ((App) getApplication()).getComponent().inject(this);

        ButterKnife.bind(this);


        listAdapter = new ListAdapter(resultList);
        recyclerView.setAdapter(listAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this ));
    }


    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
        presenter.loadData();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.rxUnsubscribe();
    }

    @Override
    public void updateData(ViewModel viewModel) {

    }

    @Override
    public void showSnackbar(String s) {

    }
}

