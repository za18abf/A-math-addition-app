package com.example.spongebobcounttheburger;

import androidx.appcompat.app.AppCompatActivity;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.content.Intent;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;

public class page1 extends AppCompatActivity {
    private ImageButton button;
    Switch aSwitch;
    MediaPlayer mediaPlayer;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aSwitch = (Switch) findViewById(R.id.switch1);
        mediaPlayer=MediaPlayer.create(page1.this,R.raw.lightofhope);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) { // this function initialise the switch to mute/unmute sound
                if (isChecked == true) {
                    mediaPlayer.pause();
                    Toast.makeText(getBaseContext(), "mute", Toast.LENGTH_SHORT).show();
                } else {

                    mediaPlayer.start();
                    Toast.makeText(getBaseContext(), "unmute", Toast.LENGTH_SHORT).show();
                }
            }
        });


            button = (ImageButton) findViewById(R.id.playButton);

            button.setOnClickListener(new View.OnClickListener() {   // this initialise the click property for the play button
                @Override
                public void onClick(View v) {
                    openpage2(v);

                }
            });

        }

        public void openpage2 (View v){ //this function initialise to move from page 1 to page 2
            Intent intent = new Intent(page1.this, page2.class);
            startActivity(intent);
            v.startAnimation(clickplay);
            mediaPlayer.stop();

        }
        private AlphaAnimation clickplay = new AlphaAnimation(1F, 0.5F);


    }

