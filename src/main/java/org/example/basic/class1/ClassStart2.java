package org.example.basic.class1;

public class ClassStart2 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); // x001
        student1.name = "학생1";
        student1.age = 18;
        student1.grade = 90;

        Student student2;
        student2 = new Student();
        student2.name = "학생2";
        student2.age = 20;
        student2.grade = 40;

        Student[] students = new Student[2];
        students[0] = student1; // 참조 '값' 을 복사해 저장 ex x001
        students[1] = student2;
        for (int i = 0; i < students.length; i++){
            System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);
        }
    }
}
