package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map <Integer, Set <String>> res  = new TreeMap<>();
        for (String str : sourceMap.keySet()){
            int len = str.length();
            if(!res.containsKey(len)) res.put(len, new TreeSet<>());
            res.get(len).add(str);
        }
        return res;
    }
}
