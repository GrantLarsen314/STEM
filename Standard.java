import javax.swing.*;
import java.awt.event.*;
import java.net.*;

public class Standard{
        public static void standard(){
        int framex=400;
        int framey=500;
        JFrame stand = new JFrame();
        JTextField tf = new JTextField();
        tf.setBounds(120,100,150,30);
        

        JTextArea instruct = new JTextArea(1,7);
        instruct.setBounds(30,100,60,30);
        instruct.append("Tempo: ");
        
        
        JButton ent3r = new JButton("Start");
        ent3r.setBounds(270, 100, 100, 30);

        JButton stopIt = new JButton("Stop");
        stopIt.setBounds(270, 150, 100, 30);

        ent3r.addActionListener(new ActionListener() {
        //@Override
        public void actionPerformed(ActionEvent e) {
          String testVar = tf.getText();
          Main.exiter = true;
          
         
		      new Thread(() -> {
            try{
              Play.met(Integer.parseInt(testVar));              
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



        stand.add(instruct);
        stand.add(ent3r);
        stand.add(stopIt);
        stand.add(tf);


    
       
        stand.setSize(framex, framey);
        stand.setLayout(null);
        // make the frame visible
        stand.setVisible(true);
    }



}
