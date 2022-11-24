package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

public class ViewMenu extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewMenu menu = new ViewMenu();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ViewMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 800);
		setTitle("ALGOGA_MENU");
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton back = new JButton("BACK");
		back.setBackground(Color.WHITE);
		back.setBounds(492, 726, 80, 25);
		contentPane.add(back);
		
		JButton viewtourlist = new JButton("관광지 조회");
		viewtourlist.setBackground(Color.WHITE);
		viewtourlist.setBounds(157, 652, 110, 40);
		contentPane.add(viewtourlist);
		
		JButton viewreview = new JButton("후기 보기");
		viewreview.setBackground(Color.WHITE);
		viewreview.setBounds(317, 652, 110, 40);
		contentPane.add(viewreview);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(LoginFrame.class.getResource("/images/main/main_sec.png")));
		lblNewLabel.setBounds(-11, 0, 595, 761);
		contentPane.add(lblNewLabel);
		setVisible(true);
		
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LoginFrame menu = new LoginFrame();
			}
		});
		
		viewtourlist.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ViewTourlist menu = new ViewTourlist();
			}
		});
		viewreview.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ViewReview menu = new ViewReview();
			}
		});
	}
	
}