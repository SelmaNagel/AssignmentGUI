package myassignment; // Цей рядок важливий, бо ми створили пакет!

import javax.swing.*;

public class Part1 {

    public static void main(String[] args) {
        // main window
        JFrame window = new JFrame("Part 1");// name window "Part 1" 
        window.setSize(400, 300); // window size
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to close the program

        // buttons panel
        JPanel panel = new JPanel();
        panel.setLayout(null);// automatic layout

        // 3 empty buttons
        JButton button1 = new JButton(); 
        JButton button2 = new JButton(); 
        JButton button3 = new JButton(); 

        // bounds of buttons
        button1.setBounds(100, 80, 80, 25);
        button2.setBounds(140, 110, 80, 25);
        button3.setBounds(180, 80, 80, 25);

        // edding buttons to the panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        // adding pannel to the main window
        window.add(panel);

        // setting visibility of the window
        window.setVisible(true);
    }
}