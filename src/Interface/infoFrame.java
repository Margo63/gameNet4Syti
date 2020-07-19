package Interface;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import game1.Container;
import main.variables;

public class infoFrame {
	public static JFrame frameI;
	public static JFrame frameII;
	public static JPanel panelI;
	
	
	
	 public infoFrame() {
		
		frameI = new JFrame(); 
		frameI.setUndecorated(true); 
		frameI.setSize(variables.width/2, variables.height/2); 
		
	

		frameI.setLocation(variables.width/2-variables.width/4, variables.height/2-variables.height/4);
	
		infoFrame.panelI = new JPanel(){ 
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				variables.num =new ImageIcon("image/point/num"+Container.point+".png").getImage();
				
				g.drawImage(variables.num,10,10,null); 
			
			}
		};
		
		infoFrame.panelI.setLayout(null);
		
	
	//	JLabel label = new JLabel("ks");
		
	//	label.setLocation(frameI.getSize().width,frameI.getSize().height);

		
		
		//infoFrame.panelI.add(label);
		
		frameI.add(infoFrame.panelI); //�������� �� ����� ������
		frameI.setVisible(true); //����� ����� �������
		
	}
	 
	
}
