import java.awt.*;
import javax.swing.*;
public class JProgressBarDemo {
public static void main(String args[]) throws Exception {
JFrame f = new JFrame("Choice Demo");
Container c = f.getContentPane();
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setBounds(200,200,200,100);
f.setLayout(new FlowLayout());
JProgressBar pb= new JProgressBar(0, 100);
// pb.setStringPainted(true);
pb.setIndeterminate(true);
c.add(pb);
f.setVisible(true);
for(int i=0;i<=100;i++) {
pb.setValue(i);
Thread.sleep(100);
}
}
}