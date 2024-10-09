package org.ust.StructualDesignPattern.Adapter.MediaPlayer;

public class AudioPlayer implements MediaPlayer{

    AdvancedMediaPlayerAdapter advancedMediaPlayerAdapter;
    @Override
    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("mp3")){

            System.out.println("Playing mp3 file Name: "+ fileName);
        }else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){

            advancedMediaPlayerAdapter = new AdvancedMediaPlayerAdapter(audioType);
            advancedMediaPlayerAdapter.play(audioType, fileName);
        }else{
            System.out.println("Invalid media. "+ audioType +" format not supported");
        }
    }
}
