import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JFrame1
{
public static void main(String[] args)
{
JFrame.setDefaultLookAndFeelDecorated(true);
JFrame aFrame = new JFrame("First frame");
JLabel jl = new JLabel("It is a First Label");
JLabel jl2 = new JLabel("It is a Second Label");
JLabel jl3 = new JLabel("It is a Third Label");
JButton jb = new JButton("Click Me");
JButton jb2 = new JButton("Remove Me");
aFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
// aFrame.setSize(400, 400);
aFrame.add(jl);
aFrame.add(jl2);
aFrame.add(jb);
aFrame.add(jb2);
jb.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e)
	{
		aFrame.add(jl3);
		aFrame.invalidate();
		aFrame.validate();
		aFrame.repaint();
	}
	
});
jb2.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e)
	{
		aFrame.remove(jl3);
		aFrame.invalidate();
		aFrame.validate();
		aFrame.repaint();
	}
});
aFrame.setBounds(400,400,400,400);
aFrame.setResizable(false);
aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
aFrame.setVisible(true);
}
}