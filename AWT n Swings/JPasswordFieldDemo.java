import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JPasswordFieldDemo {
public static void main(String args[]) {
JFrame f = new JFrame("JPasswordField Demo");
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container c = f.getContentPane();
f.setSize(200,80);
c.setLayout(new FlowLayout());
c.add(new JLabel("Password"));
final JPasswordField pf = new JPasswordField(10);
c.add(pf);
pf.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String pw = new String(pf.getPassword());
JOptionPane.showMessageDialog(f,"Password is: " + pw);
}
});
f.setVisible(true);
}
}