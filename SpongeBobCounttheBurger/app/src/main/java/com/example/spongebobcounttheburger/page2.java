package com.example.spongebobcounttheburger;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.MotionEvent;
import android.widget.TextView;
import android.os.Vibrator;



import java.util.Random;

import javax.sql.StatementEvent;

public class page2 extends AppCompatActivity {


    private ImageButton buttonno0, buttonno1, buttonno2, buttonno3, buttonno4, buttonno5, buttonno6, buttonno7, buttonno8, buttonno9;
    MediaPlayer mediaPlayer;
    private TextView numberleft,numberright,sumofresult;
    private AlphaAnimation clickbutton = new AlphaAnimation(1F, 0.5F);      // this line calls the button animation


    private static int[] arrayno() {        // this function produces random number to the question text
        Random r = new Random();

        int no1;
        int no2;

        do {
            no1 = r.nextInt(10);
            no2 = r.nextInt(10);
        }

        while (no1 + no2 >= 10);        // this line compares the sum of the two random numbers to check whether the sum is more than or equal to 10//

        return new int[] {no1, no2};


    }

    public void wronganswer(){ // this function helps play a sound

        mediaPlayer = MediaPlayer.create(page2.this, R.raw.tryagain);
        mediaPlayer.start();

    }
    public void vibration(){    // this function brings vibration property
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(500);


    }






    private View.OnTouchListener handleTouch = new View.OnTouchListener() {
        float dX, dY;

        @Override
        public boolean onTouch(View view, MotionEvent event) { // this function initialise the drag effect
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    dX = view.getX() - event.getRawX();
                    dY = view.getY() - event.getRawY();
                break;
                case MotionEvent.ACTION_MOVE:
                    view.animate()
                            .x(event.getRawX() + dX)
                            .y(event.getRawY() + dY)
                            .setDuration(0).start();
                break;
                default:
                    return false;
            }return true;
        }
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        int [] array = arrayno();
        final int number_l = array[1];
        final int number_r = array[0];
        final int sum = number_l  + number_r;
        numberleft = (TextView) findViewById(R.id.left_no);
        numberleft.setText(number_l + "");
        numberright = (TextView) findViewById(R.id.right_no);
        numberright.setText(number_r + "");

        buttonno0 = (ImageButton) findViewById(R.id.no_0);
        buttonno1 = (ImageButton) findViewById(R.id.no_1);
        buttonno2 = (ImageButton) findViewById(R.id.no_2);
        buttonno3 = (ImageButton) findViewById(R.id.no_3);
        buttonno4 = (ImageButton) findViewById(R.id.no_4);
        buttonno5 = (ImageButton) findViewById(R.id.no_5);
        buttonno6 = (ImageButton) findViewById(R.id.no_6);
        buttonno7 = (ImageButton) findViewById(R.id.no_7);
        buttonno8 = (ImageButton) findViewById(R.id.no_8);
        buttonno9 = (ImageButton) findViewById(R.id.no_9);

        buttonno0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int noClick = 0;
                v.startAnimation(clickbutton);
                if (noClick == sum) {
                    openpage3(number_l,number_r,sum);

                } else {
                    vibration();
                    wronganswer();


                }
            }
        });
        buttonno1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int noClick = 1;
                v.startAnimation(clickbutton);
                if (noClick == sum) {
                    openpage3(number_l,number_r,sum);

                } else {
                    vibration();
                    wronganswer();
                }
            }
        });
        buttonno2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int noClick = 2;
                v.startAnimation(clickbutton);
                if (noClick == sum) {
                    openpage3(number_l,number_r,sum);

                } else {
                    vibration();
                    wronganswer();

                }
            }
        });
        buttonno3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int noClick = 3;
                v.startAnimation(clickbutton);
                if (noClick == sum) {
                    openpage3(number_l,number_r,sum);

                } else {
                    vibration();
                    wronganswer();

                }
            }
        });
        buttonno4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int noClick = 4;
                v.startAnimation(clickbutton);
                if (noClick == sum) {
                    openpage3(number_l,number_r,sum);

                } else {
                    vibration();
                    wronganswer();

                }
            }
        });
        buttonno5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int noClick = 5;
                v.startAnimation(clickbutton);
                if (noClick == sum) {
                    openpage3(number_l,number_r,sum);

                } else {
                    vibration();
                    wronganswer();

                }
            }
        });
        buttonno6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int noClick = 6;
                v.startAnimation(clickbutton);
                if (noClick == sum) {
                    openpage3(number_l,number_r,sum);

                } else {
                    vibration();
                    wronganswer();

                }
            }
        });
        buttonno7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int noClick = 7;
                v.startAnimation(clickbutton);
                if (noClick == sum) {
                    openpage3(number_l,number_r,sum);

                } else {
                    vibration();
                    wronganswer();

                }
            }
        });
        buttonno8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int noClick = 8;
                v.startAnimation(clickbutton);
                if (noClick == sum) {
                    openpage3(number_l,number_r,sum);

                } else {
                    vibration();
                    wronganswer();

                }
            }
        });
        buttonno9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int noClick = 9;
                v.startAnimation(clickbutton);
                if (noClick == sum) {
                    openpage3(number_l,number_r,sum);

                } else {
                    vibration();
                    wronganswer();

                }
            }
        });



        mediaPlayer = MediaPlayer.create(page2.this, R.raw.applause);


        ImageView burger = (ImageView) findViewById(R.id.burger1);   // these lines of code makes the image view objects draggable
        burger.setOnTouchListener(handleTouch);
        ImageView burger1 = (ImageView) findViewById(R.id.burger2);
        burger1.setOnTouchListener(handleTouch);
        ImageView burger2 = (ImageView) findViewById(R.id.burger3);
        burger2.setOnTouchListener(handleTouch);
        ImageView burger3 = (ImageView) findViewById(R.id.burger2);
        burger3.setOnTouchListener(handleTouch);
        ImageView burger4 = (ImageView) findViewById(R.id.burger4);
        burger4.setOnTouchListener(handleTouch);
        ImageView burger5 = (ImageView) findViewById(R.id.burger5);
        burger5.setOnTouchListener(handleTouch);
        ImageView burger6 = (ImageView) findViewById(R.id.burger6);
        burger6.setOnTouchListener(handleTouch);
        ImageView burger7 = (ImageView) findViewById(R.id.burger7);
        burger7.setOnTouchListener(handleTouch);
        ImageView burger8 = (ImageView) findViewById(R.id.burger8);
        burger8.setOnTouchListener(handleTouch);
        ImageView burger9 = (ImageView) findViewById(R.id.burger9);
        burger9.setOnTouchListener(handleTouch);




    }

    public void openpage3 (int leftno,int rightno,int result ) { // this function initialise to move from page 2 to page 3
        Intent intent = new Intent(page2.this, page3.class);

        Bundle bundle= new Bundle();
        bundle.putInt("first_value",leftno);
        bundle.putInt("second_value",rightno);
        bundle.putInt("answer_value",result);

        intent.putExtras(bundle);
        startActivity(intent);
        mediaPlayer = MediaPlayer.create(page2.this, R.raw.applause);

        mediaPlayer.start();

    }






}

