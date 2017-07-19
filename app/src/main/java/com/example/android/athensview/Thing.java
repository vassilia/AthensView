package com.example.android.athensview;

/**
 * Created by vc on 19/7/2017.
 */

public class Thing {

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * stuff
     */
    private String mStuff;
    /**
     * description
     */
    private String mDescription;

    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create a new Thing object.
     *
     * @param stuff       is the place, or activity you can do in Athens
     * @param description is the description of the stuff
     */
    public Thing(String stuff, String description) {
        mStuff = stuff;
        mDescription = description;

    }

    /**
     * Create a new Thing object.
     *
     * @param stuff           is the place, or activity you can do in Athens
     * @param description     is the description of the stuff
     * @param imageResourceId is the drawable resource ID for the image associated with the thing
     */
    public Thing(String stuff, String description, int imageResourceId) {
        mStuff = stuff;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get stuff
     */
    public String getStuff() {
        return mStuff;
    }

    /**
     * Get description
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
