import javax.swing.*;
import java.awt.event.*;


public class Standard{
        public static void standard(){
        int framex=400;
        int framey=500;
        JFrame stand = new JFrame();
        JTextField tf = new JTextField();
        tf.setBounds(120,100,150,30);
        tf.setText("Test Text");

        JTextArea instruct = new JTextArea(1,7);
        instruct.setBounds(30,100,60,30);
        instruct.append("Tempo: ");
        
        
        JButton ent3r = new JButton("Start");
        ent3r.setBounds(270, 100, 100, 30);

        ent3r.addActionListener(new ActionListener() {
        //@Override
        public void actionPerformed(ActionEvent e) {
          String testVar = tf.getText();
          tf.setText("Coolio" + testVar);
          Play.beep();
          
      }
    });



        stand.add(instruct);
        stand.add(ent3r);
        stand.add(tf);


    
       
        stand.setSize(framex, framey);
        stand.setLayout(null);
        // make the frame visible
        stand.setVisible(true);
    }



}