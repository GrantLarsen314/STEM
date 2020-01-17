import java.applet.*;


public class Play{
    AudioClip ac = getAudioClip(getCodeBase(), "clicker.mp3");
    public void beep(){
        ac.play();
    }
}