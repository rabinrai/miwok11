/*
package com.example.android.miwok;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    */
/**
     * Handles playback of all the sound files
     *//*

//    private MediaPlayer mMediaPlayer;

    */
/**
     * Handles audio focus when playing a sound file
     *//*

//    private AudioManager mAudioManager;

    */
/*
    *  This listener gets triggered whenever the audio focus changes
    *  (i.e., we gain or lose audio focus because of another app or device).
    *  *//*

   */
/* private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener(){
        @Override
        public void onAudioFocusChange(int focusChange) {
            if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT ||
                    focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
                // The AUDIOFOCUS_LOSS_TRANSIENT case means that we've lost audio focus for a
                // short amount of time. The AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK case means that
                // our app is allowed to continue playing sound but at a lower volume. We'll treat
                // both cases the same way because our app is playing short sound files.
                // Pause playback and reset player to the start of the file. That way, we can
                // play the word from the beginning when we resume playback.
                mMediaPlayer.pause();
                mMediaPlayer.seekTo(0);
            } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                // The AUDIOFOCUS_GAIN case means we have regained focus and can resume playback.
                mMediaPlayer.start();
            } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
                // The AUDIOFOCUS_LOSS case means we've lost audio focus and
                // Stop playback and clean up resources
                releaseMediaPlayer();
            }
        }

        };

    *//*
*/
/**
     * +     * This listener gets triggered when the {@link MediaPlayer} has completed
     * +     * playing the audio file.
     * +
     *//*
*/
/*
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            // Now that the sound file has finished playing, release the media player resources.
            releaseMediaPlayer();
        }
    };*//*


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create and setup the {@link AudioManager} to request audio focus
        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);


        //  Create an array of words
       */
/* String[] words= new String[10];
        words[0]="one";
        words[1]="two";
        words[2]="three";
        words[3]="four";
        words[4]="five";
        words[5]="six";
        words[6]="seven";
        words[7]="eight";
        words[8]="nine";
        words[9]="ten";*//*


        //   Message to display in logcat
        */
/*Log.v("NumbersActivity","word at index 0: "+words[0]);
        Log.v("NumbersActivity","word at index 1: "+words[1]);
        Log.v("NumbersActivity","word at index 2: "+words[2]);
        Log.v("NumbersActivity","word at index 3: "+words[3]);*//*


        // Create an ArrayList of words
        final ArrayList<Word> words = new ArrayList<Word>();

//        words.add("one");
        Word w = new Word(R.drawable.number_one, "one", "एक", R.raw.number_one);
        words.add(w);

//        words.add("two");
        words.add(new Word(R.drawable.number_two, "two", "दुई", R.raw.number_two));
//        words.add("three");
        words.add(new Word(R.drawable.number_three, "three", "तीन", R.raw.number_three));
//        words.add("four");
        words.add(new Word(R.drawable.number_four, "four", "चार", R.raw.number_four));
//        words.add("five");
        words.add(new Word(R.drawable.number_five, "five", "पाँच", R.raw.number_five));
//        words.add("six");
        words.add(new Word(R.drawable.number_six, "six", "छ", R.raw.number_six));
//        words.add("seven");
        words.add(new Word(R.drawable.number_seven, "seven", "सात", R.raw.number_seven));
//        words.add("eight");
        words.add(new Word(R.drawable.number_eight, "eight", "आठ", R.raw.number_eight));

//        words.add("nine");
        words.add(new Word(R.drawable.number_nine, "nine", "नौ", R.raw.number_nine));
//        words.add("ten");
        words.add(new Word(R.drawable.number_ten, "ten", "दस", R.raw.number_ten));

        //        message to display arraylist in logcat
        */
/*Log.v("NumbersActivity", "Word at index 0: " + words.get(0));
        Log.v("NumbersActivity", "Word at index 1: " + words.get(1));
        Log.v("NumbersActivity", "Word at index 2: " + words.get(2));
        Log.v("NumbersActivity", "Word at index 3: " + words.get(3));
        Log.v("NumbersActivity", "Word at index 4: " + words.get(4));
        Log.v("NumbersActivity", "Word at index 5: " + words.get(5));
        Log.v("NumbersActivity", "Word at index 6: " + words.get(6));
        Log.v("NumbersActivity", "Word at index 7: " + words.get(7));
        Log.v("NumbersActivity", "Word at index 8: " + words.get(8));
        Log.v("NumbersActivity", "Word at index 9: " + words.get(9));*//*


        */
/*//*
/ Find the root view so we can add child views to it
        LinearLayout rootView=(LinearLayout)findViewById(R.id.rootView);*//*


        //        using while loop to display the above words
        // Create a variable to keep track of the current index position
       */
/* int index=0;
        while(index<words.size()){
            // Create a new TextView
            TextView wordView= new TextView(this);

            // Set the text to be word at the current index
            wordView.setText(words.get(index));

            // Add this TextView as another child to the root view of this layout
            rootView.addView(wordView);

            // Increment the index variable by 1
            index++;*//*



//       practice for loop
      */
/* for (int x=0; x<words.size(); x++){
           // Create a new TextView
           TextView wordView= new TextView(this);

           // Set the text to be word at the current index
           wordView.setText(words.get(x));

           // Add this TextView as another child to the root view of this layout
           rootView.addView(wordView);*//*



//        Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word
*/
/*        ArrayAdapter<Word> itemsAdapter= new ArrayAdapter<Word>(this,R.layout.list_item, words);*//*


*/
/*Changing ArrayAdapter ti WordAdapter our custom class*//*

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xmlyout file.
      */
/*  GridView gridView=(GridView) findViewById(R.id.list);
        gridView.setAdapter(itemsAdapter);*//*

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                // Get the {@link Word} object at the given position the user clicked on
                Word word = words.get(position);
                // Release the media player if it currently exists because we are about to
                // play a different sound file
                releaseMediaPlayer();

                // Request audio focus for playback
                int result = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener,
                        // Use the music stream.
                        AudioManager.STREAM_MUSIC,
                        // Request permanent focus.
                        AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
//                    We have audio focus now

                    // Create and setup the {@link MediaPlayer} for the audio resource associated
                    // with the current word
                    mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getmAudioResourceId());
                    // Start the audio file
                    mMediaPlayer.start();

                    // Setup a listener on the media player, so that we can stop and release the
                    // media player once the sound has finished playing.
                    mMediaPlayer.setOnCompletionListener(mCompletionListener);
                }
            }
        });


    }

    @Override
    protected void onStop() {
        super.onStop();
        // When the activity is stopped, release the media player resources because we won't
        // be playing any more sounds.
        releaseMediaPlayer();
    }

    */
/**
     * Clean up the media player by releasing its resources.
     *//*

    */
/*private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;


//          Abandon audio focus when playback completes
            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
        }
    }*//*

}

*/
package com.example.android.miwok;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new NumbersFragment())
                .commit();
    }
}