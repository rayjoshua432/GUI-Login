import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login implements ActionListener {	
		private static JFrame f;
		private static Container contentPane;
		private static JPanel p;
		private static JLabel l, lLostPass, succesLogIn;
		private static JTextField tf;
		private static JPasswordField pf;
		private static JButton btn;
	
	public Login() {
		f = new JFrame();
		contentPane = f.getContentPane();
		p = new JPanel();
		l = new JLabel("Login"); 
		lLostPass = new JLabel("Lost your Password?");
		succesLogIn = new JLabel("");
		tf = new JTextField("Username");
		pf = new JPasswordField("Password");
		btn = new JButton("Sign In");
		
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 0,30));
		contentPane.setBackground(new Color(53,152,220));
		
		// Frame
		f.setSize(400,350);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		// Panel
		p.setPreferredSize(new Dimension(300,250));
		p.setBackground(Color.white);
		p.setLayout(null);
		f.add(p); // add panel p to frame f
		
		// Label
		l.setBounds(125,5,70,70);
		l.setFont(new Font("Sans Serif", Font.PLAIN, 23));
		p.add(l); // add label l to panel p
		
		// TextField
		tf.setBounds(35,90,230,30);
		tf.setBackground(new Color(239,241,241));
		tf.setForeground(Color.gray);
		tf.setBorder(null);
		p.add(tf); // add text field tf to panel p
		
		// Password
		pf.setBounds(35,140,230,30);
		pf.setBackground(new Color(239,241,241));
		pf.setForeground(Color.gray);
		pf.setBorder(null);
		p.add(pf);
		
		// Log in Button
		btn.setBounds(35,180,230,30);
		btn.setBackground(new Color(53,152,220));
		btn.setForeground(Color.white);
		btn.setBorder(null);
		btn.addActionListener(this);
		p.add(btn);
		
		// Label for Forgot Password
		lLostPass.setBounds(105,210,230,30);
		lLostPass.setFont(new Font("Sans Serif", Font.PLAIN, 10));
		lLostPass.setForeground(Color.gray);
		p.add(lLostPass);
		
		// Successfully Log In
		succesLogIn.setBounds(35,60,300,30);
		succesLogIn.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		p.add(succesLogIn);
		
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String user = tf.getText();
		String pass = pf.getText();
		
		if (user.equals("user") && pass.equals("user1234")) {
			succesLogIn.setForeground(new Color(53,152,220));
			succesLogIn.setText("Login Successful");
		} else {
			succesLogIn.setForeground(Color.red);
			succesLogIn.setText("Login Failed");		
		}
	}
	
	public static void main(String[] args) {
		new Login();
	}
}
