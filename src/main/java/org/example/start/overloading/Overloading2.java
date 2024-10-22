package org.example.start.overloading;

public class Overloading2 {

    public static void main(String[] args) {
        myMethod(1, 1.2);
        myMethod(1.2, 2);
    }

    // 첫 번째 add 메서드: 두 정수를 받아서 합을 반환한다.
    public static void myMethod(int a, double b) {
        System.out.println("int a, double b");
    }

    // 두 번째 add 메서드: 세 정수를 받아서 합을 반환한다.
    // 첫 번째 메서드와 이름은 같지만, 매개변수 목록이 다르다.
    public static void myMethod(double a, int b) {
        System.out.println("double a, int a");
    }
}
