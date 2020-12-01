package com.example.spongebobcounttheburger;

import androidx.appcompat.app.AppCompatActivity;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageButton;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

public class page3 extends AppCompatActivity {
    private ImageButton button;
    MediaPlayer player;
    ImageView spongebob,patrik;
    TextView text;
    ImageButton replay;
    AlphaAnimation alpha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        spongebob = (ImageView) findViewById(R.id.sponge);
        alpha = new AlphaAnimation(0, 1);                // {   these lines initialise the alpha animation to the various attributes within the page 3
        alpha.setDuration(2500);
        spongebob.startAnimation(alpha);

        patrik = (ImageView) findViewById(R.id.patrick);
        alpha = new AlphaAnimation(0, 1);
        alpha.setDuration(2500);
        patrik.startAnimation(alpha);

        replay = (ImageButton) findViewById(R.id.replayButton);
        alpha = new AlphaAnimation(0, 1);
        alpha.setDuration(2500);
        replay.startAnimation(alpha);

        text = (TextView) findViewById(R.id.textView);
        alpha = new AlphaAnimation(0, 1);
        alpha.setDuration(2500);
        text.startAnimation(alpha);

        button = (ImageButton)findViewById(R.id.replayButton);
        button.setOnClickListener(new View.OnClickListener() {   //  }
            @Override
            public void onClick(View v) {
                openpage2again(v);


            }
        });

    }

    public void openpage2again (View v) {
        Intent intent = new Intent(page3.this, page2.class);
        startActivity(intent);
        v.startAnimation(clickplay);

        player.stop();



    }
    private AlphaAnimation clickplay = new AlphaAnimation(1F, 0.5F);

}




