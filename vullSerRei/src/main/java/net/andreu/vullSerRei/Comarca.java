package net.andreu.vullSerRei;

import acm.graphics.GImage;

public class Comarca {
	
	protected GImage imatge;
	public GImage getImatge() {
		return imatge;
	}

	private int fila = 0;
	private int columne = 0;
	private boolean teCastell;
	private String color;
	
	public Comarca(int fila, int columne, boolean teCastell, String color) {
		super();
		this.fila = fila;
		this.columne = columne;
		this.teCastell = teCastell;
		this.color = color;
		
		if(teCastell){
			imatge = new GImage("castell.png");
		}
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumne() {
		return columne;
	}

	public void setColumne(int columne) {
		this.columne = columne;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isTeCastell() {
		return teCastell;
	}
}
