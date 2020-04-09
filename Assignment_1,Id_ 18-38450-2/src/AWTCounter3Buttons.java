
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
 

public class AWTCounter3Buttons extends JFrame {
   private JTextField tfCount;
   private JButton btnCountUp, btnCountDown, btnReset;
   private int count = 0;
 
   // Constructor to setup the GUI components and event handlers
   public AWTCounter3Buttons () {
      setLayout(new FlowLayout());
      add(new Label("Counter"));   // an anonymous instance of Label
      tfCount = new JTextField("0", 10);
      tfCount.setEditable(false);  // read-only
      add(tfCount);                // "super" Frame adds tfCount
 
      btnCountUp = new JButton("Count Up");
      add(btnCountUp);
      // Construct an anonymous instance of an anonymous inner class.
      // The source Button adds the anonymous instance as ActionEvent listener
      btnCountUp.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            ++count;
            tfCount.setText(count + "");
         }
      });
 
      btnCountDown = new JButton("Count Down");
      add(btnCountDown);
      btnCountDown.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            count--;
            tfCount.setText(count + "");
         }
      });
 
      btnReset = new JButton("Reset");
      add(btnReset);
      btnReset.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            count = 0;
            tfCount.setText("0");
         }
      });
 
      setTitle("AWT Counter");
      setSize(400, 100);
      setVisible(true);
   }
 
   // The entry main method
   public static void main(String[] args) {
      new AWTCounter3Buttons();  
   }
}





