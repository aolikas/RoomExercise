package com.example.roomexercise;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Department {

    @PrimaryKey
    public int id;

    public String name;
}
