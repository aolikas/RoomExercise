package com.example.roomexercise;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Student {

    @PrimaryKey(autoGenerate = true)
    public long id;

    public String name;

    public int grade;
}
