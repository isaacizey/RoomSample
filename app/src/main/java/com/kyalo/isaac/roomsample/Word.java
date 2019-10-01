package com.kyalo.isaac.roomsample;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;

    @ColumnInfo(name = "location")
    private String mLocation;

    public Word(@NonNull String word, String location) {
        this.mWord = word;
        this.mLocation = location;
    }

    public String getWord() {

        return this.mWord;

    }


    public String getLocation()
    {
        return this.mLocation;
    }


//its basically a normal class with constructors, getters and setters(methods) and variables

}

