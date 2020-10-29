// Demonstrate an icon-based JButton. 
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
   
public class JButtonDemo implements ActionListener { 
  JLabel jlab; 
 
  public JButtonDemo() { 
 
    // Set up the JFrame.
    JFrame jfrm = new JFrame("JButtonDemo");
    jfrm.setLayout(new FlowLayout());
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jfrm.setSize(500, 450); 
 
    // Add buttons to content pane. 
    ImageIcon hourglass = new ImageIcon("hourglass.png"); 
    JButton jb = new JButton(hourglass); 
    jb.setActionCommand("Hourglass"); 
    jb.addActionListener(this); 
    jfrm.add(jb); 
 
    ImageIcon analog = new ImageIcon("analog.png"); 
    jb = new JButton(analog); 
    jb.setActionCommand("Analog Clock"); 
    jb.addActionListener(this); 
    jfrm.add(jb); 
 
    ImageIcon digital = new ImageIcon("digital.png"); 
    jb = new JButton(digital); 
    jb.setActionCommand("Digital Clock"); 
    jb.addActionListener(this); 
    jfrm.add(jb); 
 
    ImageIcon stopwatch = new ImageIcon("stopwatch.png"); 
    jb = new JButton(stopwatch); 
    jb.setActionCommand("Stopwatch"); 
    jb.addActionListener(this); 
    jfrm.add(jb); 
 
    // Create and add the label to content pane. 
    jlab = new JLabel("Choose a Timepiece"); 
    jfrm.add(jlab); 

    // Display the frame.
    jfrm.setVisible(true);
  } 
 
  // Handle button events. 
  public void actionPerformed(ActionEvent ae) { 
    jlab.setText("You selected " + ae.getActionCommand()); 
  } 

  public static void main(String[] args) { 

    // Create the frame on the event dispatching thread.
    SwingUtilities.invokeLater( 
      new Runnable() { 
        public void run() { 
          new JButtonDemo(); 
        } 
      } 
    ); 
  }
}
