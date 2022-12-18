package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {

    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();
        for (Map.Entry<String, Integer> set : sourceMap.entrySet()){
            int curKey = set.getKey().length();
            String curVal = set.getKey();

            Set<String> hashMapValue = result.get(curKey);
            if (hashMapValue == null) {
                hashMapValue = new HashSet<>();
                hashMapValue.add(curVal);
                result.put(curKey, hashMapValue);
            }
            else {
                hashMapValue.add(curVal);
            }
        }
        return result;
    }
}
