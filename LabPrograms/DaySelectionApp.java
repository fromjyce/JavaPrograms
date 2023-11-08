/*to design a gui application using swing where the days of the week will be displayed using swing lists and when a day is selected a text box should show which days are selected*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DaySelectionApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Day Selection");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        JList<String> dayList = new JList<>(daysOfWeek);
        dayList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JTextField selectedDaysField = new JTextField(20);
        selectedDaysField.setEditable(false);

        JButton showSelectedButton = new JButton("Show Selected Days");

        showSelectedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] selectedDays = dayList.getSelectedValuesList().toArray(new String[0]);
                selectedDaysField.setText(String.join(", ", selectedDays));
            }
        });

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new JLabel("Select Days of the Week:"));
        panel.add(new JScrollPane(dayList));
        panel.add(showSelectedButton);
        panel.add(new JLabel("Selected Days:"));
        panel.add(selectedDaysField);

        frame.add(panel);
        frame.setVisible(true);
    }
}

