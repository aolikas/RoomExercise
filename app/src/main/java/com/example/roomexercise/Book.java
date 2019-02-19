package com.example.roomexercise;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(foreignKeys = @ForeignKey(entity = Student.class, parentColumns = "id",
        childColumns = "student_id", onDelete = CASCADE))
public class Book {

    @PrimaryKey(autoGenerate = true)
    public long id;

    public String name;

    public int quantity;

    @ColumnInfo(name = "student_id")
    public long studentId;
}
