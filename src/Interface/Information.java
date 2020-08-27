package Interface;

import game.Button;
import game1.Container;
import main.variables;

import javax.swing.*;
import java.awt.*;

public class Information {
    public static JFrame frame_info;
    public static JPanel panel_info;




    public Information() {

        frame_info = new JFrame();
        frame_info.setUndecorated(true);
        frame_info.setSize(variables.width/2, variables.height/2);



        frame_info.setLocation(variables.width/2-variables.width/4, variables.height/2-variables.height/4);

        panel_info = new JPanel(){
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(variables.white_fon,0,0,variables.width,variables.height,null);


            }
        };

        panel_info.setLayout(null);


        //	JLabel label = new JLabel("ks");

        //	label.setLocation(frameI.getSize().width,frameI.getSize().height);



        //infoFrame.panelI.add(label);

        frame_info.add(panel_info); //добавляю на фрейм панель
        frame_info.setVisible(true); //делаю фрейм видимым
        Button.but_close(panel_info,frame_info);

    }
}
