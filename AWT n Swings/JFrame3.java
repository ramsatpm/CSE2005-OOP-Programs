import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class JFrame3 extends JFrame
{
	// String title;
	JFrame3()
	{
		this.setBounds(200, 200,200,200);
		// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		// this.setTitle(title);



	}
	public static void main(String args[])
	{
		JFrame3 f1 = new JFrame3();
		JFrame3 f2 = new JFrame3();
		f1.setTitle("First Frame");
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f2.setTitle("Second Frame");
	}
}