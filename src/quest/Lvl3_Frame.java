package quest;

import game.Button;
import game3.Hospitale_Room;
import game3.House;
import game3.Office;
import game3.Shop;
import main.MainBut;
import main.variables;
import player.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lvl3_Frame {
    public static JFrame open_frame=null;
    public static JPanel open_panel ;
    public static JButton yes=null;
    public static JButton no=null;
    public Lvl3_Frame(){
        Player.ee=false;
        if(open_frame==null){
            open_frame = new JFrame();
            open_frame.setUndecorated(true);
            open_frame.setBounds(variables.width/2-variables.width/6,variables.height/2-variables.height/6,variables.width/3,variables.height/3);

        }
      open_frame.setVisible(true);
        open_panel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);


                    g.drawImage(variables.white_fon,0,0,null);


                //при столкновении брать тип и по типу добавлять картинку "не получил задание для входа в здание или получите задание для входа в здание"
            }
            };

        if(yes==null) {
              yes = new JButton() {
               @Override
                   protected void paintComponent(Graphics g) {
                     super.paintComponent(g);

                     g.drawImage(variables.welcome, 0, 0, null);

                         }
                     };
            }
        yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    game.Button.but_3.setVisible(true);
                }
                catch(NullPointerException nullPointerException) {
                    MainBut but_3 = new MainBut();
                    variables.MainPanel.add(but_3);
                }


                switch(House.w_h){
                    case 0: System.out.println("просто дом"); if(Office.t_2||Office.t_3||Office.t_4)

                        variables.gameLvl=-6;
                        Button.but.setVisible(false);
                        variables.MainPanel.repaint();

                        break;
                    case 1: System.out.println("Вошел в больницу");  if(Office.t_1)


                        new Hospitale_Room(); break;
                    case 2: System.out.println("Вошел в КЦВ");       new Office(); break;
                    case 3: System.out.println("Вошел в магазин");   if(Office.t_2||Office.t_3)
                        new Shop();break;
                }
                Lvl3_Frame.open_frame.dispose();
            }
        });
        yes.setBounds(0,0,variables.welcome.getWidth(null),variables.welcome.getHeight(null));
        yes.setVisible(true);
        yes.setBorderPainted(false);
        yes.setOpaque(false);
        yes.setContentAreaFilled(false);
        open_panel.add(yes);

        //yes.MenuButt(17,"Войти в здание",    10,    10,    open_panel);

        if(no==null) {
            no = new JButton() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);

                    g.drawImage(variables.welcome, 0, 0, null);

                }
            };
        }
        no.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Lvl3_Frame.open_frame.dispose();
            }
        });
        no.setBounds(0,60,variables.welcome.getWidth(null),variables.welcome.getHeight(null));
        no.setVisible(true);
        no.setBorderPainted(false);
        no.setOpaque(false);
        no.setContentAreaFilled(false);
        open_panel.add(no);
       // no.MenuButt(18,"Не входить в здание",10,50,open_panel);

        open_panel.setLayout(null);
        open_frame.add(open_panel);

    }

}
