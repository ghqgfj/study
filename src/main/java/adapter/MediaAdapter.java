package adapter;

public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer player;
    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            player = new VlcPlayer();
         } else if (audioType.equalsIgnoreCase("mp4")){
             player = new Mp4Player();
         }
    }
    public void play(String audioType, String fileName) {
       if(audioType.equalsIgnoreCase("vlc")){
           player.playVlc(fileName);
       }else if(audioType.equalsIgnoreCase("mp4")){
           player.playMp4(fileName);
       }        
    }

}
