package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Time_Police {
    public static Timer t;
    public static int time;


 public   Time_Police() {

        t= new Timer(3, new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                time++;
System.out.println(time);
                if(time==1000) {

                   //System.exit(0);
                    t.stop();
                    time=0;
                }
            }
        });
        t.start();
    }
}
