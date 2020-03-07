import javax.swing.*;
import java.awt.event.*;
import java.net.*;

public class Setup{
        public static void setup(){
        int framex=400;
        int framey=500;
        JFrame stand = new JFrame();
        JTextField tf = new JTextField();
        tf.setBounds(120,100,150,30);
	tf.setText("Measure Tempo.");
        

  	JTextField tf02 = new JTextField();
        tf02.setBounds(120,140,150,30);
	tf02.setText("Time Sig Top");

        JTextField tf03 = new JTextField();
        tf03.setBounds(120,180,150,30);
	tf03.setText("Time Sig Bottom");       


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
              Play.met((double)Integer.parseInt(testVar));              
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
        stand.add(tf);
	stand.add(tf02);
	stand.add(tf03);


    
       
        stand.setSize(framex, framey);
        stand.setLayout(null);
        // make the frame visible
        stand.setVisible(true);
    }



}
