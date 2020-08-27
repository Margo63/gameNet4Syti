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
	public static Home red2;
	
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
	public static Street street2;
	public static Street gray_street;
	public static Street gray_street2;
	public static Street transition;

	public static Car car1;
	public static Car car2;


	int s=variables.height-variables.street.getHeight(null)-variables.gray_street.getHeight(null)+70;
	int gs=variables.height-variables.gray_street.getHeight(null) +70;
	int gs2=variables.height-variables.street.getHeight(null)-2*variables.gray_street.getHeight(null) +70;
	int tr=variables.height-variables.street.getHeight(null)-variables.gray_street.getHeight(null) +70;

//	int s=variables.height-variables.height/3-variables.height/12;
//	int gs=variables.height-variables.height/12;
//	int gs2 = variables.height-variables.height/3-variables.height/6;
//	int tr =variables.height-variables.height/3-variables.height/12;


	int c=variables.height-variables.street.getHeight(null)-2*variables.gray_street.getHeight(null)-variables.car.getHeight(null) +70;
	int c2=variables.height-variables.street.getHeight(null)-2*variables.gray_street.getHeight(null)-variables.car_gasoline.getHeight(null)+25 +70;

	int house=variables.height-variables.street.getHeight(null)-2*variables.gray_street.getHeight(null)-variables.orange.getHeight(null) +70;
	int house2=variables.height-variables.street.getHeight(null)-2*variables.gray_street.getHeight(null)-variables.blue.getHeight(null) +70;
	int house3=variables.height-variables.street.getHeight(null)-2*variables.gray_street.getHeight(null)-variables.gray.getHeight(null) +70;

	int cont1=variables.height-variables.street.getHeight(null)-2*variables.gray_street.getHeight(null)-variables.cont.getHeight(null)+25 +70;
	int cont2=variables.height-variables.cont.getHeight(null) +70;
	int ym=variables.height-variables.street.getHeight(null)-2*variables.gray_street.getHeight(null)+25 +70;
	
	//создание объектов
	public Instance() {
	
			home();
			trash();
	
		
	}
	
	void granny() {
	//	green = new Home(720, 320, variables.red);

	}
	 
	

	
	
	void home(){
		green = new Home(variables.orange.getWidth(null)-100+variables.car_gasoline.getWidth(null)+500, house-100, variables.orange);
		red = new Home(100, house3-100, variables.gray);
		red2 = new Home(100, house3-100, variables.orange);


		blue = new Home(variables.orange.getWidth(null)-100+variables.car_gasoline.getWidth(null), house2, variables.blue);
		orange = new Home(-100, house, variables.orange);
		gray = new Home(variables.blue.getWidth(null)+variables.orange.getWidth(null)-100+variables.car_gasoline.getWidth(null)+variables.car.getWidth(null), house3, variables.gray);

		street = new Street(variables.street,700-variables.street.getWidth(null),s,3);
		street2 = new Street(variables.street,700+variables.tr.getWidth(null),s,3);

		gray_street = new Street(variables.gray_street,0,gs,2);
		gray_street2 = new Street(variables.gray_street,0,gs2,2);
		
		transition = new Street(variables.tr,700,tr,1);

		car1 = new Car(variables.car_gasoline,variables.orange.getWidth(null)-100,c2,1,false);
		car2 = new Car(variables.car,variables.blue.getWidth(null)+variables.orange.getWidth(null)-100+variables.car_gasoline.getWidth(null),c,2,false);



		for (int i = 0; i<6; i++) {
			car2.images[i] =
					new ImageIcon("image/1/car+dog_"+i+".png").getImage();
		}
		car2.img = car2.images[0];
		car2.animation();
	}
	void trash() {
		
		
	    if(!Trash.num1)	{     paper = new Trash      (1000,gs, variables.m_2,        2,1); }
		if(!Trash.num2) {     plastic = new Trash    (400, gs, variables.plastic,    1,2); }
		if(!Trash.num3) {     met = new Trash        (50,  gs, variables.met,        5,3); }
		if(!Trash.num4)	{     org = new Trash        (1680,gs2, variables.org,       4,4); }
		if(!Trash.num5) {	  glass = new Trash      (1500,gs, variables.glass,      3,5); }

		if(!Trash.num6)	{     apple = new Trash      (700, gs, variables.apple,      4,6); }
		if(!Trash.num7)	{     cd = new Trash         (100, gs2,variables.cd,         0,7); }
		if(!Trash.num8)	{     container = new Trash  (1700,gs, variables.container,  0,8); }
		if(!Trash.num9)	{     plastic_bag = new Trash(720,gs2+70,variables.plastic_bag,0,9); }
		if(!Trash.num10){     cardboard = new Trash  (900, gs2,variables.cardboard,  2,10);}
		if(!Trash.num11){	  cap = new Trash        (1400,gs2,variables.cap,        5,11);}
		if(!Trash.num12){	  chips = new Trash      (300, gs2,variables.chips,      0,12);}
		if(!Trash.num13){	  paper_2 = new Trash    (500, gs2,variables.m_2,        2,13);}

		cont_pap = new Container(0,   cont1,variables.cont_pap,2,false);
		cont_pl = new Container( 900, cont2,variables.cont_pl, 1,false);
		cont_gl = new Container( 200, cont2,variables.cont_gl, 3,false);
		cont_met = new Container(1000,cont1,variables.cont_met,5,false);
		cont_org = new Container(500, cont2,variables.cont_org,4,false);
		cont_sim = new Container(1500,cont1,variables.cont_sim,0,false);

	}
	

}
