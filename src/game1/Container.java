package game1;

import java.awt.Image;

import quest.Quest;

public class Container {
	public Image img;
	public int x, y,type;
	public static int point;
	public static boolean cont1=false,cont2=false,cont3=false,cont4=false,cont5=false,cont0=false;
	public boolean collisTrue = false;
	
Container(int x, int y, Image img,int type){
	 this.x = x;
	 this.y = y;
	 this.img = img;
	 this.type= type;//1-пластик, 2-бумага, 3-стекло, 4-органический, 5-металл, 0-нельзя перерабатывать
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
		 
		 new Quest();
		 Quest.f_quest.setVisible(true);
		 collisTrue=true;
	 }
	 else{
	 	//Quest.f_quest.setVisible(false);
		 collisTrue=false;
	 }
	 
	
}
public void move_cont() {
	 
	x-=Panel.player.directionX/3;
	y-=Panel.player.directionY/3;
}
}
	
