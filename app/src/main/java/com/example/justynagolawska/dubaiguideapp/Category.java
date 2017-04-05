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

    // First paragraph for the CategoryDetailActivity
    private String mFirstParagpraph;

    // Google Map longitude coordinate
    private double mLongitude;;

    // Google Map latitude coordinate
    private double mLatitude;

    // Google map location title
    private String mLocationTitle;

    /**
    * Create a new Category object.
    *
    * @param cName is the name of the Category, e.g. Burj Khalifa, SeaView Restaurant
    * @param imageResourceId is the drawable resource ID for the image associated with the category name
    * @param fParagraph is the first paragraph in the activity_category_detail.xml
     * @param longitude is the longitude Google Map coordinate
     * @param latitude is the latitude Google Map coordinate
     * @param locationTitle is the google map location title displaying when clicked on a marker
     *
     *
    */
    public Category(String cName, int imageResourceId, String fParagraph, double latitude, double longitude, String locationTitle) {
        mCategoryName = cName;
        mImageResourceId = imageResourceId;
        mFirstParagpraph = fParagraph;
        mLongitude = longitude;
        mLatitude = latitude;
        mLocationTitle = locationTitle;
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

    /**
     * Get the first paragraph text
     */
    public String getFirstParagraph() {

        return mFirstParagpraph;
    }

    /**
     * Get the longitude of the attraction
     */
    public double getLongitude() {

        return mLongitude;
    }

    /**
     * Get the latitude of the attraction
     */
    public double getLatitude() {

        return mLatitude;
    }

    /**
     * Get the google map location title
     */
    public String getLocationTitle() {

        return mLocationTitle;
    }
}
