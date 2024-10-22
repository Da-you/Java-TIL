package org.example.start.array;

import java.util.Scanner;

public class ArrayEx2 {
    /*
    사용자에게 5개의 정수를 입력받아서 배열에 저장하고, 입력 순서대로 출력하자.
    출력시 출력 포멧은 1, 2, 3, 4, 5와 같이 `,` 쉼표를 사용해서 구분하고, 마지막에는 쉼표를 넣지 않아야 한다.
    실행 결과 예시를 참고하자.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("5개의 정수를 입력하시오");
        for (int i = 0; i < numbers.length; i++){
            numbers[i]=  sc.nextInt();
        }
        System.out.println("출력");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);
            if (i < numbers.length - 1){
                System.out.print(", ");
            }
        }

    }

}
