package org.example.basic.oop;


public class MusicPlayerMain4 {
    /*
    절차 지향 방식
    1. 음악 플레이어를 켜고 끌 수 있어야 한다.
    2. 음악 프레이어의 볼륨을 증가, 감소할 수 있어야 한다.
    3. 음악 플레이어의 상태를 확인할 수 있어야 한다.
    */
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        // 음악 플레이어 켜기
        player.on();
        // 볼륨 증가
        player.volumeUp();
        // 볼륨 증가
        player.volumeUp();
        // 볼륨 감소
        player.volumeDown();
        // 플레이어 상태 확인
        player.showStatus();
        // 음악 플레이어 끄기
        player.off();
    }
}
