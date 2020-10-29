// Demonstrate JList. 
import javax.swing.*;  
import javax.swing.event.*; 
import java.awt.*; 
import java.awt.event.*; 
   
public class JListDemo { 

  // Create an array of cities. 
  String Cities[] = { "New York", "Chicago", "Houston", 
                      "Denver", "Los Angeles", "Seattle", 
                      "London", "Paris", "New Delhi", 
                      "Hong Kong", "Tokyo", "Sydney" }; 
 
  public JListDemo() { 
 
    // Set up the JFrame.
    JFrame jfrm = new JFrame("JListDemo");
    jfrm.setLayout(new FlowLayout());
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jfrm.setSize(200, 200); 
 
    // Create a JList. 
    JList<String> jlst = new JList<String>(Cities); 
 
    // Set the list selection mode to single-selection. 
    jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
 
    // Add the list to a scroll pane. 
    JScrollPane jscrlp = new JScrollPane(jlst); 
 
    // Set the preferred size of the scroll pane. 
    jscrlp.setPreferredSize(new Dimension(120, 90)); 
 
    // Make a label that displays the selection. 
    JLabel jlab = new JLabel("Choose a City"); 
 
    // Add selection listener for the list. 
    jlst.addListSelectionListener(new ListSelectionListener() {  
      public void valueChanged(ListSelectionEvent le) {  
        // Get the index of the changed item. 
        int idx = jlst.getSelectedIndex(); 
 
        // Display selection, if item was selected. 
        if(idx != -1) 
          jlab.setText("Current selection: " + Cities[idx]); 
        else // Othewise, reprompt. 
          jlab.setText("Choose a City"); 
      }  
    });  
 
    // Add the list and label to the content pane. 
    jfrm.add(jscrlp); 
    jfrm.add(jlab); 

    // Display the frame.
    jfrm.setVisible(true);
  } 

  public static void main(String[] args) { 

    // Create the frame on the event dispatching thread.
    SwingUtilities.invokeLater( 
      new Runnable() { 
        public void run() { 
          new JListDemo(); 
        } 
      } 
    ); 
  }
}