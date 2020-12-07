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
    TextView text,left_number,right_number,result;
    ImageButton replay;
    AlphaAnimation alpha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        Intent intent = getIntent();
        Bundle bundle= intent.getExtras();           
        int leftclick = bundle.getInt("first_value");
        int rightclick = bundle.getInt("second_value");
        int answerclick = bundle.getInt("answer_value");

        left_number = (TextView) findViewById(R.id.leftnumber);    // these lines display the output
        left_number.setText(leftclick + "");
        right_number = (TextView) findViewById(R.id.rightnumber);
        right_number.setText(rightclick + "");
        result = (TextView)findViewById(R.id.answer);
        result.setText(answerclick + "");
        spongebob = (ImageView) findViewById(R.id.sponge);
        alpha = new AlphaAnimation(0, 1);                // {   these lines initialise the alpha animation to the various attributes within the page 3
        alpha.setDuration(2000);
        spongebob.startAnimation(alpha);

        patrik = (ImageView) findViewById(R.id.patrick);
        alpha = new AlphaAnimation(0, 1);
        alpha.setDuration(2000);
        patrik.startAnimation(alpha);

        replay = (ImageButton) findViewById(R.id.replayButton);
        alpha = new AlphaAnimation(0, 1);
        alpha.setDuration(2000);
        replay.startAnimation(alpha);

        text = (TextView) findViewById(R.id.textView);
        alpha = new AlphaAnimation(0, 1);
        alpha.setDuration(2000);
        text.startAnimation(alpha);

        text = (TextView) findViewById(R.id.leftnumber);
        alpha = new AlphaAnimation(0, 1);
        alpha.setDuration(2000);
        text.startAnimation(alpha);

        text = (TextView) findViewById(R.id.rightnumber);
        alpha = new AlphaAnimation(0, 1);
        alpha.setDuration(2000);
        text.startAnimation(alpha);

        text = (TextView) findViewById(R.id.operator1);
        alpha = new AlphaAnimation(0, 1);
        alpha.setDuration(2000);
        text.startAnimation(alpha);
        text = (TextView) findViewById(R.id.operator2);
        alpha = new AlphaAnimation(0, 1);
        alpha.setDuration(2000);
        text.startAnimation(alpha);
        text = (TextView) findViewById(R.id.answer);
        alpha = new AlphaAnimation(0, 1);
        alpha.setDuration(2000);
        text.startAnimation(alpha);

        button = (ImageButton)findViewById(R.id.replayButton);    
        button.setOnClickListener(new View.OnClickListener() {   // this initialise the click property for the replay button
            @Override
            public void onClick(View v) {
                openpage2again(v);


            }
        });

    }

    public void openpage2again (View v) { // this function initialise to move from page 3 to page 2
        Intent intent = new Intent(page3.this, page2.class);
        startActivity(intent);
        v.startAnimation(clickplay);




    }
    private AlphaAnimation clickplay = new AlphaAnimation(1F, 0.5F);

}




