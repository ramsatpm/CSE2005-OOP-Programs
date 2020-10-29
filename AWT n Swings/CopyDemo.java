import java.awt.*;
import java.awt.event.*;
public class CopyDemo extends Frame 
{
	TextField t1 = new TextField(), t2 = new TextField();
	CopyDemo() 
	{
		setSize(150,80);
		setLayout(new FlowLayout());
		Button b = new Button("Copy->");
		add(t1);add(b);add(t2);
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				t2.setText(t1.getText());
			}
		});
		setVisible(true);
	}
	public static void main(String args[]) 
	{
		new CopyDemo();
	}
}