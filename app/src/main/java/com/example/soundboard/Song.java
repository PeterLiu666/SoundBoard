package com.example.soundboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Song {
    private List<Note> song;



    public Song()
    {
        song = new ArrayList<>();
    }

    public void addNote(Note note)
    {
        song.add(note);
    }

    public int getLength()
    {
        return song.size();
    }
    public Note getNote(int location){

        return song.get(location);

    }
    public void clear(){

        song.clear();
    }

}




