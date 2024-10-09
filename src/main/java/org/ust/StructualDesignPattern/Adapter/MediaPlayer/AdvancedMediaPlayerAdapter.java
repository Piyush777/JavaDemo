package org.ust.StructualDesignPattern.Adapter.MediaPlayer;

public class AdvancedMediaPlayerAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;

    public AdvancedMediaPlayerAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }


    @Override
    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }else {
            System.out.println("Invalid audioType requested");
        }
    }
}
