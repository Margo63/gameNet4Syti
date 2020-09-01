package game3;

import game.Button;
import game1.Point;
import main.MainBut;
import main.variables;
import player.Player;
import quest.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Flat {
    //1-квартира1  2-квартира2
    public static int type_frame;
    public int x, y;
    public Image image;
    public int type;
    public JButton but_ask;
    public static  JFrame f_ask=null,f_dog=null,f_no=null,f_not_all=null;
    public static JPanel p_ask,p_dog,p_no,p_not_all;
    public  boolean collisTrue2=false;
    boolean but_true1=false,but_true2=false,but_true3=false,but_true4=false;
    public boolean e_flat=false;


    public Flat(int x,int y,Image image,int type,boolean e_flat) {
      this.e_flat=e_flat;
      this.image=image;
      this.x=x;
      this.y=y;
      this.type=type;
    }

    public void coll() {
        if (game3.Panel.player.x+game3.Panel.player.directionX*3+game3.Panel.player.pers.getWidth(null)-20>=x &&
                game3.Panel.player.x+game3.Panel.player.directionX*3-20<=x+image.getWidth(null) &&
                game3.Panel.player.y+game3.Panel.player.directionY*3<y+image.getHeight(null)-20 &&
                game3.Panel.player.y+game3.Panel.player.directionY*3+game3.Panel.player.pers.getHeight(null)>=y-20) {
            e_flat=true;
            collisTrue2=true;
            type_frame=type;

//            System.out.println(type_frame);
//
//            System.out.println("dogi1"+variables.dog1);
//            System.out.println("dogi2"+variables.dog2);
            if(Player.ee) {
                switch (type) {
                    case 1: // type_frame=1;

                        if (Office.t_2) {

                            if (Fruit.f_4 && Vegetables.v_5 && Bread.b_3 && Milk.mi_1 && Grocery.g_2 && Meat.me_1) {
                                but_true1 = true;
                                frame();

                            } else {
                                frame_not_all();
                            }
                        } else {
                            frame_no();
                        }

                        break;

                    case 2:  //type_frame=2;

                        if (Office.t_3) {
                            if (Fruit.f_3 && Vegetables.v_1 && Bread.b_1 && Milk.mi_4 && Grocery.g_7 && Meat.me_3 && Candy.c_3) {
                                but_true2 = true;
                                frame();

                            } else {
                                frame_not_all();
                            }
                        } else {
                            frame_no();
                        }

                        break;

                    case 3:
                        if (Office.t_4) {
                            if (variables.dog1 == false) {

                                frame();
                            } else {
                                frame_not_all();
                            }
                        } else {
                            frame_no();
                        }
                        break;

                    case 4:
                        if (Office.t_4) {
                            if (variables.dog2 == false) {

                                frame();
                            } else {
                                frame_not_all();
                            }

                        } else {
                            frame_no();
                        }

                        break;
                    case 5:

                        frame_no();

                        break;


                }
                Player.ee=false;
            }




        }
        else{
            e_flat=false;
            collisTrue2=false;
        }
    }

    public void frame(){


        if(f_ask==null){
            f_ask = new JFrame();
            f_ask.setUndecorated(true);
            f_ask.setBounds(variables.width/2-variables.width/6,variables.height/2-variables.height/6,variables.width/3,variables.height/3);

        }
         f_ask.setVisible(true);
         p_ask = new JPanel(){
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);



               // g.drawImage(variables.blood_ask,0,0,null);//отдать продукты
                switch(type_frame){
                    case 1:  g.drawImage(variables.mol,0,0,null); break;//отдать продукты
                    case 2:  g.drawImage(variables.blood_ask,0,0,null); break;
                    case 3:  g.drawImage(new ImageIcon("image/game3/text/dog.png").getImage(),0,0,null); break;
                    case 4:  g.drawImage(new ImageIcon("image/game3/text/dog.png").getImage(),0,0,null); break;
                }




                   }
        };
        p_ask.setLayout(null);

            but_ask = new JButton("ok");

            but_ask.setBounds(100, 200, 150, 50);
            but_ask.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    f_ask.dispose();
                    switch (Flat.type_frame) {
                        case 1:

                            Fruit.f_4 = false;
                            Vegetables.v_5 = false;
                            Bread.b_3 = false;
                            Milk.mi_1 = false;
                            Grocery.g_2 = false;
                            Meat.me_1 = false;
                            game1.Container.point++;
                            game1.Point.pl = true;
                            new game1.Point();
                            Office.x2 = 0;
                            Office.t_2 = false;
                            Office.p_office.repaint();
                            Office.task_2.repaint();

                            break;
                        case 2:
                            Fruit.f_3 = false;
                            Vegetables.v_1 = false;
                            Bread.b_1 = false;
                            Milk.mi_4 = false;
                            Grocery.g_7 = false;
                            Meat.me_3 = false;
                            Candy.c_3 = false;
                            game1.Container.point++;
                            game1.Point.pl = true;
                            new Point();

                            Office.x3 = 0;
                            Office.t_3 = false;
                            Office.p_office.repaint();
                            Office.task_3.repaint();

                            break;


                        case 3:
                            variables.dog1=true;
                            if(variables.dog2){
                                for (int i = 1; i<7; i++) {
                                    variables.playerAnim[i-1] = new ImageIcon("image/1/pers/e" +i+ ".png").getImage();
                                    variables.playerAnimmRight[i-1]= new ImageIcon("image/1/pers/l"+i+".png").getImage();
                                    variables.playerAnimmLeft[i-1]= new ImageIcon("image/1/pers/r"+i+".png").getImage();
                                    variables.playerAnimmUp[i-1]= new ImageIcon("image/1/pers/f"+i+".png").getImage();
                                    variables. playerAnimmDown[i-1]= new ImageIcon("image/1/pers/b"+i+".png").getImage();
                                }
                            }
                            else {
                                for (int i = 1; i < 7; i++) {
                                    variables.playerAnim[i - 1] = new ImageIcon("image/1/pers/e" + i + ".png").getImage();
                                    variables.playerAnimmRight[i - 1] = new ImageIcon("image/1/pers/l" + i + ".png").getImage();
                                    variables.playerAnimmLeft[i - 1] = new ImageIcon("image/1/pers/l" + i + ".png").getImage();
                                    variables.playerAnimmUp[i - 1] = new ImageIcon("image/1/pers/f" + i + ".png").getImage();
                                    variables.playerAnimmDown[i - 1] = new ImageIcon("image/1/pers/b" + i + ".png").getImage();
                                }
                            }
                            break;

                        case 4:

                        variables.dog2=true;
                            if(variables.dog1){
                                for (int i = 1; i<7; i++) {
                                    variables.playerAnim[i-1] = new ImageIcon("image/1/pers/e" +i+ ".png").getImage();
                                    variables.playerAnimmRight[i-1]= new ImageIcon("image/1/pers/l"+i+".png").getImage();
                                    variables.playerAnimmLeft[i-1]= new ImageIcon("image/1/pers/r"+i+".png").getImage();
                                    variables.playerAnimmUp[i-1]= new ImageIcon("image/1/pers/f"+i+".png").getImage();
                                    variables. playerAnimmDown[i-1]= new ImageIcon("image/1/pers/b"+i+".png").getImage();
                                }
                            }
                            else {
                                for (int i = 1; i < 7; i++) {
                                    variables.playerAnim[i - 1] = new ImageIcon("image/1/pers/e" + i + ".png").getImage();
                                    variables.playerAnimmRight[i - 1] = new ImageIcon("image/1/pers/l" + i + ".png").getImage();
                                    variables.playerAnimmLeft[i - 1] = new ImageIcon("image/1/pers/l" + i + ".png").getImage();
                                    variables.playerAnimmUp[i - 1] = new ImageIcon("image/1/pers/f" + i + ".png").getImage();
                                    variables.playerAnimmDown[i - 1] = new ImageIcon("image/1/pers/b" + i + ".png").getImage();
                                }
                            }
                            break;





                    }

                    p_ask.repaint();
                }

            });
            but_ask.setVisible(true);

          p_ask.add(but_ask);


        f_ask.add(p_ask);
    }


    public void frame_no(){
        if(f_no==null){
            f_no = new JFrame();
            f_no.setUndecorated(true);
            f_no.setBounds(variables.width/2-variables.width/6,variables.height/2-variables.height/6,variables.width/3+50,variables.height/3);

        }
        f_no.setVisible(true);
        p_no = new JPanel(){
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
               g.drawImage(new ImageIcon("image/game3/text/no.png").getImage(),0,0,null);


            }
        };
        p_no.setLayout(null);

        Button.but_close(p_no,f_no);
        f_no.add(p_no);
    }
    public void frame_not_all(){
        if(f_not_all==null){
            f_not_all = new JFrame();
            f_not_all.setUndecorated(true);
            f_not_all.setBounds(variables.width/2-variables.width/6,variables.height/2-variables.height/6,variables.width/3+50,variables.height/3);

        }
        f_not_all.setVisible(true);
        p_not_all = new JPanel(){
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                switch(type_frame){
                    case 1:
                        g.drawImage(new ImageIcon("image/game3/text/not_all.png").getImage(),0,0,null);

                        break;
                    case 2:g.drawImage(new ImageIcon("image/game3/text/not_all.png").getImage(),0,0,null);break;
                    case 3:break;
                    case 4:break;

                }



            }
        };
        p_not_all.setLayout(null);

        Button.but_close(p_not_all,f_not_all);
        f_not_all.add(p_not_all);
    }
    public void move() {
        x-=game3.Panel.player.directionX;
        y-=game3.Panel.player.directionY;
    }

}