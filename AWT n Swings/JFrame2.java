import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class JFrame2
{
	public static void main(String[] args)
	{
		// JFrame.setDefaultLookAndFeelDecorated(true);//plaf package is available to work with pluggable look and feel.
		JFrame f = new JFrame("First Frame");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());

		JLabel l1 = new JLabel("First Label");
		JLabel l2 = new JLabel("Second Label");
		JLabel l3 = new JLabel("Third Label");

		JButton b1 = new JButton("Add Component");
		JButton b2 = new JButton("Remove Component");

		f.add(l1);
		f.add(l2);
		f.add(b1);
		f.add(b2);

		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				f.add(l3);
				f.invalidate();
				f.validate();
				f.repaint();
			}
		});

		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				f.remove(l3);
				f.invalidate();
				f.validate();
				f.repaint();
			}
		});

		f.setBounds(400, 300,400,400);
		f.setResizable(false);
		f.setVisible(true);

	}
}