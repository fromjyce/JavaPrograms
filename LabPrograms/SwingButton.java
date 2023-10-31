import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingButton {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Button Click Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JTextField textField = new JTextField(20);
            JButton button = new JButton("Click Me");
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField.setText("Lab Exam Text");
                }
            });

            JPanel panel = new JPanel();
            panel.add(button);
            panel.add(textField);

            frame.add(panel);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
