import java.awt.*;
public class ListDemo {
public static void main(String args[]) {
String[] colors = {"Red", "Green", "Blue", "Cyan", "Magenta", "Yellow"};
Frame f = new Frame("List Demo");
f.setSize(250,120);
f.setLayout(new FlowLayout());
List lst = new List(4, true);
for(int i=0;i<colors.length;i++)
lst.add(colors[i]);
f.add(new Label("Colors"));
f.add(lst);
f.setVisible(true);
}
}