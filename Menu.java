import javax.swing.*;
import java.awt.event.*;
  public class Menu{
  public static void menu(){
    // creating instance of JFrame
    JFrame f = new JFrame();

    // creating instance of JButton
    JButton b0 = new JButton("Standard Metronome");
    JButton b1 = new JButton("Specialized Metronome");
    JButton b2 = new JButton("Sound Settings");
    JButton b3 = new JButton("Setup");
    JButton b4 = new JButton("About");
    JButton b5 = new JButton("X");

    // x axis, y axis, width, height
    b0.setBounds(80, 100, 250, 40);
    b1.setBounds(80, 150, 250, 40);
    b2.setBounds(80, 200, 250, 40);
    b3.setBounds(80, 250, 250, 40);
    b4.setBounds(80, 300, 250, 40);
    b5.setBounds(5,5,40,40);

    // add event listener
    b0.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Standard pressed");
        Standard.standard();
      }
    });
    b1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Advanced Pressed");
      }
    });
    b2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Sound Settings Pressed");
      }
    });
        b3.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Setup Pressed");
      }
    });
        b4.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("About Pressed");
        About.about();
      }
    });
        b5.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        
      }
    });



    // add button to JFrame
    f.add(b0);
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    
    f.setSize(400, 500);
    f.setLayout(null);
    // make the frame visible
    f.setVisible(true);
  }
  }