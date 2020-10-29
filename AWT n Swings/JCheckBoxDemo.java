// Demonstrate JCheckbox. 
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
   
public class JCheckBoxDemo implements ItemListener { 
  JLabel jlab; 
 
  public JCheckBoxDemo() { 
 
    // Set up the JFrame.
    JFrame jfrm = new JFrame("JCheckBoxDemo");
    jfrm.setLayout(new FlowLayout());
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jfrm.setSize(250, 100); 
 
    // Add check boxes to the content pane. 
    JCheckBox cb = new JCheckBox("C");  
    cb.addItemListener(this); 
    jfrm.add(cb); 
 
    cb = new JCheckBox("C++"); 
    cb.addItemListener(this); 
    jfrm.add(cb); 
 
    cb = new JCheckBox("Java"); 
    cb.addItemListener(this); 
    jfrm.add(cb); 
 
    cb = new JCheckBox("Perl"); 
    cb.addItemListener(this); 
    jfrm.add(cb); 
 
    // Create the label and add it to the content pane. 
    jlab = new JLabel("Select languages"); 
    jfrm.add(jlab); 

    // Display the frame.
    jfrm.setVisible(true);
  } 
 
  // Handle item events for the check boxes. 
  public void itemStateChanged(ItemEvent ie) { 
    JCheckBox cb = (JCheckBox)ie.getItem(); 
 
    if(cb.isSelected()) 
      jlab.setText(cb.getText() + " is selected"); 
    else 
      jlab.setText(cb.getText() + " is cleared"); 
  } 

  public static void main(String[] args) { 

    // Create the frame on the event dispatching thread.
    SwingUtilities.invokeLater( 
      new Runnable() { 
        public void run() { 
          new JCheckBoxDemo(); 
        } 
      } 
    ); 
  }
}
