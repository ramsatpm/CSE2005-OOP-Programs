import java.awt.*;
import java.awt.event.*;
public class ActionEventDemo extends Frame 
{
	ActionEventDemo() 
	{
		setSize(150,80);
		Button b = new Button("ClickMe");
		b.addActionListener(new MyListener());
		add(b);
		setVisible(true);
	}
	public static void main(String args[]) 
	{
		new ActionEventDemo();
	}
}
class MyListener implements ActionListener 
{
	public void actionPerformed(ActionEvent e) 
	{
		// int a = 10, b = 20;
		// Toolkit.getDefaultToolkit().beep();
		System.out.println("Button is Clicked..");
	}
}