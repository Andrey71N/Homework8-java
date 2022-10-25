package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    public GUI()  {

        setTitle("Привет Яндекс");
        setBounds(400, 300, 500, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton button = new JButton("Новая кнопка!");
//        setLayout(new GridLayout(3, 3));
//        for (int i = 1; i <= 9; i++) {
//            JButton button = new JButton(String.valueOf(i));
//            add(button);
//        }


        setLayout(new FlowLayout());
        JButton btn1 = new JButton("Кнопка #1");
        JButton btn2 = new JButton("Кнопка #2");
        JButton btn3 = new JButton("Кнопка #3");
        add(btn1);
        add(btn2);
        add(btn3);

//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println(button.getText());
//                button.getText("");
//            }
//        });

//        add(button);
        setVisible(true);

    }


}
