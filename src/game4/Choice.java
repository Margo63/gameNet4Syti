package game4;

import game.Button;
import game1.Container;
import main.MainBut;
import main.MainFrame;
import main.variables;
import player.Player;
import selection.selectionGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Choice {//номера кнопок с 1**
    public static Player player;
    public static boolean trueButChoice;
    public static JButton q_b0,q_b1,q_b2,q_b3,q_b4,q_b5,q_b6,q_b7,q_b8,q_b9;
    int y1=70,y2=y1+10+variables.q1.getHeight(null),
            y3=y2+10+variables.q2.getHeight(null),
            y4=y3+10+variables.q3.getHeight(null),
            y5=y4+10+variables.q4.getHeight(null),
            y6=y5+10+variables.q5.getHeight(null),
            y7=y6+10+variables.q6.getHeight(null),
            y8=y7+10+variables.q7.getHeight(null),
            y9=y8+10+variables.q8.getHeight(null),
            y10=y9+10+variables.q9.getHeight(null);
    public Choice(){
//        player =new player.Player();
//        player.array = variables.playerAnim;
//        player.pers = variables.player;
//        player.x = 0;
//        player.y = 400;
//        player.arrayD = variables.playerAnimmDown;
//        player.arrayR = variables.playerAnimmRight;
//        player.arrayL = variables.playerAnimmLeft;
//        player.arrayU = variables.playerAnimmUp;
//        new player.Player();
        trueButChoice = true;
      but();
if(variables.gameLvl==4) {
    q_b0 = new JButton(){
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(variables.q1,0,0,null);
        }
    };
    q_b0.setVisible(true);
    q_b0.setBounds(130, y1,variables.q1.getWidth(null),50);
    q_b0.setOpaque(false);
    q_b0.setContentAreaFilled(false);
    q_b0.setBorderPainted(false);
    q_b0.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(Container.point>0){
                q_b0.setVisible(false);
                Container.point--;
            }


        }
    });

    variables.MainPanel.add(q_b0);


    q_b1 = new JButton(){
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(variables.q2,0,0,null);
        }
    };
    q_b1.setVisible(true);
    q_b1.setBounds(130, y2,variables.q2.getWidth(null),50);
    q_b1.setOpaque(false);
    q_b1.setContentAreaFilled(false);
    q_b1.setBorderPainted(false);
    q_b1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(Container.point>0) {
                q_b1.setVisible(false);
                Container.point--;
            }
        }
    });

    variables.MainPanel.add(q_b1);


    q_b2 = new JButton(){
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(variables.q3,0,0,null);
        }
    };
    q_b2.setVisible(true);
    q_b2.setBounds(130, y3,variables.q3.getWidth(null),50);
    q_b2.setOpaque(false);
    q_b2.setContentAreaFilled(false);
    q_b2.setBorderPainted(false);
    q_b2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(Container.point>0) {
                q_b2.setVisible(false);
                Container.point--;
            }

        }
    });

    variables.MainPanel.add(q_b2);


    q_b3 = new JButton(){
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(variables.q4,0,0,null);
        }
    };
    q_b3.setVisible(true);
    q_b3.setBounds(130, y4,variables.q4.getWidth(null),50);
    q_b3.setOpaque(false);
    q_b3.setContentAreaFilled(false);
    q_b3.setBorderPainted(false);
    q_b3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(Container.point>0) {
                q_b3.setVisible(false);
                Container.point--;
            }
        }
    });

    variables.MainPanel.add(q_b3);


    q_b4 = new JButton(){
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(variables.q5,0,0,null);
        }
    };
    q_b4.setVisible(true);
    q_b4.setBounds(130, y5,variables.q5.getWidth(null),50);
    q_b4.setOpaque(false);
    q_b4.setContentAreaFilled(false);
    q_b4.setBorderPainted(false);
    q_b4.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(Container.point>0) {
                q_b4.setVisible(false);
                Container.point--;
            }
        }
    });

    variables.MainPanel.add(q_b4);


    q_b5 = new JButton(){
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(variables.q6,0,0,null);
        }
    };
    q_b5.setVisible(true);
    q_b5.setBounds(130, y6,variables.q6.getWidth(null),50);
    q_b5.setOpaque(false);
    q_b5.setContentAreaFilled(false);
    q_b5.setBorderPainted(false);
    q_b5.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(Container.point>0) {
                q_b5.setVisible(false);
                Container.point--;
            }
        }
    });

    variables.MainPanel.add(q_b5);


    q_b6 = new JButton(){
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(variables.q7,0,0,null);
        }
    };
    q_b6.setVisible(true);
    q_b6.setBounds(130, y7,variables.q7.getWidth(null),100);
    q_b6.setOpaque(false);
    q_b6.setContentAreaFilled(false);
    q_b6.setBorderPainted(false);
    q_b6.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(Container.point>0) {
                q_b6.setVisible(false);
                Container.point--;
            }
        }
    });

    variables.MainPanel.add(q_b6);

    q_b7 = new JButton(){
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(variables.q8,0,0,null);
        }
    };
    q_b7.setVisible(true);
    q_b7.setBounds(130, y8,variables.q8.getWidth(null),50);
    q_b7.setOpaque(false);
    q_b7.setContentAreaFilled(false);
    q_b7.setBorderPainted(false);
    q_b7.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(Container.point>0) {
                q_b7.setVisible(false);
                Container.point--;
            }
        }
    });

    variables.MainPanel.add(q_b7);

    q_b8 = new JButton(){
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(variables.q9,0,0,null);
        }
    };
    q_b8.setVisible(true);
    q_b8.setBounds(130, y9,variables.q9.getWidth(null),50);
    q_b8.setOpaque(false);
    q_b8.setContentAreaFilled(false);
    q_b8.setBorderPainted(false);
    q_b8.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(Container.point>0) {
                q_b8.setVisible(false);
                Container.point--;
            }
        }
    });

    variables.MainPanel.add(q_b8);


    q_b9 = new JButton(){
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(variables.q10,0,0,null);
        }
    };
    q_b9.setVisible(true);
    q_b9.setBounds(130, y10,variables.q10.getWidth(null),50);
    q_b9.setOpaque(false);
    q_b9.setContentAreaFilled(false);
    q_b9.setBorderPainted(false);
    q_b9.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(Container.point>0) {
                q_b9.setVisible(false);
                Container.point--;
            }
        }
    });

    variables.MainPanel.add(q_b9);

}
else{
     q_b0.setVisible(false);
     variables.MainPanel.repaint();
}
    }





    void but() {
        selectionGame.but3.setVisible(false);
        selectionGame.but7.setVisible(false);
        selectionGame.but6.setVisible(false);
        selectionGame.but8.setVisible(false);
        selectionGame.but9.setVisible(false);
        Button.button();

        variables.MainPanel.repaint();
        MainFrame.frame.setFocusable(true);
    }
}
