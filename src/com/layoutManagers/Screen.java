package com.layoutManagers;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BorderFactory;

public class Screen {
    public Screen()
    {
        GridBagConstraints gbc = new GridBagConstraints();
        GridBagLayout grid = new GridBagLayout();
        gbc.weightx = 0.1;
        gbc.weighty = 0.1;
        // gbc weight padronized for all buttons

        JFrame pane = new JFrame("JFrame Screen");
        pane.setResizable(false);
        pane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pane.setSize(360, 480);
        pane.setLocationRelativeTo(null);

        pane.setLayout(grid); // new GridBagLayout()

        ImageIcon icon = new ImageIcon("../../../imgs/jaca_icon.png");
        pane.setIconImage(icon.getImage());
        pane.getContentPane().setBackground(new Color(0x8F8F8F));

        JButton[] btnArray = new JButton[15];

        JTextField userExpression = new JTextField();
        gbc.gridx = 1;
        gbc.gridwidth = 4;

        gbc.gridy = 0;
        gbc.gridheight = 2;

        gbc.fill = GridBagConstraints.BOTH;
        pane.add(userExpression, gbc);

        JButton multiply = styledButton("*");
        JButton divide = styledButton("/");
        JButton sub = styledButton("-");
        JButton btn1 = styledButton("1");
        JButton btn2 = styledButton("2");
        JButton btn3 = styledButton("3");
        JButton btn4 = styledButton("4");
        JButton btn5 = styledButton("5");
        JButton btn6 = styledButton("6");
        JButton btn7 = styledButton("7");
        JButton btn8 = styledButton("8");
        JButton btn9 = styledButton("9");
        JButton del = styledButton("del");
        JButton btn0 = styledButton("0");
        JButton floatingPoint = styledButton(".");

        btnArray[0] = multiply;
        btnArray[1] = divide;
        btnArray[2] = sub;
        btnArray[3] = btn1;
        btnArray[4] = btn2;
        btnArray[5] = btn3;
        btnArray[6] = btn4;
        btnArray[7] = btn5;
        btnArray[8] = btn6;
        btnArray[9] = btn7;
        btnArray[10] = btn8;
        btnArray[11] = btn9;
        btnArray[12] = del;
        btnArray[13] = btn0;
        btnArray[14] = floatingPoint;

        gridParsing(pane, gbc, btnArray, 1, 3, 2, 6);

        JButton res = styledButton("=");
        res.setFocusable(false);
        gbc.gridx = 4;
        gbc.gridwidth = 1;

        gbc.gridy = 4;
        gbc.gridheight = 3;

        gbc.fill = GridBagConstraints.BOTH;
        pane.add(res, gbc);

        JButton add = styledButton("+");
        add.setFocusable(false);
        gbc.gridx = 4;
        gbc.gridwidth = 1;

        gbc.gridy = 2;
        gbc.gridheight = 2;

        gbc.fill = GridBagConstraints.BOTH;
        pane.add(add, gbc);

        System.out.println("Screen starting...");

        pane.setVisible(true);

        System.out.println("Screen started");
    }

    private JButton styledButton(String label)
    {
        JButton button = new JButton(label);
        button.setFocusable(false);
        button.setBackground(new Color(0xFEFEFE));
        button.setForeground(new Color(0x333333));
        button.setFont(new Font("Arial", Font.PLAIN, 12));
        button.setFocusPainted(false);
        button.setBorderPainted(true);
        button.setBorder(BorderFactory.createLineBorder(new Color(0xCFCFCF)));

        button.setPreferredSize(new Dimension(1000, 200));

        return button;
    }

    private void gridParsing(JFrame frame, GridBagConstraints gbcVar, JButton[] btnArray, int startGridx, int endGridx, int startGridy, int endGridy)
    {
        int btnArrayCount = 0;

        for(int i = startGridy; i <= endGridy; i++){
            for(int j=startGridx; j <= endGridx; j++)
            {
                if(btnArray[btnArrayCount] != null) {
                    btnArray[btnArrayCount].setFocusable(false);
                    gbcVar.gridx = j;
                    gbcVar.gridy = i;

                    gbcVar.gridheight = 1;
                    gbcVar.gridwidth = 1;

                    gbcVar.fill = GridBagConstraints.BOTH;

                    System.out.println(i + " | " + j);

                    frame.add(btnArray[btnArrayCount], gbcVar);
                    btnArrayCount++;
                }
            }
        }
    }
}