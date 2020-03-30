import java.util.ArrayList;

public class SongInfo{
  
  
  private String songName;
  /*private*/ static ArrayList<MeasureInfo> measureInfoList; //sorry, I don't have the time right now to get this to work privately right now To do later.
  
  
  public SongInfo(){
    songName = "UnNamed Song";
    measureInfoList = new ArrayList<MeasureInfo>();
  }
  
  public SongInfo(String sn){
    songName = sn;
    measureInfoList = new ArrayList<MeasureInfo>();
  }

  public SongInfo(String sn, ArrayList ar){
    songName = sn;
    measureInfoList = ar;
  }
  
  
  
  //Below are various commands for editing the measures in the ArrayList
  public void addMeasure(){
    measureInfoList.add(new MeasureInfo());
  }
  public void addMeasure(int mn, int mbpm, int nob, int nt, String ts, boolean[] an){
    measureInfoList.add(new MeasureInfo(mn, mbpm, nob, nt, ts, an));
  }
  public MeasureInfo getMeasure(int i){
    return measureInfoList.get(i);
  }
  public MeasureInfo removeMeasure(int i){
    return measureInfoList.remove(i);
  }
  public MeasureInfo setMeasure(int i, int mn, int mbpm, int nob, int nt, String ts, boolean[] an){
    return measureInfoList.set(i, new MeasureInfo(mn, mbpm, nob, nt, ts, an));
  }
  
  
  
  public String toString(){
    return "Song name: " + songName + " | Number of measures: " + measureInfoList.size();
  }
  
}
  
