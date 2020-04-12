package com.codewithme;

public class Student {
    private int rollno;
    private String name;
    private static String colleage="BBD";

    Student(int r,String n){
        this.rollno=r;
        this.name=n;
    }

    static  void change(){
        colleage="EPU";
    }
    void display(){
        System.out.println(rollno+" "+name+" "+ colleage);
    }
}
