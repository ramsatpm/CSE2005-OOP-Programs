// Demonstrate JToggleButton. 
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
 
public class JToggleButtonDemo { 
 
  public JToggleButtonDemo() { 
 
    // Set up the JFrame.
    JFrame jfrm = new JFrame("JToggleButtonDemo");
    jfrm.setLayout(new FlowLayout());
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jfrm.setSize(200, 100); 
 
    // Create a label. 
    JLabel jlab = new JLabel("Button is off.");  
 
    // Make a toggle button. 
    JToggleButton jtbn =  new JToggleButton("On/Off"); 
 
    // Add an item listener for the toggle button. 
    jtbn.addItemListener(new ItemListener() { 
      public void itemStateChanged(ItemEvent ie) { 
        if(jtbn.isSelected()) 
          jlab.setText("Button is on."); 
        else 
          jlab.setText("Button is off."); 
      } 
    }); 
  
    // Add the toggle button and label to the content pane.  
    jfrm.add(jtbn);   
    jfrm.add(jlab);  

    // Display the frame.
    jfrm.setVisible(true);
  } 

  public static void main(String[] args) { 

    // Create the frame on the event dispatching thread.
    SwingUtilities.invokeLater( 
      new Runnable() { 
        public void run() { 
          new JToggleButtonDemo(); 
        } 
      } 
    ); 
  }
}
