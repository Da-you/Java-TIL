package org.example.start.variable;

public class Var6 {

    public static void main(String[] args) {
        int a;
        //System.out.println(a); // 주석 해제시 컴파일 에러 발생
        // 변수 선언시 메모리상의 스택 공간을 차지하고 사용한다. 해당 공간에기존에 어떤 값이 있었는지 몰라 어떤 값이 호출될지 알 수 없어 이상한 값이 출력 될 수 있다.
        // 이런 문제 예방을 위해 자바는 변수 선언시 초기화를 강제한다.
    }

}
