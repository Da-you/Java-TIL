package org.example.basic.construct;

public class MemberConstruct {

    String name;
    int age;
    int grade;
    // 오버로딩된 생성자
    public MemberConstruct(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.grade = 60;
        this(name,age,60); // this() 를 사용해 변경
    }
    // 생성자
    public MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ", age=" + age + ", grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
