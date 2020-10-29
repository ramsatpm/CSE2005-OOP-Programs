// Demonstrate JTextField. 
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
   
public class JTextFieldDemo { 

  public JTextFieldDemo() { 
 
    // Set up the JFrame.
    JFrame jfrm = new JFrame("JTextFieldDemo");
    jfrm.setLayout(new FlowLayout());
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jfrm.setBounds(260, 120,200,200); 
 
    // Add a text field to content pane. 
    JTextField jtf = new JTextField(15); 
    jfrm.add(jtf); 

    // Add a label.
    JLabel jlab = new JLabel();
    jfrm.add(jlab);

    // Handle action events.
    jtf.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent ae) { 
        // Show text when user presses ENTER. 
        jlab.setText(jtf.getText()); 
      } 
    }); 

    // Display the frame.
    jfrm.setVisible(true);
  } 

  public static void main(String[] args) { 

    // Create the frame on the event dispatching thread.
    SwingUtilities.invokeLater( 
      new Runnable() { 
        public void run() { 
          new JTextFieldDemo(); 
        } 
      } 
    ); 
  }
}
