// handles audio playback using 'MediaPlayer' from JavaFX
// provides methoeds to load MP3 files, play, pause and stop music 
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class MusicPlayer {
    
    private MediaPlayer mediaPlayer;
    
    public void loadMusic(String filePath) {
        Media media = new Media(filePath);
        mediaPlayer = new MediaPlayer(media);
    }
    
    public void play() {
        mediaPlayer.play();
    }
    
    public void pause() {
        mediaPlayer.pause();
    }
    
    public void stop() {
        mediaPlayer.stop();
    }
}
