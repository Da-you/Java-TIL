package org.example.start.method;

public class Method02 {
    /*
    모든 메서드는 항상 return 호출이 강제되나 void 는 return 생략이 가능
    자바가 반환 타입이 없는 경우 return을 마지막줄에 넣어서 메서드 실행중 만나면 헤당 메서드는 종료
     */
    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램 동장");
        printFooter();
    }
    public static void printHeader(){
        System.out.println("프로그램 시작");
    }
    public static void printFooter(){
        System.out.println("프로그램 종료");
    }

}
