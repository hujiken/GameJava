package huy.pham.chap4;

import java.awt.Color;

import javax.swing.JFrame;

public class ChapMain extends JFrame{
	public ChapMain() {
		add(new Collision());
		setTitle("Collision detection test");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(Color.BLUE);
		setVisible(true);
	}
	
	public static void main(String[] agrs) {
		new ChapMain();
	}
}
