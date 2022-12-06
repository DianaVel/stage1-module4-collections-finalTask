package com.epam.mjc.collections.combined;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set <String> res = new TreeSet<>();
        for (List <String > val : timetable.values()){
            for (String temp : val){
                res.add(temp);
            }
        }
        return  res;
    }
}
