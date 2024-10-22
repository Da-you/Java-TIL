package org.example.start.count;

public class DoWhile {

    /*
    최초 한번은 코드 블럭을 반드시 실행시 사용
    do {
        // 코드
    } while (조건식);
     */
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println("현재 숫자는:" + i);
            i++;
        }
        while (i < 3);
    }

}
