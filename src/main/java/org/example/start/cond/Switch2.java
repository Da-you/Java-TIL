package org.example.start.cond;

public class Switch2 {

    /*
    switch (조건식) {
        case value1:
            // 조건식의 결과 값이 value1일 때 실행되는 코드
            break;
        case value2:
            // 조건식의 결과 값이 value2일 때 실행되는 코드
            break;
        default:
            // 조건식의 결과 값이 위의 어떤 값에도 해당하지 않을 때 실행되는 코드
        }
     */
    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
                break;
        }
        System.out.println("발급 쿠폰 = " + coupon);
    }
}
