package org.example.start.array;

import java.util.Scanner;

public class ArrayEx3 {

    /*
    사용자에게 5개의 정수를 입력받아서 배열에 저장하고, 입력받은 순서의 반대인 역순으로 출력하자.
    출력시 출력 포멧은 5, 4, 3, 2, 1과 같이 `,` 쉼표를 사용해서 구분하고, 마지막에는 쉼표를 넣지 않아야 한다.
    실행 결과 예시를 참고하자.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("5개의 정수를 입력하시오");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("입력한 정수를 역순으로 출력:");
        for (int i = 4; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

    }

}
