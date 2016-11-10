package net.andreu.vullSerRei;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Mapa {

	private int n_comtes = 1;
	private int n_files = 10;
	private int n_columnes = 10;
	
	private int AMPLADA_PANTALLA;
	private int ALTURA_PANTALLA;

	List<Comarca> comarques = new ArrayList<Comarca>();
	List<Cavaller> cavallers = new ArrayList<Cavaller>();
	
	Random r = new Random();

	public Mapa(int AMPLADA_PANTALLA, int ALTURA_PANTALLA) {
		this.AMPLADA_PANTALLA = AMPLADA_PANTALLA;
		this.ALTURA_PANTALLA = ALTURA_PANTALLA;
		generaTauler();
	}
	
	public void generaTauler(){
		
		for(int i=0; i<n_files; i++){
			for(int j=0; j<n_columnes; j++){
				comarques.add(new Comarca(i, j, r.nextBoolean(), "blanc"));
			}
		}
		
	}
	
	public List<Comarca> getComarques() {
		return comarques;
	}
	
	public void juga(){
		
		
	}
	
	// para el joc
	public boolean gameOver() {
		//return (cavallers.size() <= 1);
		return false;
	}
}
