package game1;

import java.awt.*;

import game.Button;
import main.variables;
import player.Player;
import quest.Quest;

import javax.swing.*;

public class Container {
	public Image img;
	public int x, y,type;
	public static int point;
	public static boolean cont1=false,cont2=false,cont3=false,cont4=false,cont5=false,cont0=false;
	public boolean collisTrue = false;
	public boolean e_cont=false;
	public JFrame frame=null;
	public JPanel panel;
	
Container(int x, int y, Image img,int type,boolean e_cont){
	 this.e_cont=e_cont;
	 this.x = x;
	 this.y = y;
	 this.img = img;
	 this.type= type;//1-�������, 2-������, 3-������, 4-������������, 5-������, 0-������ ��������������
}
public void trash_cont() {
	 if(Panel.player.x-Panel.player.directionX*5+Panel.player.pers.getWidth(null)>=x &&
				Panel.player.x-Panel.player.directionX*5<=x+img.getWidth(null) &&
				Panel.player.y+Panel.player.directionY*5<y+img.getHeight(null) &&
				Panel.player.y+Panel.player.directionY*5+Panel.player.pers.getHeight(null)>=y) {
		 //System.out.println(Container.a);
		 

		 
		 switch(type) {
		 	case 0: cont0=true;   cont1=false;  cont2=false;  cont3=false;  cont4=false;  cont5=false; Quest.container=0;  break;
		    case 1: cont0=false;  cont1=true;   cont2=false;  cont3=false;  cont4=false;  cont5=false; Quest.container=1;  break;
		    case 2: cont0=false;  cont1=false;  cont2=true;   cont3=false;  cont4=false;  cont5=false; Quest.container=2; break;
		    case 3: cont0=false;  cont1=false;  cont2=false;  cont3=true;   cont4=false;  cont5=false; Quest.container=3;  break;
		    case 4: cont0=false;  cont1=false;  cont2=false;  cont3=false;  cont4=true;   cont5=false; Quest.container=4;  break;
		    case 5: cont0=false;  cont1=false;  cont2=false;  cont3=false;  cont4=false;  cont5=true;  Quest.container=5;  break;
			 
		 }
		 e_cont=true;
		 if(Player.ee) {
			 new Quest();
			 Quest.f_quest.setVisible(true);
			 Player.ee=false;
			 if(type==0){
			 	frame();
			 }
		 }
		 collisTrue=true;
	 }
	 else{
	 	//Quest.f_quest.setVisible(false);
		 e_cont=false;
		 collisTrue=false;
	 }
	 
	
}
public void move_cont() {
	 
	x-=Panel.player.directionX/5;
	y-=Panel.player.directionY/5;
}



void frame(){
	if(frame==null){
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(variables.width/2+variables.width/6+40,variables.height/2-variables.height/6,variables.width/4,variables.height/3);

	}
	frame.setVisible(true);
	panel = new JPanel() {
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(variables.white_fon,  0, 0, variables.width,variables.height,   null);
			g.drawImage(variables.line2,  frame.getWidth()-2, 0, 2,variables.height,   null);
			g.drawImage(variables.line2,  0, 0, 2,variables.height,   null);
			g.drawImage(variables.line1,  0, 0, variables.width,2,   null);
			g.drawImage(variables.line1,  0, frame.getHeight()-2, variables.width,2,   null);
			//g.drawImage(variables.bord2,  0, 0, variables.width/4,variables.height/3,   null);

		}
	};
	panel.setLayout(null);
	frame.add(panel);
	Button.but_close(panel,frame);

}
}
	
