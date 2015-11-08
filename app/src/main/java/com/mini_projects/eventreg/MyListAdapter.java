package com.mini_projects.eventreg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class MyListAdapter extends ArrayAdapter<String> {

    public MyListAdapter(Context context, String[] values) {
        super(context, R.layout.listview_row_layout_2, values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater listInflater = LayoutInflater.from(getContext());

        View theView = listInflater.inflate(R.layout.listview_row_layout_2,
                parent, false);

        String infoItem = getItem(position);
        TextView theTextView = (TextView) theView.findViewById(R.id.textViewTemplate2);
        theTextView.setText(infoItem);

        ImageView theImageView = (ImageView) theView.findViewById(R.id.imageViewTemplate2);
        theImageView.setImageResource(R.drawable.wifi_50);

        return theView;
    }
}
