package GUI_CALCULATOR;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI_CALCULATOR_3 {

    public static void main(String[] args){
    	

        JFrame frame = new JFrame("GUI CALCULATOR");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 5, 5));
        
        JTextField txtX1 = new JTextField();
        JTextField txtY1= new JTextField();
        JTextField txtX2 = new JTextField();
        JTextField txtY2 = new JTextField();
        
        JButton btnCalculate = new JButton("Calculate");
        
        
        panel.add(new JLabel("Enter X1: "));
        panel.add(txtX1);
        panel.add(new JLabel("Enter Y1: "));
        panel.add(txtY1);
        panel.add(new JLabel("Enter X2: "));
        panel.add(txtX2);
        panel.add(new JLabel("Enter Y2: "));
        panel.add(txtY2);
        panel.add(new JLabel(" "));
        panel.add(btnCalculate);
        frame.add(panel);
        
        btnCalculate.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
        			double x1 = Double.parseDouble(txtX1.getText());
        			double y1 = Double.parseDouble(txtY1.getText());
        			double x2 = Double.parseDouble(txtX2.getText());
        			double y2 = Double.parseDouble(txtY2.getText());
        			
        			double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
          			double radius = distance;
                    double diagonal = 2 * radius;
                    double circumference = 2 * Math.PI * radius;
                    double area = Math.PI * radius * radius;

                    String result =
                            "Distance: " + distance + "\n" +
                            "Radius: " + radius + "\n" +
                            "Diagonal: " + diagonal + "\n" +
                            "Circumference: " + circumference + "\n" +
                            "Area: " + area;
                  JOptionPane.showMessageDialog(frame, result);
        			
        		} catch (NumberFormatException ex) {
        			JOptionPane.showMessageDialog(frame, "Please Enter a valid number");
        		}
        	}
        });
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    

    }
}