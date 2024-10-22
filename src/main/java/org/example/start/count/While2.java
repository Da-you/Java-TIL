package org.example.start.count;

public class While2 {

    /*
    while (조건식) {// 코드}
    1+2+3 을 수행
     */
    public static void main(String[] args) {
     int sum = 0;
     int i =1;
     int endNum = 3;
     while (i <= endNum) {
         sum += i;
         System.out.println("i=" + i + " sum=" + sum);
         i++;
     }
    }
}
