package org.ust.StructualDesignPattern.Adapter.MediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        //Do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing Mp4 files. Name : "+ fileName);
    }
}
