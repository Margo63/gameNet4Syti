package game1;

import game.Street;
import main.variables;

import javax.swing.*;

public class Instance {
	
	
	public static NPS Granny;
	public static Home green;
	public static Home red;
	public static Home blue;
	public static Home orange;
	public static Home gray;
	
	public static Trash paper;
	public static Trash paper_2;
	public static Trash plastic;
	public static Trash met;
	public static Trash org;
	public static Trash glass;
	public static Trash apple;
	public static Trash cardboard;
	public static Trash cap;
	public static Trash cd;
	public static Trash chips;
	public static Trash plastic_bag;
	public static Trash container;
	
	public static Container cont_pap;
	public static Container cont_pl;
	public static Container cont_org;
	public static Container cont_gl;
	public static Container cont_met;
	public static Container cont_sim;
	
	public static Street street;
	public static Street gray_street;
	public static Street gray_street2;
	public static Street transition;
	public static Car car1;
	public static Car car2;


	int s=variables.height-variables.street.getHeight(null)-variables.gray_street.getHeight(null);
	int gs=variables.height-variables.gray_street.getHeight(null);
	int gs2=variables.height-variables.street.getHeight(null)-2*variables.gray_street.getHeight(null)+300;
	int tr=variables.height-variables.street.getHeight(null)-variables.gray_street.getHeight(null)+300;

//	int s=variables.height-variables.height/3-variables.height/12;
//	int gs=variables.height-variables.height/12;
//	int gs2 = variables.height-variables.height/3-variables.height/6;
//	int tr =variables.height-variables.height/3-variables.height/12;
	int c=variables.height-variables.height/3-variables.height/6-variables.car.getHeight(null);
	int c2=variables.height-variables.height/3-variables.height/6-variables.car_gasoline.getHeight(null)+50;
	int house=variables.height-variables.height/3-variables.height/6-variables.orange.getHeight(null);
	int house2=variables.height-variables.height/3-variables.height/6-variables.blue.getHeight(null);
	int house3=variables.height-variables.height/3-variables.height/6-variables.gray.getHeight(null);

	
	//создание объектов
	public Instance() {
	
			home();
			trash();
	
		
	}
	
	void granny() {
	//	green = new Home(720, 320, variables.red);

	}
	 
	

	
	
	void home(){
		
		
	/*	green = new Home(719, 190, variables.green);
		red = new Home(400, 190, variables.red);
		blue = new Home(650, 190, variables.blue);
		orange = new Home(70, 190, variables.orange);
		gray = new Home(956, 190, variables.gray);
		*/
		
		//green = new Home(780, 10, variables.green);
		//red = new Home(290, 10, variables.red);
		blue = new Home(550, house2, variables.blue);
		orange = new Home(-90, house, variables.orange);
		gray = new Home(1020, house3, variables.gray);


		street = new Street(variables.street,0,s,2);

		gray_street = new Street(variables.gray_street,0,gs,2);
		gray_street2 = new Street(variables.gray_street,0,gs2,2);
		
		transition = new Street(variables.tr,880,tr,1);

		car1 = new Car(variables.car_gasoline,450,c2,1,false);
		car2 = new Car(variables.car,800,c,2,false);



		for (int i = 0; i<6; i++) {
			car2.images[i] =
					new ImageIcon("image/1/car+dog_"+i+".png").getImage();
		}
		car2.img = car2.images[0];
		car2.animation();
	}
	void trash() {
		
		
	    if(!Trash.num1)	    paper = new Trash(600,400,variables.m_2,2,      1);
		if(!Trash.num2)	    plastic = new Trash(400,500,variables.plastic,1,2);
		if(!Trash.num3)	    met = new Trash(100,510,variables.met,5,        3);
		if(!Trash.num4)	    org = new Trash(600,500,variables.org,4,        4);
		if(!Trash.num5)	    glass = new Trash(323,444,variables.glass,3,    5);

		if(!Trash.num6)	    apple = new Trash(700,444,variables.apple,4,    6);
		if(!Trash.num7)	    cd = new Trash(500,444,variables.cd,0,          7);
		if(!Trash.num8)	    container = new Trash(600,600,variables.container,0,8);
		if(!Trash.num9)	    plastic_bag = new Trash(800,444,variables.plastic_bag,0,9);
		if(!Trash.num10) 	cardboard = new Trash(666,444,variables.cardboard,2,    10);
		if(!Trash.num11)	cap = new Trash(289,400,variables.cap,5,        11);
		if(!Trash.num12)	chips = new Trash(323,500,variables.chips,0,    12);
		if(!Trash.num13)	paper_2 = new Trash(300,380,variables.m_2,2,    13);
		
		cont_pap = new Container(0,600,variables.cont_pap,2);
		cont_pl = new Container(900,600,variables.cont_pl,1);
		cont_gl = new Container(200,600,variables.cont_gl,3);
		cont_met = new Container(400,600,variables.cont_met,5);
		cont_org = new Container(500,600,variables.cont_org,4);
		cont_sim = new Container(300,600,variables.cont_sim,0);


		
		//cont_pl = new Trash(110,600,variables.cont_pl,1);
		//cont_gl = new Trash(220,600,variables.cont_gl,3);
		//cont_org = new Trash(330,600,variables.cont_org,4);
		//cont_m = new Trash(440,600,variables.cont_met,5);
		
		
	}
	
	/*
	 * 		red=new collision(variables.red);
		red.x=350;
		red.y=-320;
	
		green=new collision(variables.green);
		green.x=720;
		green.y=70;
		
		blue=new collision(variables.blue);
		blue.x=650;
		blue.y=-420;
		
		orange=new collision(variables.orange);
		orange.x=7;
		orange.y=-95;
		
		gray=new collision(variables.gray);
		gray.x=970;
		gray.y=270;
	 */
}
