package com.learnJava;

public class HealthyBurger extends Hamburger{
	// Fields
	private Additions additions;
	
	// Constructor
	public HealthyBurger(String name, String bread, String meat) {
		super(name, bread, meat);
		// lettuce, tomato, carrot, soda, crips, onion
		this.additions = new Additions(1, 1, 1, 1, 1, 1);
	}

	// Methods
	public double calculatePrice() {
		// Healthy burger price = 6.00$
		return 6.00 + this.additions.calculatePrice();
	}
	
	// Getters and setters
	public Additions getAdditions() {
		return additions;
	}

	public void setAdditions(Additions additions) {
		this.additions = additions;
	}

}
