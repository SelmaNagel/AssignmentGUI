package myassignment;
import javax.swing.*;
import java.awt.*; // to work with colour
import java.awt.event.*; 

public class Part2 {

    public static void main(String[] args) {
        
        JFrame window = new JFrame("Part 2");
        window.setSize(400, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        
        button1.setBounds(50, 80, 80, 25);
        button2.setBounds(90, 110, 80, 25);
        button3.setBounds(130, 80, 80, 25);

        JCheckBox colorCheckBox = new JCheckBox("give colours");
        colorCheckBox.setBounds(220, 95, 120, 25);
        
        // adding listener
        colorCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // implemented every time when we checking the checkbox
                if (colorCheckBox.isSelected()) {
                    // checkbox checked
                    button1.setBackground(Color.GREEN);
                    button2.setBackground(Color.BLUE);
                    button3.setBackground(Color.RED);
                } else {
                    // checkbox unchecked
                    button1.setBackground(null); 
                    button2.setBackground(null);
                    button3.setBackground(null);
                }
            }
        });
        
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(colorCheckBox);
        window.add(panel);
        window.setVisible(true);
    }
}