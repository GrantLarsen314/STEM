import javax.swing.*;
import java.awt.event.*;
import java.net.*;

public class About{
        public static void about(){
        int framex=400;
        int framey=500;
        JFrame aboutFrame = new JFrame();
        

        JTextArea instruct = new JTextArea(1,7);
        instruct.setBounds(100,5,200,240);
        instruct.append("MetroStorm was created by \n\nTyler Allen\n\nBen Hunt\n\nEthan Jett\n\n" +
        "Grant Larsen");


        aboutFrame.add(instruct);

       
        aboutFrame.setSize(framex, framey);
        aboutFrame.setLayout(null);
        // make the frame visible
        aboutFrame.setVisible(true);
    }



}