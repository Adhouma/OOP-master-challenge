package com.learnJava;

public class Hamburger {
	// Fields
	private String name;
	private String bread;
	private String meat;
	private Additions additions;
	
	// Constructor
	public Hamburger(String name, String bread, String meat) {
		this.name = name;
		this.bread = bread;
		this.meat = meat;
		// lettuce, tomato, carrot, soda, crips, onion
		this.additions = new Additions(1, 1, 1, 1, 0, 0);
	}

	// Methods
	public double calculatePrice() {
		// Hamburger base price = 5.00$
		return 5.00 + this.additions.calculatePrice();
	}
	
	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getBread() {
		return bread;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public Additions getAdditions() {
		return additions;
	}

	public void setAdditions(Additions additions) {
		this.additions = additions;
	}
	
}
