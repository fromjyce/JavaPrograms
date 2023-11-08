/*
Write a program that will display check boxes numbered from1 to 10. Use a text box to display the number of those corresponding boxes checked.
 */

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SwingCheckboxes extends JFrame{

    private JTextField textField;
    private JCheckBox[] checkBoxes;
    private int numberOfCheckBoxes;

    public SwingCheckboxes() {
        setTitle("CheckBox Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        numberOfCheckBoxes = 0;
        checkBoxes = new JCheckBox[10];
        textField = new JTextField(5);
        textField.setEditable(false);

        Container container = getContentPane();
        container.setLayout(new GridLayout(4,3));

        for (int i =0; i < checkBoxes.length; i++) {
            checkBoxes[i] = new JCheckBox("Check Box: " + (i+1));
            checkBoxes[i].addItemListener( e -> {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    numberOfCheckBoxes++;
                } else {
                    numberOfCheckBoxes--;
                }
                textField.setText(String.valueOf(numberOfCheckBoxes));
            });
            container.add(checkBoxes[i]);
        }
        container.add(new JLabel("Number of Checked Boxes: "));
        container.add(textField);
    }

    public static void main(String[] args) {
        SwingCheckboxes frame = new SwingCheckboxes();
        frame.setVisible(true);
    }
    
}
