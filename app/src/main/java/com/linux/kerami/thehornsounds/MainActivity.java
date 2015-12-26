package com.linux.kerami.thehornsounds;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SeekBar;
import android.widget.Toast;

import com.linux.kerami.thehornsounds.adapter.CustomGridViewAdapter;
import com.linux.kerami.thehornsounds.adapter.Item;


import java.util.ArrayList;

public class MainActivity extends ActionBarActivity {

    GridView gridView;
    ArrayList<Item> gridArray = new ArrayList<Item>();
    CustomGridViewAdapter customGridAdapter;


    private MediaPlayer mediaPlayer;
    private ArrayList<Integer> playlist;
    private double timeElapsed = 0, finalTime = 0;
    private Handler durationHandler = new Handler();
    private SeekBar seekbar;
    private int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        playlist = new ArrayList<>();

        playlist.add(R.raw.s1);
        playlist.add(R.raw.s2);
        playlist.add(R.raw.s3);
        playlist.add(R.raw.s4);
        playlist.add(R.raw.s5);
        playlist.add(R.raw.s6);
        playlist.add(R.raw.s7);
        playlist.add(R.raw.s8);
        playlist.add(R.raw.s9);
        playlist.add(R.raw.s10);
        playlist.add(R.raw.s11);
        playlist.add(R.raw.s12);
        playlist.add(R.raw.s13);
        playlist.add(R.raw.s14);
        playlist.add(R.raw.s15);
        playlist.add(R.raw.s16);
        playlist.add(R.raw.s17);
        playlist.add(R.raw.s18);
        playlist.add(R.raw.s19);
        playlist.add(R.raw.s20);
        playlist.add(R.raw.s21);
        playlist.add(R.raw.s22);
        playlist.add(R.raw.s23);
        playlist.add(R.raw.s24);
        playlist.add(R.raw.s25);
        playlist.add(R.raw.s26);
        playlist.add(R.raw.s27);
        playlist.add(R.raw.s28);
        playlist.add(R.raw.s29);
        playlist.add(R.raw.s30);
        playlist.add(R.raw.s31);
        playlist.add(R.raw.s32);
        playlist.add(R.raw.s33);
        playlist.add(R.raw.s34);
        playlist.add(R.raw.s35);
        playlist.add(R.raw.s36);
        playlist.add(R.raw.s37);
        playlist.add(R.raw.s38);
        playlist.add(R.raw.s39);
        playlist.add(R.raw.s40);
        playlist.add(R.raw.s41);
        playlist.add(R.raw.s42);
        playlist.add(R.raw.s43);
        playlist.add(R.raw.s44);
        playlist.add(R.raw.s45);
        playlist.add(R.raw.s46);
        playlist.add(R.raw.s47);
        playlist.add(R.raw.s48);
        playlist.add(R.raw.s49);
        playlist.add(R.raw.s50);


        mediaPlayer = MediaPlayer.create(this, playlist.get(0));
        finalTime = mediaPlayer.getDuration();
        seekbar = (SeekBar) findViewById(R.id.seekBar);
        seekbar.setMax((int) finalTime);
        seekbar.setClickable(false);


        Bitmap play = BitmapFactory.decodeResource(this.getResources(), R.mipmap.listen);

        // it items added
        for (int i = 1; i < 51 ; i++) {
            gridArray.add(new Item(play,String.valueOf(i)));
        }


        gridView = (GridView) findViewById(R.id.gridView1);
        customGridAdapter = new CustomGridViewAdapter(this, R.layout.row_grid, gridArray);
        gridView.setAdapter(customGridAdapter);



        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                mediaPlayer.reset();
                mediaPlayer = MediaPlayer.create(MainActivity.this, playlist.get(position));

                switch (position) {
                    case 0:
                        check(view);
                    break;
                    case 1:
                        check(view);
                        break;
                    case 2:
                        check(view);
                        break;
                    case 3:
                        check(view);
                        break;
                    case 4:
                        check(view);
                        break;
                    case 5:
                        check(view);
                        break;
                    case 6:
                        check(view);
                        break;
                    case 7:
                        check(view);
                        break;
                    case 8:
                        check(view);
                        break;
                    case 9:
                        check(view);
                        break;

                    case 10:
                        check(view);
                        break;

                    case 11:
                        check(view);
                        break;

                    case 12:
                        check(view);
                        break;

                    case 13:
                        check(view);
                        break;

                    case 14:
                        check(view);
                        break;

                    case 15:
                        check(view);
                        break;

                    case 16:
                        check(view);
                        break;
                    case 17:
                        check(view);
                        break;
                    case 18:
                        check(view);
                        break;
                    case 19:
                        check(view);
                        break;
                    case 20:
                        check(view);
                        break;
                    case 21:
                        check(view);
                        break;
                    case 22:
                        check(view);
                        break;
                    case 23:
                        check(view);
                        break;
                    case 24:
                        check(view);
                        break;
                    case 25:
                        check(view);
                        break;
                    case 26:
                        check(view);
                        break;
                    case 27:
                        check(view);
                        break;
                    case 28:
                        check(view);
                        break;
                    case 29:
                        check(view);
                        break;
                    case 30:
                        check(view);
                        break;
                    case 31:
                        check(view);
                        break;
                    case 32:
                        check(view);
                        break;
                    case 33:
                        check(view);
                        break;
                    case 34:
                        check(view);
                        break;
                    case 35:
                        check(view);
                        break;
                    case 36:
                        check(view);
                        break;
                    case 37:
                        check(view);
                        break;
                    case 38:
                        check(view);
                        break;
                    case 39:
                        check(view);
                        break;
                    case 40:
                        check(view);
                        break;
                    case 41:
                        check(view);
                        break;
                    case 42:
                        check(view);
                        break;
                    case 43:
                        check(view);
                        break;
                    case 44:
                        check(view);
                        break;
                    case 45:
                        check(view);
                        break;
                    case 46:
                        check(view);
                        break;
                    case 47:
                        check(view);
                        break;
                    case 48:
                        check(view);
                        break;
                    case 49:
                        check(view);
                        break;
                    case 50:
                        check(view);
                        break;


                }

            }
        });

    }

    private void check (View view){
        if (mediaPlayer.isPlaying()) {
            pause(view);
        } else {
            play(view);
        }
    }

    public void play(View view) {
        mediaPlayer.start();
        timeElapsed = mediaPlayer.getCurrentPosition();
        seekbar.setProgress((int) timeElapsed);
        durationHandler.postDelayed(updateSeekBarTime, 10);
    }

    private Runnable updateSeekBarTime = new Runnable() {
        public void run() {
            //get current position
            timeElapsed = mediaPlayer.getCurrentPosition();
            //set seekbar progress
            seekbar.setProgress((int) timeElapsed * 2);

            //repeat yourself that again in 100 miliseconds
            durationHandler.postDelayed(this, 100);
        }
    };

    public void pause(View view) {
        mediaPlayer.pause();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.toast_custom_layout,
                    (ViewGroup) findViewById(R.id.toast_layout_root));
            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.BOTTOM, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }


        return super.onOptionsItemSelected(item);
    }
}
