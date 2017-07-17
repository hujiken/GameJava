package huy.pham.chap2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JPanel;
import javax.swing.Timer;

public class MainGame extends JPanel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Timer timer;
	private final int DELAY = 5;
	private Box box;
	
	public MainGame() {
		setFocusable(true);
		setBackground(Color.blue);
		box = new Box();
		MyAdapter myAdapter = new MyAdapter(box);
		addKeyListener(myAdapter);
		timer = new Timer(DELAY, this);
		timer.start();
	}
	
	 @Override
	 protected void paintComponent(Graphics g) {
		 super.paintComponent(g);
		 g.drawImage(box.getImage(), box.getX(), box.getY(), this);
	 }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		box.move();
		repaint();
	}
}
