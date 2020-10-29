import java.awt.*;
public class GridLayoutDemo1 
{
public static void main(String args[]) 
{
Frame f = new Frame("GridLayout Demo");
Panel p = new Panel();

// f.setLayout(new FlowLayout());
p.setLayout(new GridLayout(3,2));

f.setSize(400,420);

p.add(new Label("Login"));
p.add(new TextField());
p.add(new Label("Password"));
TextField pass = new TextField();
pass.setEchoChar('*');
p.add(pass);
p.add(new Button("OK"));
p.add(new Button("Cancel"));
p.setSize(100,100);

f.add(p, BorderLayout.CENTER);
f.setVisible(true);
}
}