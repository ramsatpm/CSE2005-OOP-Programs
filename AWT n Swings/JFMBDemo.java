import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
class JFMBDemo implements ActionListener
{
	JLabel label;
	JPopupMenu jpu;
	JFMBDemo()
	{
		JFrame frame = new JFrame("Menu Bar Demonstration");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400,400,400,400);

		label = new JLabel("Choose a Menu Item..");
		frame.add(label, BorderLayout.SOUTH);

		JMenuBar menuBar = new JMenuBar();

		JMenu fMenu = new JMenu("File");
		JMenuItem openFile = new JMenuItem("Open");
		JMenuItem saveFile = new JMenuItem("Save");
		JMenuItem exit = new JMenuItem("Exit");

		fMenu.add(openFile);
		fMenu.add(saveFile);
		fMenu.addSeparator();
		fMenu.add(exit);

		fMenu.setMnemonic(KeyEvent.VK_F);
		openFile.setMnemonic(KeyEvent.VK_O);
		openFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_DOWN_MASK));
		openFile.setToolTipText("Opens a file");
		saveFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_DOWN_MASK));

		openFile.addActionListener(this);
		saveFile.addActionListener(this);
		exit.addActionListener(this);


		JMenu oMenu = new JMenu("Options");
		JMenuItem colorItem = new JMenuItem("Color");
		JMenuItem fontItem = new JMenuItem("Font");

		oMenu.add(colorItem);
		oMenu.add(fontItem);

		colorItem.addActionListener(this);
		fontItem.addActionListener(this);

		JMenu helpMenu = new JMenu("Help");
		JMenuItem aboutItem = new JMenuItem("About");

		helpMenu.add(aboutItem);
		aboutItem.addActionListener(this);

		JMenu checkMenu = new JMenu("Fruits");
		JCheckBoxMenuItem cb1 = new JCheckBoxMenuItem("Orange");
		JCheckBoxMenuItem cb2 = new JCheckBoxMenuItem("Apple");
		JCheckBoxMenuItem cb3 = new JCheckBoxMenuItem("Banana");

		checkMenu.add(cb1);
		checkMenu.add(cb2);
		checkMenu.add(cb3);


		JMenu radioMenu = new JMenu("Gender");
		JRadioButtonMenuItem rb1 = new JRadioButtonMenuItem("Male");
		JRadioButtonMenuItem rb2 = new JRadioButtonMenuItem("Female");
		radioMenu.add(rb1);
		radioMenu.add(rb2);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rb1);
		buttonGroup.add(rb2);

		


		menuBar.add(fMenu);
		menuBar.add(oMenu);
		menuBar.add(checkMenu);
		menuBar.add(radioMenu);
		menuBar.add(helpMenu);

		frame.setJMenuBar(menuBar);

		jpu = new JPopupMenu();
		JMenuItem jmiCut = new JMenuItem("Cut"); 
		JMenuItem jmiCopy = new JMenuItem("Copy"); 
		JMenuItem jmiPaste = new JMenuItem("Paste"); 

		jmiCut.addActionListener(this);
		jmiCopy.addActionListener(this);
		jmiPaste.addActionListener(this);
		

		jpu.add(jmiCut);
		jpu.add(jmiCopy);
		jpu.add(jmiPaste);

		frame.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) { 
			    if(me.isPopupTrigger())  
			      jpu.show(me.getComponent(), me.getX(), me.getY()); 
			  }  
			  public void mouseReleased(MouseEvent me) { 
			    if(me.isPopupTrigger())  
			      jpu.show(me.getComponent(), me.getX(), me.getY()); 
			  }  
			});


		frame.setVisible(true);

	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Exit"))
			System.exit(0);
		else
			label.setText("The Selected Menu Item is:"+e.getActionCommand());

	}

	public static void main(String[] args)
	{
		new JFMBDemo();
	}
}