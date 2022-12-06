package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List <String> res = new ArrayList<>();
        for (String key : projects.keySet()){
            if(projects.get(key).contains(developer)) res.add(key);
        }
        res.sort(new ProjectComparator());
        return res;
    }
}

class ProjectComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if(!(o1 instanceof String && o2 instanceof String)) throw new RuntimeException("Please provide correct parameters");
        String str1 = (String) o1;
        String str2 = (String) o2;
        if(str1.length() > str2.length()){
            return -1;
        } else if (str2.length()>str1.length()){
            return 1;
        }else {
            return str2.compareTo(str1);
        }
    }
}