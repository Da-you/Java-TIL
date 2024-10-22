package org.example.start.method;

public class MethodValue3 {

    /*
    자바는 항상 변수의 값을 복사해 대입
     */
    public static void main(String[] args) {
        int number = 5; // changeNumber 과는 다른 변수
        System.out.println("1. changeNumber 호출 전, number: " + number); // 5
        number = changeNumber(number);
        System.out.println("3. changeNumber 호출 후, number: " + number); // 10
    }

    public static int changeNumber(int number) {
        System.out.println("2. changeNumber 변경 전, number: " + number); // 5
        int res = number * 2; //10
        return res;
    }
}
