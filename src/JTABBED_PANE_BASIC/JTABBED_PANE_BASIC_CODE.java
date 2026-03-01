package JTABBED_PANE_BASIC;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JTABBED_PANE_BASIC_CODE {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Tabbed Example");
        
		
		JTabbedPane tabbedPane = new JTabbedPane();
		
		
		JPanel addPanel = new JPanel();
		addPanel.add(new JLabel("Add records here"));
		JPanel updatePanel = new JPanel();
		updatePanel.add(new JLabel("update records here"));
		JPanel describePanel = new JPanel();
		describePanel.add(new JLabel("describe records here"));
		
		tabbedPane.add("Add", addPanel);
		tabbedPane.add("Describe", describePanel);
		tabbedPane.add("Update", updatePanel);
		
		
        frame.add(tabbedPane);

        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

	}

}
