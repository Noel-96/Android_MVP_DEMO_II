package com.noel_inc.android_mvp_demo_ii.top_movies.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.noel_inc.android_mvp_demo_ii.R;
import com.noel_inc.android_mvp_demo_ii.top_movies.model.ViewModel;

import java.util.List;

public class ListAdapter  extends  RecyclerView.Adapter<ListAdapter.ListItemViewHolder>{


    private List<ViewModel> list;

    public ListAdapter(List<ViewModel> list){
        this.list = list ;
    }



    public static class ListItemViewHolder extends RecyclerView.ViewHolder{

        public TextView titleName;
        public TextView countryName;

        public ListItemViewHolder(@NonNull View itemView) {
            super(itemView);

            titleName = itemView.findViewById(R.id.tv_title);
            countryName = itemView.findViewById(R.id.tv_country);
        }
    }



    @NonNull
    @Override
    public ListItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.movie_list_row , viewGroup, false);
        return new ListItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ListItemViewHolder holder, int i) {

        holder.titleName.setText(list.get(i));
        holder.countryName.setText(list.get(i));


    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
