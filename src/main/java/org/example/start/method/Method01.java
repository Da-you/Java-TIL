package org.example.start.method;

public class Method01 {
    /*
     - 같은 연산을 두번 수행한다.
     - 계산1, 2가 거의 같다.
     */
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        System.out.println(a + " + " + b + "연산1 수행");
        int sum1 = a + b;
        System.out.println("결과 1 출력:" + sum1);

        int x = 1;
        int y = 2;
        System.out.println(x + " + " + y + "연산2 수행");
        int sum2 = x + y;
        System.out.println("결과 2 출력:" + sum2);
    }

}
