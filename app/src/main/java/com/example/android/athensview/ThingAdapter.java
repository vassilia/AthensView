package com.example.android.athensview;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vc on 19/7/2017.
 */

public class ThingAdapter extends ArrayAdapter<Thing> {

    private int mColorResourceId;

    /**
     * Create a new {@link ThingAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param things          is the list of {@link Thing}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public ThingAdapter(Context context, ArrayList<Thing> things, int colorResourceId) {
        super(context, 0, things);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Thing} object located at this position in the list
        Thing currentThing = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID stuff
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        // Get the description from the currentThing object and set this text on
        // the Description TextView.
        descriptionTextView.setText(currentThing.getDescription());
        // Find the TextView in the list_item.xml layout with the ID stuff.
        TextView stuffTextView = (TextView) listItemView.findViewById(R.id.stuff_text_view);
        // Get the stuff from the currentThing object and set this text on
        // the stuff TextView.
        stuffTextView.setText(currentThing.getStuff());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentThing.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentThing.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}