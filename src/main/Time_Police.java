package main;

import selection.selectionGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Time_Police {
    public static Timer t;
    public static int time;
    public static JFrame frame=null;
    public static JPanel panel;

 public   Time_Police() {

        t= new Timer(3, new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                time++;

                if(time==759) {
                      frame();
                   //System.exit(0);
                    t.stop();
                    time=0;
                }
            }
        });
        t.start();
    }

   void  frame(){
     if(frame==null){
         frame= new JFrame();
         frame.setUndecorated(true);
         frame.setBounds(variables.width/2-variables.width/4,variables.height/2-variables.height/4,variables.width/2,variables.height/2);

     }
     frame.setVisible(true);

     frame.setFocusable(true);

     panel= new JPanel()
     {
         protected void paintComponent(Graphics g){
             super.paintComponent(g);
             g.drawImage(variables.close,0,0,variables.width/2,variables.height/2,null);

         }
     }   ;
     JButton b= new JButton(){
         protected void paintComponent(Graphics g){
             super.paintComponent(g);
             g.drawImage(variables.close,0,0,200,75,null);
         }
     };
     b.setBounds(frame.getWidth()-frame.getWidth()/2-100,frame.getHeight()-80,200,75);
     b.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             variables.first=false;
             frame.setFocusable(true);
             MainFrame.frame.setFocusable(false);
             frame.dispose();
             variables.gameLvl=-1;
             new selectionGame();
         }
     });
     panel.setLayout(null);
     panel.add(b);
     frame.add(panel);
    }
}
