
import java.util.concurrent.TimeUnit;


public class Main{
    public static void main(String[] args) throws Exception{
        AePlayWave wav = new AePlayWave("clicker.wav");
	wav.start();
	TimeUnit.MINUTES.sleep(1/60);
	wav.start();



    }




}
