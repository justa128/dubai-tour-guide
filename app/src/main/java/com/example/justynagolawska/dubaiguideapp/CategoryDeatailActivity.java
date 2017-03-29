package com.example.justynagolawska.dubaiguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.ImageView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class CategoryDeatailActivity extends AppCompatActivity implements OnMapReadyCallback {

        private GoogleMap mMap;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_category_deatail);

            //Obtain the SupportMapFragment and get notified when the map is ready to be used.
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);

            //Using the ToolBar as ActionBar
            //Find the toolbar view inside the activity layout
            final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

            //Sets the Toolbar to act as the ActionBar for this Activity window.
            //Make sure the toolbar exists in the activity and is not null
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

            Log.v("my_tag", "category passed title is " + title);
            Log.v("my_tag", "category passed image is " + image);


        }

        @Override
        public void onMapReady(GoogleMap googleMap) {
            mMap = googleMap;

            // Add a marker in Sydney and move the camera
            LatLng sydney = new LatLng(-34, 151);
            mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        }
}
