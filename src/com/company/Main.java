package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class Main extends JFrame {
    JTextField textField = new JTextField();

    Font font = new Font("Times new roman",Font.BOLD,50);

    JPanel[] panels = new JPanel[9];

    JButton button = new JButton("find out the result");

    JLabel label = new JLabel("Game");

    Random r = new Random();
    double y = r.nextInt(20)+1;

    int count = 0 ;


    public Main()
    {
        super("Main");
        setSize(500,300);

        for(var i = 0; i < panels.length; i++)
        {
            panels[i] = new JPanel();
            add(panels[i]);
            panels[i].setLayout(new BorderLayout());
            panels[i].setBackground(new Color(60,60,60));
        }
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setLayout(new GridLayout(3,3));

        textField.setFont(font);
        label.setFont(font);

        label.setForeground(new Color(190,190,190));


        panels[1].add(label, BorderLayout.CENTER);
        panels[4].add(textField,BorderLayout.CENTER);
        panels[7].add(button,BorderLayout.NORTH);


        button.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent event) {

                double x = Double.parseDouble(textField.getText().trim());
                    count += 1;


                if(count == 4)
                {
                    JOptionPane.showMessageDialog(null,"Game over");
                }
                else if(x > y)
                {
                    JOptionPane.showMessageDialog(null,"меньше");
                }

                else if(x < y)
                {
                    JOptionPane.showMessageDialog(null,"больше");
                }

                else if(x == y)
                {
                    JOptionPane.showMessageDialog(null,"угадал");
                }

            }
            public void mousePressed(MouseEvent event) { }
            public void mouseReleased(MouseEvent event) { }
            public void mouseEntered(MouseEvent event) { }
            public void mouseExited(MouseEvent event) { }
        });
    }




    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}