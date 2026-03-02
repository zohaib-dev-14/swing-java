package FORM_HANDLING;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class FORM_FILE_HANDLING {
	public static void main (String[] args) {
		JFrame frame = new JFrame("Form");
		frame.setSize(400, 400);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 2, 5, 5));
		
		JTextField txtName = new JTextField();
		JTextField txtEmail = new JTextField();
		JTextField txtPass = new JTextField();
		JButton btn = new JButton("Submit");
		panel.add(new JLabel("Enter name"));
		panel.add(txtName);
		
		panel.add(new JLabel("Enter email"));
		panel.add(txtEmail);
		
		panel.add(new JLabel("Enter Password"));
		panel.add(txtPass);
		
		
		panel.add(new JLabel(""));
		panel.add(btn);
		
		frame.add(panel);
		
		btn.addActionListener(e -> {
			String name = txtName.getText();
			String email = txtName.getText();
			String password = txtPass.getText();
			
			String result = "name : " + name +  " \n" + "email : " +  email + " \n" + "password: " + password ; 
			
			JOptionPane.showMessageDialog(frame, result);
			
		});
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		
	}
}