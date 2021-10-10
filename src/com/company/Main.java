package com.company;

public class Main {

    public static void main(String[] args) {
        Student s1=new Student("Arlind","Frakulla","16.12.2003","Albania");

        int times=0;
        while (times<20) {
            int runningYears=0;
            s1.isAlive=true;
            while (s1.isAlive) {
                s1.setAge(runningYears);
                if (Math.random() * 100 < s1.age / 1.5 - 40) {
                    System.out.println(s1.age);
                    s1.isAlive = false;
                }
                runningYears++;
            }
            times++;
        }

    }
}