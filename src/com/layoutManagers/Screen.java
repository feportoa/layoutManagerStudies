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
        pane.setSize(800, 600);

        pane.setLayout(grid); //new GridBagLayout()

        JButton[] btnArray = new JButton[15];

        JTextField userExpression = new JTextField();
        gbc.gridx = 1;
        gbc.gridwidth = 4;

        gbc.gridy = 0;
        gbc.gridheight = 2;

        gbc.fill = GridBagConstraints.BOTH;
        pane.add(userExpression, gbc);

        JButton del = new JButton("Del");

        JButton multiply = new JButton("*");

        JButton divide = new JButton("/");

        JButton btn1 = new JButton("1");

        JButton btn2 = new JButton("2");

        JButton btn3 = new JButton("3");

        JButton btn4 = new JButton("4");

        JButton btn5 = new JButton("5");

        JButton btn6 = new JButton("6");

        JButton btn7 = new JButton("7");

        JButton btn8 = new JButton("8");

        JButton btn9 = new JButton("9");

        JButton floatingPoint = new JButton(".");

        JButton btn0 = new JButton("0");

        btnArray[0] = del;
        btnArray[1] = multiply;
        btnArray[2] = divide;
        btnArray[3] = btn1;
        btnArray[4] = btn2;
        btnArray[5] = btn3;
        btnArray[6] = btn4;
        btnArray[7] = btn5;
        btnArray[8] = btn6;
        btnArray[9] = btn7;
        btnArray[10] = btn8;
        btnArray[11] = btn9;
        btnArray[12] = floatingPoint;
        btnArray[13] = btn0;

        gridParsing(pane, gbc, btnArray, 1, 3, 2, 6);

        JButton res = new JButton("=");
        gbc.gridx = 4;
        gbc.gridwidth = 1;

        gbc.gridy = 4;
        gbc.gridheight = 3;

        gbc.fill = GridBagConstraints.BOTH;
        pane.add(res, gbc);

        JButton add = new JButton("+");
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

    private void gridParsing(JFrame frame, GridBagConstraints gbcVar, JButton[] btnArray, int startGridx, int endGridx, int startGridy, int endGridy)
    {
        int btnArrayCount = 0;

        for(int i = startGridy; i <= endGridy; i++){
            for(int j=startGridx; j <= endGridx; j++)
            {
                if(btnArray[btnArrayCount] != null) {
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