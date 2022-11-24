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

public class LocInfoExample extends JFrame{
	
	private JPanel contentPane;
	
	public LocInfoExample() {
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(LoginFrame.class.getResource("/images/main/ex1.png")));
		lblNewLabel.setBounds(-11, 0, 595, 761);
		contentPane.add(lblNewLabel);
		setVisible(true);
		
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ViewTourlist menu = new ViewTourlist();
			}
		});
	}
}
