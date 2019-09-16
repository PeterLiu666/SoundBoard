package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SoundBoardActivity extends AppCompatActivity
{
    private Button a;
    private Button bb;
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_board);
        a = findViewById(R.id.button_A_main);
        bb = findViewById(R.id.button_BB_main);
        b = findViewById(R.id.button_B_main);


        setListeners();


    }

    private void setListeners()
    {
        a.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

            }
        });
        bb.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

            }
        });
        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

            }
        });




    }
}
