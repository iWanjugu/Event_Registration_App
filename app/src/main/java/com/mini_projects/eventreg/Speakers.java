package com.mini_projects.eventreg;


import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Speakers extends Activity {

    private MyCardAdapter adapter = new MyCardAdapter(this,getData());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.speakers);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);
    }

    public static List<CardViewInfo> getData() {
        List<CardViewInfo> data = new ArrayList<>();
        int[] icons = {
                R.drawable.wifi_50,
                R.drawable.arena_50,
                R.drawable.coins_50,
                R.drawable.shuttle_50,
                R.drawable.phone_50,
        };

        String[] names = {
                "WIFI",
                "VENUE",
                "PAYMENT",
                "TRANSPORT",
                "CONTACTS"
        };

        for (int i = 0; i < names.length && i < icons.length; i++) {
            CardViewInfo current = new CardViewInfo();
            current.iconId = icons[i];
            current.title = names[i];
            data.add(current);
        }
        return data;
    }

}


