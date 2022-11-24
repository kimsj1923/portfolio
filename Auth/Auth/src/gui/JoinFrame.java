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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import dao.MemberDao;
import models.Member;
import test01.main;
import java.awt.Color;

public class JoinFrame extends JFrame {

	private JPanel contentPane;
	private JButton joinCompleteBtn;
	private JTextField tfUsername;
	private JTextField tfPassword;
	private JTextField tfName;
	private JTextField tfEmail;
	private JTextField tfPhone;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JoinFrame frame = new JoinFrame();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JoinFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 800);
		setTitle("ALGOGA_CREATE");
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsername = new JLabel("password");
		lblUsername.setBounds(156, 552, 69, 20);
		contentPane.add(lblUsername);

		JLabel label = new JLabel("username");
		label.setBounds(156, 507, 69, 20);
		contentPane.add(label);

		JLabel lblName = new JLabel("name");
		lblName.setBounds(156, 597, 69, 20);
		contentPane.add(lblName);

		JLabel lblEmail = new JLabel("email");
		lblEmail.setBounds(156, 642, 69, 20);
		contentPane.add(lblEmail);

		JLabel lblPhone = new JLabel("phone");
		lblPhone.setBounds(156, 687, 69, 20);
		contentPane.add(lblPhone);

		tfUsername = new JTextField();
		tfUsername.setColumns(10);
		tfUsername.setBounds(237, 500, 186, 35);
		contentPane.add(tfUsername);

		tfPassword = new JTextField();
		tfPassword.setColumns(10);
		tfPassword.setBounds(237, 545, 186, 35);
		contentPane.add(tfPassword);

		tfName = new JTextField();
		tfName.setColumns(10);
		tfName.setBounds(237, 590, 186, 35);
		contentPane.add(tfName);

		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(237, 635, 186, 35);
		contentPane.add(tfEmail);

		tfPhone = new JTextField();
		tfPhone.setColumns(10);
		tfPhone.setBounds(237, 680, 186, 35);
		contentPane.add(tfPhone);
		
		JButton back = new JButton("BACK");
		back.setBackground(Color.WHITE);
		back.setBounds(150, 725, 70, 29);
		contentPane.add(back);
		
		joinCompleteBtn = new JButton("REGISTER");
		joinCompleteBtn.setBackground(Color.WHITE);
		joinCompleteBtn.setBounds(237, 725, 186, 29);
		contentPane.add(joinCompleteBtn);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(LoginFrame.class.getResource("/images/main/main_reg.png")));
		lblNewLabel.setBounds(0, 0, 584, 761);
		contentPane.add(lblNewLabel);

		setVisible(true);
		
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LoginFrame menu = new LoginFrame();
			}
		});
		
		joinCompleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Member member = new Member();
				member.setUsername(tfUsername.getText());
				member.setPassword(tfPassword.getText());
				member.setName(tfName.getText());
				member.setEmail(tfEmail.getText());
				member.setPhone(tfPhone.getText());
				
				MemberDao dao = MemberDao.getInstance();
				int result = dao.save(member);
				
				if(result == 1) {
					JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다.");
					dispose();
				}else {
					JOptionPane.showMessageDialog(null, "회원가입이 실패하였습니다.");
					dispose();
				}	
			}
		});

	}
}
