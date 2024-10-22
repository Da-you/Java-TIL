package org.example.start.cond;

import java.util.Scanner;

public class CondTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력하세요 : ");
        int b = scan.nextInt();
        if(0<=b && b<=100){
            switch((int)(b/10)) {  //스위치문에서 ()에는 조건식이 아니라 조건값이 들어가야함. 따라서, 비교연산자 사용불가
                case 10 :
                case 9 : {
                    System.out.println("A학점");
                    break;
                }
                case 8 : {
                    System.out.println("B학점");
                    break;
                }
                case 7 : {
                    System.out.println("C학점");
                    break;
                }
                case 6 : {
                    System.out.println("D학점");
                    break;
                }
                default :
                    System.out.println("F학점");
            }
        }
        else System.out.println("점수오류 입니다.");
    }

}
