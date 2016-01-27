package zad3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by A on 2016-01-27.
 */
public class Button2 extends JFrame {
    private JButton
    b1 = new JButton("Wszystko"),
    b2 = new JButton("Bez pustych");


    private JLabel label = new JLabel();
    private JLabel label2 = new JLabel("Liczymy linie kodu. Wynik: ");

    class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            AllCounter licznik = new AllCounter();
            Integer j = licznik.count(1);
            String txt = j.toString();
            label.setText(txt);

        }
    }
    class ButtonListener2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            AllCounter licznik = new AllCounter();
            Integer j = licznik.count(2);
            String txt = j.toString();
            label.setText(txt);
        }
    }



    private ButtonListener bl = new ButtonListener();
    private ButtonListener2 bl2 = new ButtonListener2();

    public Button2(){
        b1.addActionListener(bl);
        b2.addActionListener(bl2);
        setLayout(new FlowLayout());

        add(b1);
        add(b2);
        add(label2);
        add(label);

    }
}
