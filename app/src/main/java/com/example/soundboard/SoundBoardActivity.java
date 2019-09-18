package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SoundBoardActivity extends AppCompatActivity
{
    private Button a;
    private Button b;
    private Button c;
    private Button d;
    private Button e;
    private Button f;
    private Button g;
    private Button h;
    private SoundPool sound;
    private int sa;
    private int sb;
    private int sc;
    private int sd;
    private int se;
    private int sf;
    private int sg;
    private int sh;

    boolean loaded = false;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_board);
        a = findViewById(R.id.button_A_main);
        b = findViewById(R.id.button_B_main);
        c = findViewById(R.id.button_C_main);
        d = findViewById(R.id.button_D_main);
        e = findViewById(R.id.button_E_main);
        f = findViewById(R.id.button_F_main);
        g = findViewById(R.id.button_G_main);
        h = findViewById(R.id.button_H_main);
        sound = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);

        sound.setOnLoadCompleteListener(new OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId,
                                       int status) {
                loaded = true;
            }
        });
        sa = sound.load(this, R.raw.scalec, 1);
        sb = sound.load(this, R.raw.scaled, 1);
        sc = sound.load(this, R.raw.scalee, 1);
        sd = sound.load(this, R.raw.scalef, 1);
        se = sound.load(this, R.raw.scaleg, 1);
        sf = sound.load(this, R.raw.scalehigha, 1);
        sg = sound.load(this, R.raw.scalehighb, 1);
        sh = sound.load(this, R.raw.scalehighc, 1);






        setListeners();


    }

    private void setListeners()
    {
        a.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                float actualVolume = (float) audioManager
                        .getStreamVolume(AudioManager.STREAM_MUSIC);
                float maxVolume = (float) audioManager
                        .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                float volume = actualVolume / maxVolume;
                sound.play(sa, volume, volume, 1, 0, 1f);

            }
        });
        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                float actualVolume = (float) audioManager
                        .getStreamVolume(AudioManager.STREAM_MUSIC);
                float maxVolume = (float) audioManager
                        .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                float volume = actualVolume / maxVolume;
                sound.play(sb, volume, volume, 1, 0, 1f);

            }
        });
        c.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                float actualVolume = (float) audioManager
                        .getStreamVolume(AudioManager.STREAM_MUSIC);
                float maxVolume = (float) audioManager
                        .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                float volume = actualVolume / maxVolume;
                sound.play(sc, volume, volume, 1, 0, 1f);

            }
        });
        d.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                float actualVolume = (float) audioManager
                        .getStreamVolume(AudioManager.STREAM_MUSIC);
                float maxVolume = (float) audioManager
                        .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                float volume = actualVolume / maxVolume;
                sound.play(sd, volume, volume, 1, 0, 1f);

            }
        });
        e.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                float actualVolume = (float) audioManager
                        .getStreamVolume(AudioManager.STREAM_MUSIC);
                float maxVolume = (float) audioManager
                        .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                float volume = actualVolume / maxVolume;
                sound.play(se, volume, volume, 1, 0, 1f);

            }
        });
        f.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                float actualVolume = (float) audioManager
                        .getStreamVolume(AudioManager.STREAM_MUSIC);
                float maxVolume = (float) audioManager
                        .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                float volume = actualVolume / maxVolume;
                sound.play(sf, volume, volume, 1, 0, 1f);

            }
        });
        g.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                float actualVolume = (float) audioManager
                        .getStreamVolume(AudioManager.STREAM_MUSIC);
                float maxVolume = (float) audioManager
                        .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                float volume = actualVolume / maxVolume;
                sound.play(sg, volume, volume, 1, 0, 1f);

            }
        });
        h.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                float actualVolume = (float) audioManager
                        .getStreamVolume(AudioManager.STREAM_MUSIC);
                float maxVolume = (float) audioManager
                        .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                float volume = actualVolume / maxVolume;
                sound.play(sh, volume, volume, 1, 0, 1f);

            }
        });




    }
}
