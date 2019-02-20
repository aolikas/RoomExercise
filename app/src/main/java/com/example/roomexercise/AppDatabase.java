package com.example.roomexercise;

import android.arch.persistence.room.Database;

@Database(entities = {Student.class}, version = 2)
public abstract class AppDatabase {
    public abstract StudentDao studentDao();
}
