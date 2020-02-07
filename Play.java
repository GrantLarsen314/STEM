import java.applet.*;
import java.io.File;
import java.net.*;

public class Play{

	public static void play() throws InterruptedException,MalformedURLException {

			AudioClip clip = Applet.newAudioClip(new URL("file:clicker(rev).wav"));
			clip.loop();
			//System.out.println("test");
            Thread.sleep(50);
            clip.stop();

	}
	public static void met(double bpm) throws InterruptedException,MalformedURLException {
	do{
	play();
	Thread.sleep((int)(60000.0/bpm));

	} while(Main.exiter);
}
}
