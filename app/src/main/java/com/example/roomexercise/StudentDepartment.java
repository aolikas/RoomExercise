package com.example.roomexercise;

import android.arch.persistence.room.ColumnInfo;

public class StudentDepartment {

    public String name;

    public int grade;

    @ColumnInfo(name = "department_name")
    public String departmentName;

}
