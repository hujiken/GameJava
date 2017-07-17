package huy.pham.chap1;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class LoadImage extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image image;
	
	public LoadImage() {
		ImageIcon imageIcon = new ImageIcon("images/anh.jpg");
		image = imageIcon.getImage();
	}
	
	protected void paintComponent(Graphics g) {
		g.drawImage(image, 100, 100, this);
	}
}
