package org.example.start.count;

public class Break1 {

    /*
    문제: 1부터 시작해서 숫자를 계속 누적해서 더하다가 합계가 10보다 처음으로 큰 값은 얼마인가?
    break 는 만나면 그 즉시 while 종료
    while(조건식) {
        코드1;
        break;//즉시 while문 종료로 이동한다.
        코드2;
    }
    코드2는 실행되지 않고 while 종료
    //while문 종료
     */
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (true){
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
            i++;
        }

    }
}
