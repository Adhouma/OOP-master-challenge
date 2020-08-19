package com.learnJava;

public class Additions {
	// Fields
	// price 1.00$
	private int lettuce; 
	// price 1.25$
	private int tomato; 
	// price 0.25$
	private int carrot;
	// price 3.00$
	private int soda;
	// price 1.50$
	private int crips;
	// price 0.50$
	private int onion;
	
	// Constructor
	public Additions(int lettuce, int tomato, int carrot, int soda, int crips, int onion) {
		this.lettuce = lettuce;
		this.tomato = tomato;
		this.carrot = carrot;
		this.soda = soda;
		this.crips = crips;
		this.onion = onion;
	}

	// Methods
	public double calculatePrice() {
		return (this.lettuce * 1.00) + (this.tomato * 1.25) + (this.carrot * 0.25) 
				+ (this.soda * 3.00) + (this.crips * 1.50) + (this.onion * 0.50);
	}
	
	// Getters and setters
	public int getLettuce() {
		return lettuce;
	}

	public void setLettuce(int lettuce) {
		this.lettuce = lettuce;
	}

	public int getTomato() {
		return tomato;
	}

	public void setTomato(int tomato) {
		this.tomato = tomato;
	}

	public int getCarrot() {
		return carrot;
	}

	public void setCarrot(int carrot) {
		this.carrot = carrot;
	}

	public int getSoda() {
		return soda;
	}

	public void setSoda(int soda) {
		this.soda = soda;
	}
	
}
