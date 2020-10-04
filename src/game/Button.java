package game;

import game1.Panel;
import game4.Choice;
import main.MainBut;
import main.MainFrame;
import main.variables;
import player.Player;
import selection.selectionGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button {
    public static JButton but=null;

    public static JButton but_3=null;


    public static MainBut but_set=null;
    public static JButton but_cl=null;

    public Button(){

    }

    public static void button_3(){
        if(but_3==null) {
            but_3 = new JButton(){
                protected void paintComponent(Graphics g){
                    super.paintComponent(g);
                    g.drawImage(variables.nazad,0,0,150,50,null);
                }
            };
        }
        but_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                variables.gameLvl = 3;

                try {
                    Button.but_3.setVisible(false);
                }
                catch(NullPointerException nullPointerException) {
                }

                new game3.Panel();
                variables.MainPanel.repaint();
            }
        });
      //  but_3.MenuButt(8,"Назад",variables.width-150,  0, variables.MainPanel);
        but_3.setBounds(variables.width-150,  0,150,50);
        but_3.setVisible(false);
        but_3.setOpaque(false);
        but_3.setContentAreaFilled(false);
        but_3.setBorderPainted(false);

        variables.MainPanel.add(but_3);
        variables.MainPanel.repaint();

        but_3.setFocusable(false);

        MainFrame.frame.setFocusable(true);



    }

   public static void button(){



        if(but==null) {

            but = new JButton() {

                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.drawImage(variables.vmenu, 0, 0, 150, 50, null);

                }

            };
        }
        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new selectionGame();



                Panel.player.time.stop();
                game2.Panel.player.time.stop();
                game3.Panel.player.time.stop();


                if(Choice.trueButChoice){

                    Choice.trueButChoice = false;
                    Choice.q_b0.setVisible(false);
                    Choice.q_b1.setVisible(false);
                    Choice.q_b2.setVisible(false);
                    Choice.q_b3.setVisible(false);
                    Choice.q_b4.setVisible(false);
                    Choice.q_b5.setVisible(false);
                    Choice.q_b6.setVisible(false);
                    Choice.q_b7.setVisible(false);
                    Choice.q_b8.setVisible(false);
                    Choice.q_b9.setVisible(false);
                }

            }
        });




        but.setVisible(true);

        but.setOpaque(false);
        but.setContentAreaFilled(false);
        but.setBorderPainted(false);

        but.setBounds(variables.width-150,0,150,50);
        variables.MainPanel.add(but);
        variables.MainPanel.repaint();
        but.setFocusable(false);
        MainFrame.frame.setFocusable(true);


    }


    public static void but_setting(){
        if(but_set==null)
        but_set = new MainBut();
        but_set.MenuButt(28,"Setting",variables.width-300,0,variables.MainPanel);
        but_set.setVisible(true);
        but_set.img=variables.zadanie;
        but_set.w=150;
        but_set.h=50;
        but_set.setOpaque(false);
        but_set.setContentAreaFilled(false);
        but_set.setBorderPainted(false);
        variables.MainPanel.repaint();
        but_set.setFocusable(false);
        MainFrame.frame.setFocusable(true);

    }
    public static void but_close(JPanel p,JFrame f){
        if(but_cl==null) {
            but_cl = new JButton() {
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);

                    g.drawImage(variables.close, 0, 0, null);

                }
            };
        }
        but_cl.setBounds( f.getWidth()-55,5,50,50);
        but_cl.setBorderPainted(false);
        but_cl.setOpaque(false);
        but_cl.setContentAreaFilled(false);
        but_cl.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });
        p.add(but_cl);


    }

}
