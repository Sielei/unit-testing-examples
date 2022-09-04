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

    public void checkForPositive(int num) throws Exception{
        if (num < 0){
            throw new Exception("Number should be greater than or equals to 0");
        }
    }

    public void checkTimeout() throws InterruptedException{
        System.out.println("Initiating sleep sequence.....");
        Thread.sleep(2000);
        System.out.println("System back up.......");
    }
}
