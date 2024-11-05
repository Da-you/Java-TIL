package org.example.basic.static1;

public class Data1 {
    public String name;
    public int count;
    // 객체 생성 시 카운트가 중가
    public Data1(String name) {
        this.name = name;
        count++;
    }
}
