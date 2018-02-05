package com.example.android.miwok;

/**
 * Created by rabinrai on 12/16/2017.
 */

public class Word {
    // Default translation for the word
    private String mDefaultTranslation;

//    Miwok Translation for the word
    private String mMiwokTranslation;


   /* // Drawable resource ID
    private int mImageResourceId;*/

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }

    /**
     * Return the audio resource ID of the word.
     */
    private int mAudioResourceId;

//      Create a constructor with two parameters
    public Word(String defaultTranslation, String miwokTranslation, int AudioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = AudioResourceId;
    }

//    Creating a new word object with the constructor (four parameters)
    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Word(int imageResourceId,String defaultTranslation, String miwokTranslation,int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

//    Get the default Translation of the word
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    //    Get the Miwok Translation of the word
    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }
    /**
     * Get the image resource ID
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
