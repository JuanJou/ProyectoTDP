package Objetos;

import java.awt.Point;

import javax.swing.ImageIcon;

public class Pasto extends Obstaculo {

	public Pasto(Point m,ImageIcon[] i){
		posicion=m;
		imagen=i;
	}
	
	
	
	@Override
	public void colisionar() {
		// TODO Auto-generated method stub

	}

}