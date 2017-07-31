package com.example.khutsomatlala.sowetoapp10;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Khutso Matlala on 7/28/2017.
 */



public class MyViewHolder extends RecyclerView.ViewHolder {



     //Will be found in the model xml
    //Responsibe for displaying

    TextView nameTxt;

    public MyViewHolder(View itemView) {
        super(itemView);

        nameTxt  = itemView.findViewById(R.id.nameTxt);
    }
}
