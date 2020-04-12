package com.codewithme;

public class TestStaticMethod {

    public static void main(String[] args) {


        Student s1=new Student(1,"huan");
        Student s2=new Student(2,"dat");
        s1.change();
        s2.change();
        s1.display();
        s2.display();

    }
}
