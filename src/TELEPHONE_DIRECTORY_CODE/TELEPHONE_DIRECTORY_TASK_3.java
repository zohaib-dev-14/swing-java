package TELEPHONE_DIRECTORY_CODE;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TELEPHONE_DIRECTORY_TASK_3 {

    static TelephoneRecord[] records;
    static int currentIndex = 0;

    static JButton btnAdd;
    static JButton btnDisplay;
    static JButton btnUpdate;

    public static void main(String[] args) {

        JFrame mainFrame = new JFrame("Telephone Directory - Task 03");
        mainFrame.setLayout(new FlowLayout());

        JButton btnSize = new JButton("Input Array Size");
        btnAdd = new JButton("Add Record");
        btnDisplay = new JButton("Display Records");
        btnUpdate = new JButton("Update Record");

        btnAdd.setEnabled(false);
        btnDisplay.setEnabled(false);
        btnUpdate.setEnabled(false);

        mainFrame.add(btnSize);
        mainFrame.add(btnAdd);
        mainFrame.add(btnDisplay);
        mainFrame.add(btnUpdate);

        // size window
        btnSize.addActionListener(e -> {

            JFrame sizeFrame = new JFrame("Set Size");
            sizeFrame.setLayout(new FlowLayout());

            JTextField txtSize = new JTextField(10);
            JButton btnSet = new JButton("Set");

            sizeFrame.add(new JLabel("Enter Size:"));
            sizeFrame.add(txtSize);
            sizeFrame.add(btnSet);

            btnSet.addActionListener(ev -> {
                try {
                    int size = Integer.parseInt(txtSize.getText());
                    if(size <= 0){
                        JOptionPane.showMessageDialog(sizeFrame,"Enter positive number");
                        return;
                    }

                    records = new TelephoneRecord[size];
                    currentIndex = 0;

                    btnAdd.setEnabled(true);
                    btnDisplay.setEnabled(true);
                    btnUpdate.setEnabled(true);

                    JOptionPane.showMessageDialog(sizeFrame,"Array Created!");
                    sizeFrame.dispose();

                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(sizeFrame,"Invalid number");
                }
            });

            sizeFrame.setSize(250,150);
            sizeFrame.setLocationRelativeTo(null);
            sizeFrame.setVisible(true);
        });

        // add window
        btnAdd.addActionListener(e -> {

            JFrame addFrame = new JFrame("Add Record");
            addFrame.setLayout(new GridLayout(4,2,5,5));

            JTextField txtName = new JTextField();
            JTextField txtArea = new JTextField();
            JTextField txtPhone = new JTextField();
            JButton btnSave = new JButton("Save");

            addFrame.add(new JLabel("Name:"));
            addFrame.add(txtName);
            addFrame.add(new JLabel("Area Code:"));
            addFrame.add(txtArea);
            addFrame.add(new JLabel("Phone:"));
            addFrame.add(txtPhone);
            addFrame.add(new JLabel(""));
            addFrame.add(btnSave);

            btnSave.addActionListener(ev -> {
                if(currentIndex < records.length){

                    records[currentIndex] = new TelephoneRecord(
                            txtName.getText(),
                            txtArea.getText(),
                            txtPhone.getText()
                    );

                    currentIndex++;
                    JOptionPane.showMessageDialog(addFrame,"Record Added!");
                    addFrame.dispose();

                } else {
                    JOptionPane.showMessageDialog(addFrame,"Directory Full!");
                }
            });

            addFrame.setSize(300,200);
            addFrame.setLocationRelativeTo(null);
            addFrame.setVisible(true);
        });

        // display window
        btnDisplay.addActionListener(e -> {

            JFrame displayFrame = new JFrame("Display Records");

            String[] columns = {"Index","Name","Area Code","Phone"};
            DefaultTableModel model = new DefaultTableModel(columns, 0);

            for(int i=0; i<currentIndex; i++){
                model.addRow(new Object[]{
                        i,
                        records[i].getPersonName(),
                        records[i].getAreaCode(),
                        records[i].getPhoneNumber()
                });
            }

            JTable table = new JTable(model);
            JScrollPane scrollPane = new JScrollPane(table);

            displayFrame.add(scrollPane);

            displayFrame.setSize(500,300);
            displayFrame.setLocationRelativeTo(null);
            displayFrame.setVisible(true);
        });

        // update window
        btnUpdate.addActionListener(e -> {

            JFrame updateFrame = new JFrame("Update Record");
            updateFrame.setLayout(new GridLayout(5,2,5,5));

            JTextField txtIndex = new JTextField();
            JTextField txtName = new JTextField();
            JTextField txtArea = new JTextField();
            JTextField txtPhone = new JTextField();
            JButton btnUpdateRecord = new JButton("Update");

            updateFrame.add(new JLabel("Record Index:"));
            updateFrame.add(txtIndex);
            updateFrame.add(new JLabel("New Name:"));
            updateFrame.add(txtName);
            updateFrame.add(new JLabel("New Area Code:"));
            updateFrame.add(txtArea);
            updateFrame.add(new JLabel("New Phone:"));
            updateFrame.add(txtPhone);
            updateFrame.add(new JLabel(""));
            updateFrame.add(btnUpdateRecord);

            btnUpdateRecord.addActionListener(ev -> {
                try {
                    int index = Integer.parseInt(txtIndex.getText());

                    if(index >=0 && index < currentIndex){

                        records[index].setPersonName(txtName.getText());
                        records[index].setAreaCode(txtArea.getText());
                        records[index].setPhoneNumber(txtPhone.getText());

                        JOptionPane.showMessageDialog(updateFrame,"Record Updated!");
                        updateFrame.dispose();

                    } else {
                        JOptionPane.showMessageDialog(updateFrame,"Invalid Index");
                    }

                } catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(updateFrame,"Enter valid index");
                }
            });

            updateFrame.setSize(300,250);
            updateFrame.setLocationRelativeTo(null);
            updateFrame.setVisible(true);
        });

        mainFrame.setSize(400,150);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }
}