package io.littleworld.innerclass;

import javax.swing.*;
import java.awt.*;

public class MyApp extends JFrame {
    JButton button = new JButton("OK");
    JLabel label = new JLabel("label");

    MyApp() {
        getContentPane().add(button, BorderLayout.SOUTH);
        getContentPane().add(label, BorderLayout.NORTH);
        //button.addActionListener();
    }

    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.setSize(300, 300);
        app.setVisible(true);
    }
}
