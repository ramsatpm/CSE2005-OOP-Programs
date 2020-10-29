import java.awt.*;
import java.awt.event.*;
class ClickMeListener implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
		System.out.println("Click Me Button is Clikced..");
	}
}
class MyWindowAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}
class ButtonDemo
{
	public static void main(String[] args)
	{
		Frame f = new Frame();
		f.setSize(200,200);
		f.setLayout(new FlowLayout());

		Button b = new Button("Click Me");
		//Now we are interested in handling the events of the button.
		//Button generates ActionEvent. So to handle this event we need to implement ActionListener.
		ClickMeListener cml = new ClickMeListener();

		b.addActionListener(cml);
		f.add(b);

		f.addWindowListener(new MyWindowAdapter());

		f.setVisible(true);
	}
}