package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import test01.main;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLayeredPane;

public class PostFrame extends JFrame {

	private JPanel contentPane;
	private JButton joinCompleteBtn;
	private JTextField tfUsername;
	private JTextField tfTitle;
	private JTextArea tfContents;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PostFrame frame = new PostFrame();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PostFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 800);
		setTitle("ALGOGA_P");
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Font f1 = new Font("돋움", Font.BOLD, 20);

		JLabel lblUsername = new JLabel("제목");
		lblUsername.setBounds(48, 115, 40, 20);
		contentPane.add(lblUsername);

		JLabel label = new JLabel("작성자");
		label.setBounds(48, 85, 40, 20);
		contentPane.add(label);

		JLabel lblName = new JLabel("내용");
		lblName.setBounds(48, 152, 40, 20);
		contentPane.add(lblName);

		tfUsername = new JTextField();
		tfUsername.setColumns(10);
		tfUsername.setBounds(89, 85, 94, 20);
		contentPane.add(tfUsername);

		tfTitle = new JTextField();
		tfTitle.setColumns(10);
		tfTitle.setBounds(89, 115, 200, 20);
		contentPane.add(tfTitle);

		tfContents = new JTextArea();
		tfContents.setBackground(Color.WHITE);
		tfContents.setLineWrap(true);
		tfContents.setColumns(10);
		tfContents.setBounds(89, 152, 400, 513);
		contentPane.add(tfContents);

		joinCompleteBtn = new JButton("POST");
		joinCompleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		joinCompleteBtn.setBackground(Color.WHITE);
		joinCompleteBtn.setBounds(408, 725, 70, 30);
		contentPane.add(joinCompleteBtn);
		
		JButton back = new JButton("BACK");
		back.setBackground(Color.WHITE);
		back.setBounds(490, 725, 70, 30);
		contentPane.add(back);
		
		//행위후 넘어갈 곳
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(LoginFrame.class.getResource("/images/main/whiteBoard.png")));
		lblNewLabel.setBounds(-12, 0, 584, 761);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(89, 145, 400, 520);
		contentPane.add(panel);
		panel.setLayout(null);

		setVisible(true);
		
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ViewReview loc = new ViewReview();
			}
		});
		
		joinCompleteBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "후가 작성이 완료되었습니다.");
				dispose();

			}
		});
		
	}
}