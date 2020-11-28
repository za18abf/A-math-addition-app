package com.example.spongebobcounttheburger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.content.Intent;
import android.view.View;        //for View
import android.widget.ImageButton;
import android.widget.ImageView; // for linking the ImageView object
import android.view.MotionEvent; //for touch and drag event

public class page2 extends AppCompatActivity {
    private Button button;
    private ImageButton imagebutton;
    private View.OnTouchListener handleTouch = new View.OnTouchListener() {
        float dX, dY;

        @Override
        public boolean onTouch(View view, MotionEvent event) {
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
        button = (Button)findViewById(R.id.pagebutton);
        imagebutton = (ImageButton)findViewById(R.id.no_1);
        imagebutton = (ImageButton)findViewById(R.id.no_2);
        imagebutton = (ImageButton)findViewById(R.id.no_3);
        imagebutton = (ImageButton)findViewById(R.id.no_4);
        imagebutton = (ImageButton)findViewById(R.id.no_5);
        imagebutton = (ImageButton)findViewById(R.id.no_6);
        imagebutton = (ImageButton)findViewById(R.id.no_7);
        imagebutton = (ImageButton)findViewById(R.id.no_9);
        ImageView burger = (ImageView) findViewById(R.id.burger1);
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

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpage3(v);

            }
        });

    }

    public void openpage3 (View v) {
        Intent intent = new Intent(page2.this, page3.class);
        startActivity(intent);
        v.startAnimation(clickbutton);

    }
    private AlphaAnimation clickbutton = new AlphaAnimation(1F, 0.5F);

}

