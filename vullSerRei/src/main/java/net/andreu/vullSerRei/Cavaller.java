package net.andreu.vullSerRei;

import java.util.Random;

import acm.graphics.GImage;

public class Cavaller {

	private int vida;
	private GImage imatge;
	private int posicioX;
	private int posicioY;
	private int midaFinestraX;
	private int midaFinestraY;
	private boolean horizontal;
	private int direccio;
	private int velocitat;
	
	public Random rand = new Random();
	
	public Cavaller(int midaFinestraX, int midaFinestraY){
		vida = 1000;
		this.midaFinestraX = midaFinestraX;
		this.midaFinestraY = midaFinestraY;
		posicioX = rand.nextInt(midaFinestraX - 100);
		posicioY = rand.nextInt(midaFinestraY - 100);
		horizontal=rand.nextBoolean();
		velocitat = rand.nextInt(11) + 5;
		
		if (rand.nextBoolean() == true) {
			direccio = 1;
		} else {
			direccio = -1;
		}
		generaImatge();
	}

	private void generaImatge() {
		// TODO Auto-generated method stub
		
	}
}
