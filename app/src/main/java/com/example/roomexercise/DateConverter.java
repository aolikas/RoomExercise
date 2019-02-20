package com.example.roomexercise;

import android.arch.persistence.room.TypeConverter;
import android.util.Log;

import java.util.Date;

public class DateConverter {

    @TypeConverter
    public Long dateToTimeStamp(Date date){
        if(date == null) {
            return null;
        } else {
            return date.getTime();
        }
    }
}
