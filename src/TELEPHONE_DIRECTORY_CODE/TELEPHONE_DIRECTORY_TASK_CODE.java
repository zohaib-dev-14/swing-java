package TELEPHONE_DIRECTORY_CODE;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TELEPHONE_DIRECTORY_TASK_CODE {

    private static TelephoneRecord[] records;
    private static int currentIndex = 0;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Telephone Directory");
         frame.setLayout(new BorderLayout());
         
        JPanel sizePanel = new JPanel(new FlowLayout());
        JLabel lblSize = new JLabel("Enter Size:");
        JTextField txtSize = new JTextField(10);
        JButton btnSetSize = new JButton("Set Size");

        sizePanel.add(lblSize);
        sizePanel.add(txtSize);
        sizePanel.add(btnSetSize);

        frame.add(sizePanel, BorderLayout.NORTH);

        // ===== TABBED PANE =====
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setEnabled(false);

        // ===== ADD TAB =====
        JPanel addPanel = new JPanel(new GridLayout(4,2,5,5));
  
        JTextField txtName = new JTextField();
        JTextField txtArea = new JTextField();
        JTextField txtPhone = new JTextField();
        JButton btnAdd = new JButton("Add Record");
         
        
       
        
        
        addPanel.add(new JLabel("Name:"));
        addPanel.add(txtName);
        addPanel.add(new JLabel("Area Code:"));
        addPanel.add(txtArea);
        addPanel.add(new JLabel("Phone:"));
        addPanel.add(txtPhone);
        addPanel.add(new JLabel(""));
        addPanel.add(btnAdd);

        tabbedPane.addTab("Add", addPanel);

        // ===== DISPLAY TAB =====
        JPanel displayPanel = new JPanel(new BorderLayout());
        JTextArea textArea = new JTextArea();
        JButton btnDisplay = new JButton("Display Records");

        displayPanel.add(new JScrollPane(textArea), BorderLayout.CENTER);
        displayPanel.add(btnDisplay, BorderLayout.SOUTH);

        tabbedPane.addTab("Display", displayPanel);

        // ===== UPDATE TAB =====
        JPanel updatePanel = new JPanel(new GridLayout(5,2,5,5));

        JTextField txtIndex = new JTextField();
        JTextField txtNewName = new JTextField();
        JTextField txtNewArea = new JTextField();
        JTextField txtNewPhone = new JTextField();
        JButton btnUpdate = new JButton("Update Record");

        updatePanel.add(new JLabel("Record Index:"));
        updatePanel.add(txtIndex);
        updatePanel.add(new JLabel("New Name:"));
        updatePanel.add(txtNewName);
        updatePanel.add(new JLabel("New Area Code:"));
        updatePanel.add(txtNewArea);
        updatePanel.add(new JLabel("New Phone:"));
        updatePanel.add(txtNewPhone);
        updatePanel.add(new JLabel(""));
        updatePanel.add(btnUpdate);

        tabbedPane.addTab("Update", updatePanel);

        frame.add(tabbedPane, BorderLayout.CENTER);

        // ===== SET SIZE EVENT =====
        btnSetSize.addActionListener(e -> {
            try {
                int size = Integer.parseInt(txtSize.getText());

                if(size <= 0){
                    JOptionPane.showMessageDialog(frame, "Enter positive number");
                    return;
                }

                records = new TelephoneRecord[size];
                currentIndex = 0;

                txtSize.setEnabled(false);
                btnSetSize.setEnabled(false);
                tabbedPane.setEnabled(true);

                JOptionPane.showMessageDialog(frame, "Array created!");

            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(frame, "Invalid number!");
            }
        });

        // ===== ADD EVENT =====
        btnAdd.addActionListener(e -> {

            if(currentIndex < records.length){

                records[currentIndex] = new TelephoneRecord(
                        txtName.getText(),
                        txtArea.getText(),
                        txtPhone.getText()
                );

                currentIndex++;

                JOptionPane.showMessageDialog(frame, "Record Added!");
            } else {
                JOptionPane.showMessageDialog(frame, "Directory Full!");
            }
        });

        // ===== DISPLAY EVENT =====
        btnDisplay.addActionListener(e -> {

            textArea.setText("");

            for(int i = 0; i < currentIndex; i++){
                textArea.append(
                        i + " | " +
                        records[i].getPersonName() + " | " +
                        records[i].getAreaCode() + " | " +
                        records[i].getPhoneNumber() + "\n"
                );
            }
        });

        // ===== UPDATE EVENT =====
        btnUpdate.addActionListener(e -> {

            try {
                int index = Integer.parseInt(txtIndex.getText());

                if(index >=0 && index < currentIndex){

                    records[index].setPersonName(txtNewName.getText());
                    records[index].setAreaCode(txtNewArea.getText());
                    records[index].setPhoneNumber(txtNewPhone.getText());

                    JOptionPane.showMessageDialog(frame, "Record Updated!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Index!");
                }

            } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(frame, "Enter valid index!");
            }
        });

        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}