package com.mini_projects.eventreg;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by iWanjugu on 09/11/2015.
 */
public class MyCardAdapter  extends RecyclerView.Adapter<MyCardAdapter.MyViewHolder>{


    private LayoutInflater inflater;

    public LayoutInflater getInflater() {
        return inflater;
    }

    //the arrays of data to be displayed in the cards


    //setting the icon and text into a view
    class MyViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView title;
        ImageView icon;

        public MyViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.card_view);
            icon = (ImageView) itemView.findViewById(R.id.speakerImage);
            title = (TextView) itemView.findViewById(R.id.speakerName);
        }
    }

    List<CardViewInfo> data = Collections.emptyList();

    public MyCardAdapter(Context context, List<CardViewInfo> data){
        inflater = LayoutInflater.from(context);
        this.data = data;
    }


    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    //inflates view into view holder that will be reused for many items
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item, parent, false);
        return new MyViewHolder(view);
    }

    //setting data into the created holder
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        //getting information on the current item
        CardViewInfo current = data.get(position);

        holder.title.setText(current.title);
        holder.icon.setImageResource(current.iconId);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
