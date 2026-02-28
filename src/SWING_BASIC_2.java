import javax.swing.JFrame;
import javax.swing.JLabel;
public class SWING_BASIC_2 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("My First Program");
		JLabel newLabel = new JLabel("Hello There", JLabel.CENTER);
	
		newLabel.setFont(new java.awt.Font("Times New Roman", java.awt.Font.BOLD, 20));	
		frame.add(newLabel);
		frame.add(newLabel);

		
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		
		

	}

}
