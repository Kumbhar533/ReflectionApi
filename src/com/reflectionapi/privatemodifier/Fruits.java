package com.reflectionapi.privatemodifier;

public class Fruits {

	public String fruitName;

	public String fruitColur;

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getFruitColur() {
		return fruitColur;
	}

	public void setFruitColur(String fruitColur) {
		this.fruitColur = fruitColur;
	}

	public Fruits(String fruitName, String fruitColur) {
		super();
		this.fruitName = fruitName;
		this.fruitColur = fruitColur;
	}

	public Fruits() {
		super();

	}

}
