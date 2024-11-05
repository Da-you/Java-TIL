package org.example.basic.access;

public class SpeakerMain {

    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.volumeDown();

        speaker.volumeUp();
        speaker.volumeDown();

        System.out.println("음량 필드 직접 접근");
        speaker.volume = 200;
        speaker.showVolume();
    }
}
