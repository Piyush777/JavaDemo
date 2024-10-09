package org.ust.StructualDesignPattern.Adapter.MediaPlayer;

public class MediaPlayerDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond_the_horizon.mp3");
        audioPlayer.play("mp4","alone.mp4");
        audioPlayer.play("vlc","far_away.vlc");
        audioPlayer.play("avi","happiness.avi");
    }
}
