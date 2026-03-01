package SWING_BASIC;

import java.awt.*;

import javax.swing.*;

public class SWING_BASIC_2 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("My First App");
		JLabel label = new JLabel("Hello, World!", JLabel.CENTER);
		frame.setForeground(Color.blue);
		frame.add(label);
		
		label.setFont(new Font("Arial", Font.BOLD, 20));
		label.setForeground(Color.black);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		

	}

}
