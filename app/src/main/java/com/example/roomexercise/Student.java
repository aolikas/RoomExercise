package com.example.roomexercise;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverter;
import android.arch.persistence.room.TypeConverters;

import java.util.List;

@Entity
public class Student {

    @PrimaryKey(autoGenerate = true)
    public long id;

    public String name;

    public int grade;

    public long birthday;

  @TypeConverters({HobbiesConverter.class})
  public List<String> hobbies;

    @ColumnInfo(name = "department_id")
    public int departmentId;
}
