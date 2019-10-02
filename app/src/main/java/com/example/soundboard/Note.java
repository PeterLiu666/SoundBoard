package com.example.soundboard;

public class Note
{
    private int soundID;
    private int delay;

    public Note(int id, int delay)
    {
        soundID = id;
        this.delay = delay;

    }

    public int getID()
    {
        return soundID;
    }
    public int getDelay()
    {
        return delay;
    }


}
