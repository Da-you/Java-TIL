package org.example.start.cond;

/*
7세 이하일 경우: "미취학"
8세 이상 13세 이하일 경우: "초등학생"
14세 이상 16세 이하일 경우: "중학생"
17세 이상 19세 이하일 경우: "고등학생"
20세 이상일 경우: "성인"
 */
public class If3 {
    /*
    if (condition1) {
    // 조건1이 참일 때 실행되는 코드
    } else if (condition2) {
    // 조건1이 거짓이고, 조건2가 참일 때 실행되는 코드
    } else if (condition3) {
    // 조건2이 거짓이고, 조건3이 참일 때 실행되는 코드
    } else {
    // 모든 조건이 거짓일 때 실행되는 코드
    }
     */

    public static void main(String[] args) {
        int age = 14;

        if (age <= 7) {
            System.out.println("미취학");
        } else if (age <= 13) {
            System.out.println("초등학생");
        } else if (age <= 16) {
            System.out.println("중학생");
        } else if (age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }
    }
}
