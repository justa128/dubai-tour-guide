package com.example.justynagolawska.dubaiguideapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;


public class CategoryDeatailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_deatail);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Getting the intent with score for question 1
        Intent categoryDetail = getIntent();
        String title = categoryDetail.getStringExtra("categoryTitle");
        int image = categoryDetail.getIntExtra("imageResourceId", 0);

        TextView txtView = (TextView) findViewById(R.id.testTextView);
        txtView.setText(title);

        ImageView imageView = (ImageView) findViewById(R.id.backdrop);
        imageView.setImageResource(image);

        Log.v("my_tag", "category passed title is "+ title);
        Log.v("my_tag", "category passed image is "+ image);


    }
}
