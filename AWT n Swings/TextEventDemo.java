import java.awt.*;
import java.awt.event.*;
public class TextEventDemo extends Frame 
{
	TextField t = new TextField(15);
	TextEventDemo()
	{
		setSize(180,80);
		setLayout(new FlowLayout());
		add(t);
		t.addKeyListener(new KeyListener() 
		{
			
			public void keyPressed(KeyEvent e) {}
			
			public void keyReleased(KeyEvent e) 
			{
				int cp = t.getCaretPosition();
				t.setText(t.getText().toUpperCase());
				t.setCaretPosition(cp);
			}
			
			public void keyTyped(KeyEvent e) {}
		});
	setVisible(true);
}
public static void main(String args[]) {
new TextEventDemo();
}
}