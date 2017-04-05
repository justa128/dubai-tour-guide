package com.example.justynagolawska.dubaiguideapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;

import java.util.ArrayList;

/**
 * Created by justynagolawska on 12/03/2017.
 */


/*
* {@link CategoryAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
* based on a data source, which is a list of {@link Category} objects.
* */
public class CategoryAdapter extends ArrayAdapter<Category> {

    private Context mContext;
    private GoogleMap mMap;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param categories A List of Category objects to display in a list
     */
    public CategoryAdapter(Activity context, ArrayList<Category> categories) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for one TextView and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, categories);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.category_list_item, parent, false);
        }

        // Get the {@link Category} object located at this position in the list
        Category currentCategory = getItem(position);

        // Find the TextView in the category_list_item.xml layout with the ID category_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.category_name);
        // Get the category name from the current Category object and
        // set this text on the nameTextView
        nameTextView.setText(currentCategory.getCategoryName());

        // Find the ImageView in the category_list_item.xml layout with the ID category_image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.category_image);
        // Get the image resource ID from the current Category object and
        // set the image to imageView
        imageView.setImageResource(currentCategory.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }


}
