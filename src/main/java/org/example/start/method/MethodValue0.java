package org.example.start.method;

public class MethodValue0 {
    /*
    자바는 항상 변수의 값을 복사해 대입
     */
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1;
        num2 = 10;

        System.out.println("num1 = " + num1); // 5
        System.out.println("num2 = " + num2); // 10
    }
}
