// Demonstrate JLabel and ImageIcon. 
import java.awt.*; 
import javax.swing.*; 
 
public class JLabelDemo { 
 
   public JLabelDemo() { 

    // Set up the JFrame.
    JFrame jfrm = new JFrame("JLabelDemo");
    jfrm.setLayout(new FlowLayout());
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jfrm.setSize(260, 210);

    // Create an icon. 
    ImageIcon ii = new ImageIcon("hourglass.png"); 
 
    // Create a label. 
    JLabel jl = new JLabel("Hourglass", ii, JLabel.CENTER); 
 
    // Add the label to the content pane. 
    jfrm.add(jl); 

    // Display the frame.
    jfrm.setVisible(true);
  } 

  public static void main(String[] args) { 

    // Create the frame on the event dispatching thread.
    SwingUtilities.invokeLater( 
      new Runnable() { 
        public void run() { 
          new JLabelDemo(); 
        } 
      } 
    ); 
  } 
}
