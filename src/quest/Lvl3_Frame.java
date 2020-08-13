package quest;

import game3.Office;
import main.MainBut;
import main.variables;

import javax.swing.*;
import java.awt.*;

public class Lvl3_Frame {
    public static JFrame open_frame;
    public static JPanel open_panel ;
    public static MainBut yes;
    public static MainBut no;
    public static int kol_open=0;
    public Lvl3_Frame(){

        if(kol_open<1){
            kol_open++;
            open_frame = new JFrame();
            open_frame.setUndecorated(true);
            open_frame.setBounds(variables.width/2-variables.width/6,variables.height/2-variables.height/6,variables.width/3,variables.height/3);

        }
      open_frame.setVisible(true);
        open_panel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);


                    g.drawImage(variables.blood_ask,0,0,null);


                //при столкновении брать тип и по типу добавлять картинку "не получил задание для входа в здание или получите задание для входа в здание"
            }
            };


        yes = new MainBut();
        yes.MenuButt(17,"Войти в здание",    10,    10,    open_panel);
        no= new MainBut();
        no.MenuButt(18,"Не входить в здание",10,50,open_panel);

        open_panel.setLayout(null);
        open_frame.add(open_panel);

    }

}
