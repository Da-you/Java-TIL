package org.example.start.cond;

public class Switch3 {

    /*
    자바 14 이후 새로운 switch
     */
    public static void main(String[] args) {
        int grade = 2;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급 쿠폰 = " + coupon);
    }
}
