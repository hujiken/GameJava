package chap1;

import java.awt.Color;

import javax.swing.JFrame;

public class MainTest extends JFrame{
	public MainTest() {
		add(new CollisionDetection());
		setTitle("PHAM VAN HUY");
		setVisible(true);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(Color.BLUE);
	}

	public static void main(String[] args) {
		new MainTest();

	}

}
