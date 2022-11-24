package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField tfUsername, tfPassword;
	private JButton loginBtn, joinBtn;
	
	public LoginFrame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("ALGOGA_MAIN");
		setSize(600, 800);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblLogin = new JLabel("ID");
		lblLogin.setBounds(154, 612, 69, 30); 
		contentPane.add(lblLogin);

		JLabel lblPassword = new JLabel("PW");
		lblPassword.setBounds(150, 654, 69, 30);
		contentPane.add(lblPassword);

		tfUsername = new JTextField();
		tfUsername.setBounds(179, 614, 150, 30);
		contentPane.add(tfUsername);
		tfUsername.setColumns(10);

		joinBtn = new JButton("CREATE");
		joinBtn.setBackground(Color.WHITE);
		joinBtn.setBounds(330, 654, 81, 30);
		contentPane.add(joinBtn);

		loginBtn = new JButton("LOGIN");
		loginBtn.setBackground(Color.WHITE);
		loginBtn.setBounds(330, 614, 81, 30);
		contentPane.add(loginBtn);

		tfPassword = new JTextField();
		tfPassword.setColumns(10);
		tfPassword.setBounds(179, 654, 150, 30);
		contentPane.add(tfPassword);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(LoginFrame.class.getResource("/images/main/main.png")));
		lblNewLabel.setBounds(-11, 0, 595, 761);
		contentPane.add(lblNewLabel);
		
		
		setVisible(true);
		
		loginBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ViewMenu menu = new ViewMenu();
			}
		});
	
		joinBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JoinFrame frame = new JoinFrame();
			}
		});
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}