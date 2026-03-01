package JTABBED_PANE_BASIC;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JTABBED_PANE_BASIC_CODE {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Tabbed Example");
        
		
		JTabbedPane tabbedPane = new JTabbedPane();
		
		JPanel addPanel = new JPanel();
		addPanel.add(new JLabel("Add Records Here", JLabel.CENTER));
		
		JPanel displayPanel = new JPanel();
		displayPanel.add(new JLabel("Display Records Here", JLabel.CENTER));
		
		JPanel updatePanel = new JPanel();
		updatePanel.add(new JLabel("Update Records Here", JLabel.CENTER));
		
		tabbedPane.add("Add", addPanel);
		tabbedPane.add("Display", displayPanel);
		tabbedPane.add("Update", updatePanel);
		
		
        frame.add(tabbedPane);

        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

	}

}
