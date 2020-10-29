import java.awt.*;
public class CheckBoxGroupDemo {
public static void main(String args[]) {
Frame f = new Frame();
f.setSize(150,100);
f.setLayout(new FlowLayout());
CheckboxGroup cbg = new CheckboxGroup();
f.add(new Checkbox("one", null, false));
f.add(new Checkbox("two", null, true));
f.add(new Checkbox("three", null, false));

Choice c = new Choice();
c.add("Red");
c.add("Blue");
c.add("Green");

f.add(c);
f.setVisible(true);
}
}