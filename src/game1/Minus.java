package game1;

import main.variables;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Minus {
    public static Timer tt;


    public static boolean min;

    public static int minus_x=100,minus_y=300;


    public Minus(){

        if (tt != null && tt.isRunning()) return;

        tt= new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                minus_y--;
                if(minus_y<200) {
                    min=false;
                    minus_y=300;
                }
                variables.MainPanel.repaint();
            }
        });
        tt.start();
    }
}
