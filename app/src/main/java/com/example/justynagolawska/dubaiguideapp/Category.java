package com.example.justynagolawska.dubaiguideapp;

/**
 * Created by justynagolawska on 12/03/2017.
 */

/**
 * {@link Category} represents a subcategory in Places, Food or Nature main category.
 * Each object has 2 properties: name and image resource ID.
 */
public class Category {

    // Name of category, e.g. Burj Khalifa, SeaView Restaurant
    private String mCategoryName;

    // Drawable resource ID
    private int mImageResourceId;

    /**
    * Create a new Category object.
    *
    * @param cName is the name of the Category, e.g. Burj Khalifa, SeaView Restaurant
    * @param imageResourceId is the drawable resource ID for the image associated with the category name
    *
    */
    public Category(String cName, int imageResourceId) {
        mCategoryName = cName;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of category
     */
    public String getCategoryName() {

        return mCategoryName;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

}
