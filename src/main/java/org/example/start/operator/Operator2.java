package org.example.start.operator;

public class Operator2 {

    public static void main(String[] args) {
        // 문자열 더하기
        String res1 = "Hello" + "world";
        System.out.println(res1);

        // 문자열과 숫자 더하기
        String res2 = "a + b = " + 10;
        System.out.println(res2);

        // 문자열고 숫자 더하기 2
        int num = 20;
        String str = "a + b = ";
        String res3 = str + num;
        System.out.println(res3);

        // 문자와 숫자를 더하면 숫자를 문자열로 변경한 다음 더한다.
    }

}
