

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

// A Swing application extends from javax.swing.JFrame
public class SwingAdder extends JFrame {
	private JTextField tfNumber1, tfNumber2, tfResult;
	private JButton btnAdd,btnSum, btnMul,btnDiv,btnMod,btnClear;
	private int number1, number2, result;

	// Constructor to set up UI components and event handlers
	public SwingAdder() {
      // Swing components should be added to the content-pane of the JFrame.
      Container cp = getContentPane();
      
      cp.setLayout(new GridLayout(6, 2, 20, 5));
 
      // Components are added from left-to-right, top-to-bottom
      cp.add(new JLabel("First Number "));     
      tfNumber1 = new JTextField(10);
      tfNumber1.setHorizontalAlignment(JTextField.RIGHT);
      cp.add(tfNumber1);  
      
      // at (1, 2)
      cp.add(new JLabel("2nd Number "));
      tfNumber2 = new JTextField(10);
      tfNumber2.setHorizontalAlignment(JTextField.RIGHT);
      cp.add(tfNumber2);
      
      
      cp.add(new JLabel("Result"));
      tfResult = new JTextField(10);
      tfResult.setHorizontalAlignment(JTextField.RIGHT);
      tfResult.setEditable(false);
      cp.add(tfResult);
     // .......

     btnSum = new JButton("SUM");
      cp.add(btnSum);                        
      btnSum.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            number1 = Integer.parseInt(tfNumber1.getText());
            number2 = Integer.parseInt(tfNumber2.getText());
           result = number1-number2;
            tfResult.setText(result + "");
            
           
            
            
         }
      });
 
      
      btnAdd = new JButton("ADD");
      cp.add(btnAdd);                        
      btnAdd.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            number1 = Integer.parseInt(tfNumber1.getText());
            number2 = Integer.parseInt(tfNumber2.getText());
            result = number1+number2;
            tfResult.setText(result + "");
            
         }
      });
 
      btnMul = new JButton("MUL");
      cp.add(btnMul);                         
      btnMul.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            number1 = Integer.parseInt(tfNumber1.getText());
            number2 = Integer.parseInt(tfNumber2.getText());
            result = number1*number2;
            tfResult.setText(result + "");
            
         }
      });
 
      
      
      btnDiv = new JButton("DIV");
      cp.add(btnDiv);                         
      btnDiv.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            number1 = Integer.parseInt(tfNumber1.getText());
            number2 = Integer.parseInt(tfNumber2.getText());
            result = number1/number2;
            tfResult.setText(result + "");
            
         }
      });
      
      btnMod = new JButton("MOD");
      cp.add(btnMod);                         
      btnMod.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            number1 = Integer.parseInt(tfNumber1.getText());
            number2 = Integer.parseInt(tfNumber2.getText());
            result = number1%number2;
            tfResult.setText(result + "");
            
         }
      });
      
      btnClear = new JButton("CLEAR");
      cp.add(btnClear);                                
      btnClear.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
             tfNumber1.setText("");
             tfNumber2.setText("");
             tfResult.setText(""); 
         }
      });
 
      setDefaultCloseOperation(EXIT_ON_CLOSE); // for the "window-close" button
      setTitle("Swing Adder");
      setSize(300, 170);
      setVisible(true);
   }

	//  entry main() method
	public static void main(String[] args) {
		// For thread safety, use the event-dispatching thread to construct UI
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new SwingAdder(); // Let the constructor does the job
			}
		});
	}
}


