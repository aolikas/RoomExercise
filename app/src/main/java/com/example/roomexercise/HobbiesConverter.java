package com.example.roomexercise;

import android.arch.persistence.room.TypeConverter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HobbiesConverter {

    @TypeConverter
    public String fromHobbies(List<String> hobbies) {
        return hobbies.stream().collect(Collectors.joining(","));
    }

    @TypeConverter
    public List<String> toHobbies(String data) {
        return Arrays.asList(data.split(","));
    }
}
