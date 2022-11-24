package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;

public class ViewReview extends JFrame{
	
	private JPanel contentPane;
	
	public ViewReview() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 800);
		setTitle("ALGOGA_Review");
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton back = new JButton("BACK");
		back.setBackground(Color.WHITE);
		back.setBounds(492, 734, 80, 25);
		contentPane.add(back);
		
		JButton ex = new JButton("");
		ex.setBackground(SystemColor.window);
		ex.setBounds(70, 323, 301, 37);
		contentPane.add(ex);
		
		JButton post = new JButton("POST");
		post.setBackground(Color.WHITE);
		post.setBounds(12, 735, 80, 25);
		contentPane.add(post);
		setVisible(true);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(LoginFrame.class.getResource("/images/main/review.png")));
		lblNewLabel.setBounds(-11, 0, 595, 761);
		contentPane.add(lblNewLabel);
		
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ViewMenu menu = new ViewMenu();
			}
		});
		post.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PostFrame menu = new PostFrame();
			}
		});
		
		ex.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ReviewExample loc = new ReviewExample();
			}
		});
	}
}
