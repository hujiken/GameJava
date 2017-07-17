package huy.pham.chap2;

import javax.swing.JFrame;

public class Test extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Test() {
		add(new MainGame());
		setSize(480, 360);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Test();
	}
}
