package com.example.spongebobcounttheburger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class page2 extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        button = (Button)findViewById(R.id.pagebutton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpage3();

            }
        });

    }

    public void openpage3 () {
        Intent intent = new Intent(page2.this, page3.class);
        startActivity(intent);


    }

}