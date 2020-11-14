package com.example.spongebobcounttheburger;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class page1 extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.playbutton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpage2();

            }
        });

    }

        public void openpage2 () {
        Intent intent = new Intent(page1.this, page2.class);
        startActivity(intent);


        }




}