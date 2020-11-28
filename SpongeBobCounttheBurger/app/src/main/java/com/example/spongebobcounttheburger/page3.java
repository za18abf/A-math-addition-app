package com.example.spongebobcounttheburger;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageButton;

public class page3 extends AppCompatActivity {
    private ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        button = (ImageButton)findViewById(R.id.replayButton);

        button.setOnClickListener(new View.OnClickListener() {
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

    }
    private AlphaAnimation clickplay = new AlphaAnimation(1F, 0.5F);

}




