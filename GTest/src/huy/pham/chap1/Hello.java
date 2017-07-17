package huy.pham.chap1;

import java.awt.Graphics;

import javax.swing.JFrame;

public class Hello extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Hello() {
		setTitle("Hello");
		setVisible(true);
		setSize(400, 400);
	}
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("Hello", 100, 100);
	}
	
	public static void main(String[] args) {
		Hello h = new Hello();
		h.add(new LoadImage());
		h.add(new LoadImage());
	}
}
