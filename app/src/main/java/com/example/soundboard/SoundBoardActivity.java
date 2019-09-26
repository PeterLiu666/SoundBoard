package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SoundBoardActivity extends AppCompatActivity implements View.OnClickListener
{
    private Button bc;
    private Button bd;
    private Button be;
    private Button bf;
    private Button bg;
    private Button ba;
    private Button bb;
    private Button bcc;
    private Button song1;
    private SoundPool sound;
    private Note sc;
    private Note sd;
    private Note se;
    private Note sf;
    private Note sg;
    private Note sa;
    private Note sb;
    private Note scc;
    private Note sdd;
    private Note see;
    private Note sff;
    private Note sgg;
    private Note saa;
    private Note sbb;
    private Note[] notes;

    boolean loaded = false;






    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_board);
        bc = findViewById(R.id.button_A_main);
        bd = findViewById(R.id.button_B_main);
        be = findViewById(R.id.button_C_main);
        bf = findViewById(R.id.button_D_main);
        bg = findViewById(R.id.button_E_main);
        ba = findViewById(R.id.button_F_main);
        bb = findViewById(R.id.button_G_main);
        bcc = findViewById(R.id.button_H_main);
        song1 = findViewById(R.id.button_song1_main);
        sound = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);

        sound.setOnLoadCompleteListener(new OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId,
                                       int status) {
                loaded = true;
            }
        });

        setNotes();




        notes = new Note[]{sc, sd, se, sf, sg, sa, sb, scc, sdd, see, sff, sgg, saa, sbb};








        setListeners();


    }
    private void delay(int time)
    {
        try{
            Thread.sleep(time);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    private void setNotes()
    {
        sc = new Note(sound.load(this, R.raw.scalec, 1), 300);
        sd = new Note(sound.load(this, R.raw.scaled, 1), 300);
        se = new Note(sound.load(this, R.raw.scalee, 1), 300);
        sf = new Note(sound.load(this, R.raw.scalef, 1), 300);
        sg = new Note(sound.load(this, R.raw.scaleg, 1), 300);
        sa = new Note(sound.load(this, R.raw.scalea, 1), 300);
        sb = new Note(sound.load(this, R.raw.scaleb, 1), 300);
        scc = new Note(sound.load(this, R.raw.scalehighc, 1), 300);
        sdd = new Note(sound.load(this, R.raw.scalehighd, 1), 300);
        see = new Note(sound.load(this, R.raw.scalehighe, 1), 300);
        sff = new Note(sound.load(this, R.raw.scalehighf, 1), 300);
        sgg = new Note(sound.load(this, R.raw.scalehighg, 1), 300);
        saa = new Note(sound.load(this, R.raw.scalehigha, 1), 300);
        sbb = new Note(sound.load(this, R.raw.scalehighb, 1), 300);

    }

    private void setListeners()
    {

        bc.setOnClickListener(this);

        bd.setOnClickListener(this);
        be.setOnClickListener(this);
        bf.setOnClickListener(this);
        bg.setOnClickListener(this);
        ba.setOnClickListener(this);
        bb.setOnClickListener(this);
        bcc.setOnClickListener(this);
        song1.setOnClickListener(this);

    }


    @Override
    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.button_A_main:
            {
                AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                float actualVolume = (float) audioManager
                        .getStreamVolume(AudioManager.STREAM_MUSIC);
                float maxVolume = (float) audioManager
                        .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                float volume = actualVolume / maxVolume;
                sound.play(sc.getID(), volume, volume, 1, 0, 1f);
                break;

            }

            case R.id.button_B_main:
            {
                AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                float actualVolume = (float) audioManager
                        .getStreamVolume(AudioManager.STREAM_MUSIC);
                float maxVolume = (float) audioManager
                        .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                float volume = actualVolume / maxVolume;
                sound.play(sd.getID(), volume, volume, 1, 0, 1f);
                break;


            }

            case R.id.button_C_main:
            {
                AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                float actualVolume = (float) audioManager
                        .getStreamVolume(AudioManager.STREAM_MUSIC);
                float maxVolume = (float) audioManager
                        .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                float volume = actualVolume / maxVolume;
                sound.play(se.getID(), volume, volume, 1, 0, 1f);
                break;


            }
            case R.id.button_D_main:
            {
                AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                float actualVolume = (float) audioManager
                        .getStreamVolume(AudioManager.STREAM_MUSIC);
                float maxVolume = (float) audioManager
                        .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                float volume = actualVolume / maxVolume;
                sound.play(sf.getID(), volume, volume, 1, 0, 1f);
                break;


            }
            case R.id.button_E_main:
            {
                AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                float actualVolume = (float) audioManager
                        .getStreamVolume(AudioManager.STREAM_MUSIC);
                float maxVolume = (float) audioManager
                        .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                float volume = actualVolume / maxVolume;
                sound.play(sg.getID(), volume, volume, 1, 0, 1f);
                break;


            }


            case R.id.button_F_main:
            {
                AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                float actualVolume = (float) audioManager
                        .getStreamVolume(AudioManager.STREAM_MUSIC);
                float maxVolume = (float) audioManager
                        .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                float volume = actualVolume / maxVolume;
                sound.play(saa.getID(), volume, volume, 1, 0, 1f);
                break;


            }
            case R.id.button_G_main:
            {
                AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                float actualVolume = (float) audioManager
                        .getStreamVolume(AudioManager.STREAM_MUSIC);
                float maxVolume = (float) audioManager
                        .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                float volume = actualVolume / maxVolume;
                sound.play(sbb.getID(), volume, volume, 1, 0, 1f);
                break;


            }
            case R.id.button_H_main:
            {
                AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                float actualVolume = (float) audioManager
                        .getStreamVolume(AudioManager.STREAM_MUSIC);
                float maxVolume = (float) audioManager
                        .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                float volume = actualVolume / maxVolume;

                break;

            }
            case R.id.button_song1_main:
            {
                AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                float actualVolume = (float) audioManager
                        .getStreamVolume(AudioManager.STREAM_MUSIC);
                float maxVolume = (float) audioManager
                        .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                float volume = actualVolume / maxVolume;

                for(int i = 0; i < notes.length - 3; i++)
                {
                    sound.play(notes[i].getID(), volume, volume, 1, 0, 1f);
                    delay(notes[i].getDelay());
                    delay(40);


                }

                break;




            }

        }


    }
}
