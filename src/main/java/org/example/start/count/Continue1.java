package org.example.start.count;

public class Continue1 {

    /*
    while(조건식) {
        코드1;
        continue;//즉시 조건식으로 이동한다.
        코드2;
    }
     */
    // **문제: 1부터 5까지 숫자를 출력하는데, 숫자가 3일 때는 출력을 건너뛰어야 한다.**
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
