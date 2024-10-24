package org.example.basic.oop;


public class MusicPlayer {

    int volume = 0;
    boolean isOn = false;

    public void on() {
        isOn = true;
        System.out.println("플레이어 전원 켜기");
    }

    public void off() {
        isOn = false;
        System.out.println("플레이어 전원 끄기");
    }

    public void volumeUp() {
        volume++;
        System.out.println("플레이어 볼륨:" + volume);
    }

    public void volumeDown() {
        volume--;
        System.out.println("플레이어 볼륨:" + volume);
    }

    public void showStatus() {
        System.out.println("상태 확인");
        if (isOn) {
            System.out.println("플레이어 ON, 볼륨:" + volume);
        } else {
            System.out.println("플레이어 OFF");
        }
    }
}
