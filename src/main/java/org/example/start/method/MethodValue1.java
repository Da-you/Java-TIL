package org.example.start.method;

public class MethodValue1 {

    /*
    자바는 항상 변수의 값을 복사해 대입
     */
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1: " + num1); // 5
        changeNumber(num1);
        System.out.println("4. changeNumber 호출 후, num1: " + num1); // 5
    }

    public static void changeNumber(int num2) {
        System.out.println("2. changeNumber 변경 전, num2: " + num2); // 5
        num2 = num2 * 2; //10
        System.out.println("3. changeNumber 변경 후, num2: " + num2); // 10
    }
}
