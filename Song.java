import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Song{

    Scanner scan = new Scanner(db);
    File db = new File("db.txt");
    ArrayList<MeasureInfo> measures = new ArrayLIst<MeasureInfo>();
    String fullLine;
    String[] partialLine;
    int measureNumber = 1;

    SongInfo sang = new SongInfo("Song", measures );
   
    public Song(){
        while (scan.hasNextLine()){
            this.fullLine = scan.readNextLine();
            this.partialLine = fullLine.split(" ");
            String timeSig = this.partialLine[2] + "/" + this.partialLine[3];
            MeasureInfo m = new MeasureInfo(this.measureNumber,Integer.parseInt(this.partialLine[1]),Integer.parseInt(this.partialLine[2]),Integer.parseInt(this.partialLine[3]),timeSig);

            sang.addMeasure(m);

            this.measureNumber +=1;
        }

        System.out.println(sang);

    }


    


}