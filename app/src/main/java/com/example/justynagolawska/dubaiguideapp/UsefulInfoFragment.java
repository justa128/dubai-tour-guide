package com.example.justynagolawska.dubaiguideapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class UsefulInfoFragment extends Fragment {


    public UsefulInfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category_list, container, false);

        // Create an ArrayList of Category objects
        final ArrayList<Category> categories = new ArrayList<Category>();
        categories.add(new Category(getString(R.string.wheather), R.drawable.sunset));
        categories.add(new Category(getString(R.string.dress_code), R.drawable.dresscode));
        categories.add(new Category(getString(R.string.alcohol), R.drawable.alcohol_party_dark));
        categories.add(new Category(getString(R.string.ramadan), R.drawable.dubai_at_night));
        categories.add(new Category(getString(R.string.alcohol), R.drawable.dubai_at_night));
        categories.add(new Category(getString(R.string.prices), R.drawable.dubai_at_night));

        // Create an {@link CategoryAdapter}, whose data source is a list of
        // {@link Categories}. The adapter knows how to create list item views for each item
        // in the list.
        CategoryAdapter categoryAdapter = new CategoryAdapter(getActivity(), categories);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(categoryAdapter);


        //Set a click listener on that View
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {

                // Get the Category object at the given position the user clicked on
                Category category = categories.get(position);

                //Getting the category name
                String title = category.getCategoryName();
                // Getting the image resource id for the category
                int imageResourceID = category.getImageResourceId();

                Intent categoryDetail = new Intent(getActivity(), CategoryDeatailActivity.class);
                //Passing the category title to the CategoryDetailActivity
                categoryDetail.putExtra("categoryTitle", title);
                //Passing the image id to the CategoryDetailActivity
                categoryDetail.putExtra("imageResourceId", imageResourceID);
                startActivity(categoryDetail);
            }
        });

        return rootView;
    }

}
