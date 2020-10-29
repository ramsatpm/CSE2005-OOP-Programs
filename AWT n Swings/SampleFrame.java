import java.awt.*;
import java.awt.event.*;
class ButtonActionListener implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Buttion is clicked");
	}
}
// class FrameWindowAdapter extends WindowAdapter
// {
// 	public void windowClosing(WindowEvent e)
// 	{
// 		System.exit(0);
// 	}
// }
class SampleFrame
{
	public static void main(String args[])
	{
		Frame f = new Frame("SampleFrame");
		TextField t = new TextField(10);
		f.setLayout(new FlowLayout(FlowLayout.LEFT));

		Label l = new Label("Next to me is the Button:");
		Label mc = new Label();
		f.add(l);

		Button b = new Button("Click Me");
		f.add(b);
		// I am interested to handle events generated from the Button "b".
		// Button generates ActionEvent when it is clicked.
		// so we should use addActionListener() method for registration.
		// While registration we need to pass an instance of ActionListener.
		ButtonActionListener bal = new ButtonActionListener();
		b.addActionListener(bal);

		// f.addWindowListener(new FrameWindowAdapter());

		f.addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});

		f.add(t);
		f.add(mc);
		t.addKeyListener(new KeyAdapter()
		{
			public void keyReleased(KeyEvent e)
			{
				int cp = t.getCaretPosition();
				t.setText(t.getText().toUpperCase());
				t.setCaretPosition(cp);
			}
		});

		f.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getX()+","+e.getY());
			}
		});

		f.setSize(800, 600);
		f.setVisible(true);

	}
}