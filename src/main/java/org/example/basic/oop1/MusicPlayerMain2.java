package org.example.basic.oop1;

public class MusicPlayerMain2 {

    /*
    1. 음악 플레이어를 켜고 끌 수 있어야 한다.
    2. 음악 프레이어의 볼륨을 증가, 감소할 수 있어야 한다.
    3. 음악 플레이어의 상태를 확인할 수 있어야 한다.
    */
    public static void main(String[] args) {
        MusicPlayerData player = new MusicPlayerData();

        // 음악 플레이어 켜기
        player.isOn = true;
        System.out.println("플레이어 전원 켜기");

        // 볼륨 증가
        player.volume++;
        System.out.println("플레이어 볼륨:" + player.volume);
        // 볼륨 증가
        player.volume++;
        System.out.println("플레이어 볼륨:" + player.volume);

        // 볼륨 감소
        player.volume--;
        System.out.println("플레이어 볼륨:" + player.volume);

        // 플레이어 상태 확인
        System.out.println("상태 확인");
        if (player.isOn) {
            System.out.println("플레이어 ON, 볼륨:" + player.volume);
        } else {
            System.out.println("플레이어 OFF");
        }

        // 음악 플레이어 끄기
        player.isOn = false;
        System.out.println("플레이어 전원 끄기");
    }
}
