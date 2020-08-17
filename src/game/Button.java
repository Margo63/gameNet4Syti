package game;

import game4.Choice;
import main.MainBut;
import main.MainFrame;
import main.variables;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button {
    public static MainBut but;
    public static MainBut but_3;
    public static MainBut but_set;
    public static JButton but_cl;

    public Button(){

    }

    public static void button_3(){

        but_3 = new MainBut();
        but_3.MenuButt(8,"Назад",variables.width-150,  0, variables.MainPanel);

        but_3.setVisible(false);

        variables.MainPanel.add(but_3);
        variables.MainPanel.repaint();

        but_3.setFocusable(false);

        MainFrame.frame.setFocusable(true);
    }

   public static void button(){
        but = new MainBut();
        but.MenuButt(1, "Назад в меню", variables.width-150,  0, variables.MainPanel);
        but.setVisible(true);
        variables.MainPanel.add(but);
        variables.MainPanel.repaint();

        but.setFocusable(false);
        MainFrame.frame.setFocusable(true);


    }
    public static void but_setting(){
        but_set = new MainBut();
        but_set.MenuButt(28,"Setting",variables.width-300,0,variables.MainPanel);
        but_set.setVisible(true);
        variables.MainPanel.repaint();
        but_set.setFocusable(false);
        MainFrame.frame.setFocusable(true);

    }
    public static void but_close(JPanel p,JFrame f){
        but_cl = new JButton(){
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(variables.close,0,0,null);

            }
        };
        but_cl.setBounds( f.getWidth()-50,0,50,50);
        but_cl.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });
        p.add(but_cl);


    }

}
