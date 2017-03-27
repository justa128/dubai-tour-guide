package com.example.justynagolawska.dubaiguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.ImageView;


public class CategoryDeatailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_deatail);

        //Using the ToolBar as ActionBar
        // Find the toolbar view inside the activity layout
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Getting the intent with the category title and image resource ID for this category
        Intent categoryDetail = getIntent();
        String title = categoryDetail.getStringExtra("categoryTitle");
        int image = categoryDetail.getIntExtra("imageResourceId", 0);

        //Setting the category title onto collapsing toolbar
        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(title);

        //Setting the styles to expanded and collapsed toolbar
        collapsingToolbar.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);
        collapsingToolbar.setCollapsedTitleTextAppearance(R.style.CollapsedAppBar);

        //Setting the category image onto collapsing toolbar
        ImageView imageView = (ImageView) findViewById(R.id.backdrop);
        imageView.setImageResource(image);

        Log.v("my_tag", "category passed title is "+ title);
        Log.v("my_tag", "category passed image is "+ image);


    }
}
