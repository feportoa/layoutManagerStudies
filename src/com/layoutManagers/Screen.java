package com.layoutManagers;

import java.awt.*;
import javax.swing.*;

public class Screen {
    public Screen()
    {
        GridBagConstraints gbc = new GridBagConstraints();
        GridBagLayout grid = new GridBagLayout();

        JFrame pane = new JFrame("JFrame Screen");
        pane.setResizable(false);
        pane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //pane.setLocationRelativeTo(null);
        pane.setSize(800, 600);

        pane.setLayout(grid); //new GridBagLayout()

        JTextField userExpression = new JTextField();
        gbc.gridx = 1;
        gbc.gridwidth = 4;

        gbc.gridy = 0;
        gbc.gridheight = 3;

        gbc.fill = GridBagConstraints.BOTH;
        pane.add(userExpression, gbc);

        JButton del = new JButton("Del");
        gbc.gridx = 1;
        gbc.gridwidth = 1;

        gbc.gridy = 3;
        gbc.gridheight = 1;

        gbc.fill = GridBagConstraints.BOTH;
        pane.add(del, gbc);

        JButton multiply = new JButton("*");
        gbc.gridx = 2;
        gbc.gridwidth = 1;

        gbc.gridy = 3;
        gbc.gridheight = 1;

        gbc.fill = GridBagConstraints.BOTH;
        pane.add(multiply, gbc);

        JButton divide = new JButton("/");
        gbc.gridx = 3;
        gbc.gridwidth = 1;

        gbc.gridy = 3;
        gbc.gridheight = 1;

        gbc.fill = GridBagConstraints.BOTH;
        pane.add(divide, gbc);

        JButton add = new JButton("+");
        gbc.gridx = 4;
        gbc.gridwidth = 1;

        gbc.gridy = 3;
        gbc.gridheight = 2;

        gbc.fill = GridBagConstraints.BOTH;
        pane.add(add, gbc);

        JButton btn1 = new JButton("1");
        gbc.gridx = 1;
        gbc.gridwidth = 1;

        gbc.gridy = 4;
        gbc.gridheight = 1;

        gbc.fill = GridBagConstraints.BOTH;
        pane.add(btn1, gbc);

        JButton btn2 = new JButton("2");
        gbc.gridx = 2;
        gbc.gridwidth = 1;

        gbc.gridy = 4;
        gbc.gridheight = 1;

        gbc.fill = GridBagConstraints.BOTH;
        pane.add(btn2, gbc);

        JButton btn3 = new JButton("3");
        gbc.gridx = 3;
        gbc.gridwidth = 1;

        gbc.gridy = 4;
        gbc.gridheight = 1;

        gbc.fill = GridBagConstraints.BOTH;
        pane.add(btn3, gbc);

        JButton btn4 = new JButton("4");
        gbc.gridx = 1;
        gbc.gridwidth = 1;

        gbc.gridy = 5;
        gbc.gridheight = 1;

        gbc.fill = GridBagConstraints.BOTH;
        pane.add(btn4, gbc);

        JButton btn5 = new JButton("5");
        gbc.gridx = 2;
        gbc.gridwidth = 1;

        gbc.gridy = 5;
        gbc.gridheight = 1;

        gbc.fill = GridBagConstraints.BOTH;
        pane.add(btn5, gbc);

        JButton btn6 = new JButton("6");
        gbc.gridx = 3;
        gbc.gridwidth = 1;

        gbc.gridy = 5;
        gbc.gridheight = 1;

        gbc.fill = GridBagConstraints.BOTH;
        pane.add(btn6, gbc);

        JButton res = new JButton("=");
        gbc.gridx = 4;
        gbc.gridwidth = 1;

        gbc.gridy = 5;
        gbc.gridheight = 3;

        gbc.fill = GridBagConstraints.BOTH;
        pane.add(res, gbc);

        JButton btn7 = new JButton("7");
        gbc.gridx = 1;
        gbc.gridwidth = 1;

        gbc.gridy = 6;
        gbc.gridheight = 1;

        gbc.fill = GridBagConstraints.BOTH;
        pane.add(btn7, gbc);

        JButton btn8 = new JButton("8");
        gbc.gridx = 2;
        gbc.gridwidth = 1;

        gbc.gridy = 6;
        gbc.gridheight = 1;

        gbc.fill = GridBagConstraints.BOTH;
        pane.add(btn8, gbc);

        JButton btn9 = new JButton("9");
        gbc.gridx = 3;
        gbc.gridwidth = 1;

        gbc.gridy = 6;
        gbc.gridheight = 1;

        gbc.fill = GridBagConstraints.BOTH;
        pane.add(btn9, gbc);

        JButton floatingPoint = new JButton(".");
        gbc.gridx = 1;
        gbc.gridwidth = 1;

        gbc.gridy = 7;
        gbc.gridheight = 1;

        gbc.fill = GridBagConstraints.BOTH;
        pane.add(floatingPoint, gbc);

        JButton btn0 = new JButton("0");
        gbc.gridx = 2;
        gbc.gridwidth = 1;

        gbc.gridy = 7;
        gbc.gridheight = 1;

        gbc.fill = GridBagConstraints.BOTH;
        pane.add(btn0, gbc);

        pane.setVisible(true);
    }
}
