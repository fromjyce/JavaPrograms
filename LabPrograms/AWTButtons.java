/*Awt creation of buttons*/

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTButtons {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Button Example");

        // Create a button
        Button button = new Button("Click Me");

        // Set button position and size
        button.setBounds(100, 100, 80, 30);

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");
            }
        });

        // Add the button to the frame
        frame.add(button);

        // Set frame size and make it visible
        frame.setSize(300, 200);
        frame.setLayout(null); // No layout manager for simplicity
        frame.setVisible(true);
    }
}

