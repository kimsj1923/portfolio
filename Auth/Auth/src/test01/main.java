package test01;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class main extends JFrame {
	private Image background=new ImageIcon(main.class.getResource("../images/main/main.png")).getImage();
	public main() {
		homeframe();
	}
	public void homeframe() {
		setTitle("1");
		setSize(600,800);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void paint(Graphics g) {
		g.drawImage(background, 0, 0, null);
	}
	public static void main(String[] args){
		try {
			new main();
		} catch(NullPointerException e) {
			System.out.println(e);
		}
	}
}