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

    public Choice(){
        player =new player.Player();
        player.array = variables.playerAnim;
        player.pers = variables.player;
        player.x = 0;
        player.y = 400;
        player.arrayD = variables.playerAnimmDown;
        player.arrayR = variables.playerAnimmRight;
        player.arrayL = variables.playerAnimmLeft;
        player.arrayU = variables.playerAnimmUp;
        new player.Player();
        trueButChoice = true;
      but();
if(variables.gameLvl==4) {
    q_b0 = new JButton(){
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(variables.flat_room,0,0,null);
        }
    };
    q_b0.setVisible(true);
    q_b0.setBounds(variables.width / 2 - 75, 100,150,50);
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
            g.drawImage(variables.flat_room,0,0,null);
        }
    };
    q_b1.setVisible(true);
    q_b1.setBounds(variables.width / 2 - 75, 160,150,50);
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
            g.drawImage(variables.flat_room,0,0,null);
        }
    };
    q_b2.setVisible(true);
    q_b2.setBounds(variables.width / 2 - 75, 220,150,50);
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
            g.drawImage(variables.flat_room,0,0,null);
        }
    };
    q_b3.setVisible(true);
    q_b3.setBounds(variables.width / 2 - 75, 280,150,50);
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
            g.drawImage(variables.flat_room,0,0,null);
        }
    };
    q_b4.setVisible(true);
    q_b4.setBounds(variables.width / 2 - 75, 340,150,50);
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
            g.drawImage(variables.flat_room,0,0,null);
        }
    };
    q_b5.setVisible(true);
    q_b5.setBounds(variables.width / 2 - 75, 400,150,50);
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
            g.drawImage(variables.flat_room,0,0,null);
        }
    };
    q_b6.setVisible(true);
    q_b6.setBounds(variables.width / 2 - 75, 460,150,50);
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
            g.drawImage(variables.flat_room,0,0,null);
        }
    };
    q_b7.setVisible(true);
    q_b7.setBounds(variables.width / 2 - 75, 520,150,50);
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
            g.drawImage(variables.flat_room,0,0,null);
        }
    };
    q_b8.setVisible(true);
    q_b8.setBounds(variables.width / 2 - 75, 580,150,50);
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
            g.drawImage(variables.flat_room,0,0,null);
        }
    };
    q_b9.setVisible(true);
    q_b9.setBounds(variables.width / 2 - 75, 640,150,50);
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
