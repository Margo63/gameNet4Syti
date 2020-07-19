package game1;

import javax.swing.JLabel;

import javax.swing.JPanel;

public class Number {
	int point;
	JLabel labe;
	
	Number (JLabel l, int point,JPanel p) {
	this.point=point;
	this.labe = l;
	if(point==1) l.setText("x1");
    if(point==2) l.setText("x2");
	if(point==3) l.setText("x3");
	
}
	
}
