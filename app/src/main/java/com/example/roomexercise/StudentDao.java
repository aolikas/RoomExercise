package com.example.roomexercise;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface StudentDao {

    @Query("SELECT * FROM student")
    LiveData<List<Student>>  getAll();

    @Query("SELECT * FROM student WHERE id = :id")
    Student getById(long id);

    @Query("SELECT * FROM student WHERE grade > :minGrade")
    List<Student> getAllWithGradeMoreThan(int minGrade);

    @Query("SELECT * FROM student WHERE grade BETWEEN :minGrade AND :maxGrade")
    List<Student> getAllWithGradeBetween(int minGrade, int maxGrade);

    @Query("SELECT * FROM student WHERE name LIKE :search")
    List<Student> getAllWithNameLike(String search);

    @Query("SELECT * FROM student WHERE id IN (:idList)")
    List<Student> getByIdList(List<Long> idList);

    @Query("UPDATE student SET grade = :newGrade WHERE id IN (:idList)")
    int updateGradeByIdList(List<Long> idList, int newGrade);

    @Query("DELETE * FROM student WHERE id IN (:idList)")
    int deleteByIdList(List<Long> idList);


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Student student);

    @Update
    void update(List<Student> students);

    @Delete
    void delete(Student student);


}
