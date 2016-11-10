package net.andreu.vullSerRei;

import java.awt.Color;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

/**
 * Hello world!
 *
 */
public class App extends GraphicsProgram
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final int AMPLADA_PANTALLA = 1024;
	private static final int ALTURA_PANTALLA = 600;
	private double midaComarca;
	
	private Mapa tauler;

	
	public void init() {
		tauler = new Mapa(AMPLADA_PANTALLA, ALTURA_PANTALLA);
		midaComarca = 50;
		setSize(AMPLADA_PANTALLA, ALTURA_PANTALLA);
		
		
	}
	
	/**
	 * Programa principal...
	 */
	@Override
	public final void run() {
		
		clicaPerComencar();
		while(!tauler.gameOver()){
			for (Comarca c : tauler.getComarques()) {
				GRect g = new GRect(c.getColumne()*midaComarca,c.getFila()*midaComarca,midaComarca,midaComarca);
				g.setColor(new Color(0));
				add(g);
				//add(c.getImatge());
			}
			tauler.juga();
		}
	}
	
	private void clicaPerComencar() {
		GLabel label = new GLabel("Clica per comenÃ§ar");
		double x = (getWidth() - label.getWidth()) / 2;
		double y = (getHeight() + label.getAscent()) / 2;
		add(label, x, y);
		waitForClick();
		remove(label);
	}
}
