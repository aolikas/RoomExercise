package com.example.roomexercise;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Transaction;

@Dao
public abstract class StudentBookDao {

    @Insert
    public abstract void insertStudent(Student student);

    @Insert
    public abstract void insertBook(Book book);

    @Transaction
    public void insertStudentAndBook(Student student, Book book){
        insertStudent(student);
        insertBook(book);
    }
}
