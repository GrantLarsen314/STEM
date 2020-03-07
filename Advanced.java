import javax.swing.*;
import java.awt.event.*;
import java.net.*;

public class Advanced{
        public static void advanced(){
        int framex=400;
        int framey=500;
        JFrame stand = new JFrame();
  
        
        JButton ent3r = new JButton("Start");
        ent3r.setBounds(270, 100, 100, 30);

        JButton stopIt = new JButton("Stop");
        stopIt.setBounds(270, 150, 100, 30);

        ent3r.addActionListener(new ActionListener() {
        //@Override
        public void actionPerformed(ActionEvent e) {
          
          Main.exiter = true;
          
         
		      new Thread(() -> {
            try{
              Play.playAdv();              
            }
            catch(InterruptedException ie){
	          	System.out.println();
}
	          catch(MalformedURLException me){
		          System.out.println();
}
          }).start();
          }

        

    });



        stopIt.addActionListener(new ActionListener() {
        //@Override
        public void actionPerformed(ActionEvent e) {
            Main.exiter = false;
}

    });



       
        stand.add(ent3r);
        stand.add(stopIt);
   


    
       
        stand.setSize(framex, framey);
        stand.setLayout(null);
        // make the frame visible
        stand.setVisible(true);
    }



}
