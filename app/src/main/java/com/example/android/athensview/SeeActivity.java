package com.example.android.athensview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by vc on 19/7/2017.
 */


public class SeeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thing_list);


        // Create a list of things
        final ArrayList<Thing> things = new ArrayList<Thing>();
        things.add(new Thing("red", "weṭeṭṭi", R.drawable.color_red));
        things.add(new Thing("red", "weṭeṭṭi", R.drawable.color_red));
        things.add(new Thing("red", "weṭeṭṭi", R.drawable.color_red));
        things.add(new Thing("red", "weṭeṭṭi", R.drawable.color_red));
        things.add(new Thing("red", "weṭeṭṭi", R.drawable.color_red));
        things.add(new Thing("red", "weṭeṭṭi", R.drawable.color_red));
        things.add(new Thing("red", "weṭeṭṭi", R.drawable.color_red));
        things.add(new Thing("red", "weṭeṭṭi", R.drawable.color_red));
        things.add(new Thing("red", "weṭeṭṭi", R.drawable.color_red));
        things.add(new Thing("red", "weṭeṭṭi", R.drawable.color_red));


        // Create an {@link ThingAdapter}, whose data source is a list of {@link things}s. The
        // adapter knows how to create list items for each item in the list.
        ThingAdapter adapter = new ThingAdapter(this, things, R.color.category_see);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // thing_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ThingAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Thing} in the list.
        listView.setAdapter(adapter);


    }
}

