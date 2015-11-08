package com.mini_projects.eventreg;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] values;
    private final Integer[] imgid;

    public MyListAdapter(Activity context, String[] values, Integer[] imgid) {
        super(context, R.layout.listview_row_layout_2, values);

        this.context = context;
        this.values = values;
        this.imgid = imgid;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater listInflater = LayoutInflater.from(getContext());
        View theView = listInflater.inflate(R.layout.listview_row_layout_2,
                null, true);

        //getting the text and icons for the list
        TextView theTextView = (TextView) theView.findViewById(R.id.textViewTemplate2);
        ImageView theImageView = (ImageView) theView.findViewById(R.id.imageViewTemplate2);


        theTextView.setText(values[position]);
        theImageView.setImageResource(imgid[position]);

        return theView;
    }

}
