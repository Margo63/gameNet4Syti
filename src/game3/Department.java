package game3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Department extends JButton {

    public int kol;
    public int x0,y0;
    public Image im;
    public JPanel p;
    public static JPanel p_im;

    public void Product(int x,int y,Image im,JPanel p){

        this.p=p;
        this.im=im;
        this.x0=x;
        this.y0=y;
        this.setSize(50,50);
        p_im=new JPanel(){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);

                g.drawImage(im,x0,y0,null);
            }
        };
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kol++;
               x0+=150;
               y0+=150;
               p_im.repaint();
            }
        });

      p.add(this);
    }
}
