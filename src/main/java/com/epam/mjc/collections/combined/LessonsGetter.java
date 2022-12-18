package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {

    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> uniqueLessons = new HashSet<>();
        for(Map.Entry<String, List<String>> set : timetable.entrySet()){
            uniqueLessons.addAll(set.getValue());
        }
        return uniqueLessons;
    }
}
