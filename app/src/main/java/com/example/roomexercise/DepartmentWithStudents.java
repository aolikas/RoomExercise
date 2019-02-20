package com.example.roomexercise;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;

import java.util.List;

public class DepartmentWithStudents {

    @Embedded
    public Department department;


    @Relation(parentColumn = "id", entityColumn = "department_id", entity = Student.class)
    public List<StudentNameAndGrade> students;
}
