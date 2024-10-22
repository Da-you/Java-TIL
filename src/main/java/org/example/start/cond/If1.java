package org.example.start.cond;

public class If1 {
/*
if (condition) {
// 조건이 참일 때 실행 코드
    }
 */
    public static void main(String[] args) {
        int age = 20;

        if (age >= 18){
            System.out.println("성인");
        }
        if (age < 18){
            System.out.println("미성년자");
        }
    }

}
