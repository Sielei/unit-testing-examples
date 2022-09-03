package com.prj.one;

public class ProjectOne {

    private final String[] strings = {"My", "name", "is", "Hulk"};

    public String[] getStrings() {
        return strings;
    }

    public int add(int a, int b){
        return a + b;
    }

    public Object checkNull(Object obj){
        if (obj != null){
            return obj;
        }
        return null;
    }

    public boolean isGreaterThan(int a, int b){
        return a > b;
    }
}
