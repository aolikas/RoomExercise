package com.example.roomexercise;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Transaction;

import java.util.List;

@Dao
public interface DepartmentDao {

    @Transaction
    @Query("SELECT id, name from department")
    List<DepartmentWithStudents> getDepartmentsWithStudents();
}
