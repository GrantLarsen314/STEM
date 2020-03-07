import java.util.ArrayList;

public class SongInfo{
  
  
  private String songName;
  private ArrayList<MeasureInfo> MeasureInfoList;
  
  
  public SongInfo(){
    songName = "UnNamed Song";
    MeasureInfoList = new ArrayList<MeasureInfo>();
  }
  
  public SongInfo(String sn){
    songName = sn;
    MeasureInfoList = new ArrayList<MeasureInfo>();
  }

  public SongInfo(String sn, ArrayList ar){
    songName = sn;
    MeasureInfoList = ar;
  }
  
  
  
  //Below are various commands for editing the measures in the ArrayList
  public void addMeasure(){
    MeasureInfoList.add(new MeasureInfo());
  }
  public void addMeasure(int mn, int mbpm, int nob, int nt, String ts){
    MeasureInfoList.add(new MeasureInfo(mn, mbpm, nob, nt, ts));
  }
  public MeasureInfo getMeasure(int i){
    return MeasureInfoList.get(i);
  }
  public MeasureInfo removeMeasure(int i){
    return MeasureInfoList.remove(i);
  }
  public MeasureInfo setMeasure(int i, int mn, int mbpm, int nob, int nt, String ts){
    return MeasureInfoList.set(i, new MeasureInfo(mn, mbpm, nob, nt, ts));
  }
  
  
  
  public String toString(){
    return "Song name: " + songName + " | Number of measures: " + MeasureInfoList.size();
  }
  
}
  
