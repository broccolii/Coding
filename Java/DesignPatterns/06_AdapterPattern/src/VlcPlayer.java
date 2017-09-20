/**
 * Created by Broccoli on 2017/9/20.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Play vlc file. Name:"+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
