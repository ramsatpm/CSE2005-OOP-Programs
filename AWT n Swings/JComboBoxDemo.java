// Demonstrate JComboBox. 
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
   
public class JComboBoxDemo { 
  
  String timepieces[] = { "Hourglass", "Analog", "Digital", "Stopwatch" }; 
 
  public JComboBoxDemo() { 
 
    // Set up the JFrame.
    JFrame jfrm = new JFrame("JCombBoxDemo");
    jfrm.setLayout(new FlowLayout());
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jfrm.setSize(400, 250); 
 
    // Instantiate a combo box and add it to the content pane. 
    JComboBox<String> jcb = new JComboBox<String>(timepieces); 
    jfrm.add(jcb); 
 
    // Create a label and add it to the content pane. 
    JLabel jlab = new JLabel(new ImageIcon("hourglass.png")); 
    jfrm.add(jlab); 

    // Handle selections. 
    jcb.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent ae) { 
        String s = (String) jcb.getSelectedItem(); 
        jlab.setIcon(new ImageIcon(s + ".png")); 
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
          new JComboBoxDemo(); 
        } 
      } 
    ); 
  }
}