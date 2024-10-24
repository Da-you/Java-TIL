package org.example.basic.class1;

import java.sql.PseudoColumnUsage;

public class ClassStart1 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 18;
        student1.grade = 90;
        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
    }
}
