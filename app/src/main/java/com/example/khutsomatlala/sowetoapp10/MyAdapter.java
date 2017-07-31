package com.example.khutsomatlala.sowetoapp10;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Khutso Matlala on 7/28/2017.
 */

//inherit from the Recycler View and passing the MyViewHolder

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    ArrayList<String>  placeInfor;

    //Constr
    public MyAdapter(Context context, ArrayList<String> placeInfor) {
        this.context = context;
        this.placeInfor = placeInfor;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //initializing  the view
        View view = LayoutInflater.from(context).inflate(R.layout.model,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        //Displaying the place of the name according position stored
        holder.nameTxt.setText(placeInfor.get(position));

    }

    @Override
    public int getItemCount() {
        return placeInfor.size();
    }
}
