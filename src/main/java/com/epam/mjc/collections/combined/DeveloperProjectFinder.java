package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {

    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Set<String>> pair : projects.entrySet()){
            if (pair.getValue().contains(developer))
                    result.add(pair.getKey());
        }
        result.sort(Comparator.comparing(String::valueOf).reversed());
        result.sort(Comparator.comparing(String::length).reversed());
        return result;
    }
}
