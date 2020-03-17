import java.util.ArrayList;

public class MeasureInfo{

  private int measureNum;
  private int measurebpm;
  private int numOfBeats;
  private int noteType;
  private String timeSignature;
  private boolean[] accentedNote;
  
  
  //Basic MeasureInfo constructor method
  public MeasureInfo(){
    measureNum = 0;
    measurebpm = 60;
    numOfBeats = 3;
    noteType = 4;
    timeSignature = "3/4";
    accentedNote = new boolean[3];
  //We will need to find a way to parse the input time signiture into its two ints: the number of beats and what beat gets the count.
  //For a minimum viable produce, we can probably ignore the "noteType" until we get the rest of the metronome under control
  }
  //MeasureInfo constructor requiring inputs (probably going to use this a lot more)
  public MeasureInfo(int mn, int mbpm, int nob, int nt, String ts, boolean[] an){
    measureNum = mn;
    measurebpm = mbpm;
    numOfBeats = nob;
    noteType = nt;
    timeSignature = ts;
    accentedNote = an;
  }
  
  //Gets an assortment of measure stuff
  public int[] getMeasureStuff(){
    int[] measureStuff = new int[2];
    measureStuff[0] = this.numOfBeats;
    measureStuff[1] = this.measurebpm;
    return measureStuff;

  }
  
  //Getters and setters for the accentedNotes array
  //The list works by having the length be equal to the number of beats in the measure
  //and the true values are for accented beats and false is for unaccented
  public boolean getAccentedNoteBoolean(int i){
      return accentedNote[i];
  }
  
  //Gets measure number
  public int getMeasureNum(){
      return measureNum;
  }
  
  //Might not use this much but ya neva no
  public String toString(){
    return "Measure Number: " + measureNum + " | Measure bpm: " + measurebpm + " | Number of beats: " + numOfBeats + " | Note that gets the beat: " + noteType + " | Time signature: " + timeSignature;
  }
  
}
    
