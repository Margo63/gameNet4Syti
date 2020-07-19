package game;

import main.MainBut;
import main.MainFrame;
import main.variables;

import javax.swing.*;

public class Button {
    public static MainBut but;
    public static MainBut but_3;

    public Button(){

    }

    public static void button_3(){

        but_3 = new MainBut();
        but_3.MenuButt(8,"Назад",variables.width-300,  0, variables.MainPanel);

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


      /*  try {
            but.setVisible(true);
        }
        catch(NullPointerException){
            JButton button = new JButton();//MainBut but = new MainBut();??
            variables.MainPanel.add(button);
        }*/


        //but_3.setVisible(false);
        variables.MainPanel.add(but);
        variables.MainPanel.repaint();

        but.setFocusable(false);
        MainFrame.frame.setFocusable(true);
    }

}
