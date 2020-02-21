import java.util.ArrayList;

public class MeasureInfo{

  private int measureNum;
  private int measurebpm;
  private int numOfBeats;
  private int noteType;
  private String timeSignature;
  
  
  
  //Basic MeasureInfo constructor method
  public MeasureInfo(){
    measureNum = 0;
    measurebpm = 60;
    numOfBeats = 3;
    noteType = 4;
    timeSignature = "3/4";
  //We will need to find a way to parse the input time signiture into its two ints: the number of beats and what beat gets the count.
  //For a minimum viable produce, we can probably ignore the "noteType" until we get the rest of the metronome under control
  }
  //MeasureInfo constructor requiring inputs (probably going to use this a lot more)
  public MeasureInfo(int mn, int mbpm, int nob, int nt, String ts){
    measureNum = mn;
    measurebpm = mbpm;
    numOfBeats = nob;
    noteType = nt;
    timeSignature = ts;
  }
  
  
  
  //Might not use this much but ya neva no
  public String toString(){
    return "Measure Number: " + measureNum + " | Measure bpm: " + measurebpm + " | Number of beats: " + numOfBeats + " | Note that gets the beat: " + noteType + " | Time signature: " + timeSignature;
  }
  
}
    
