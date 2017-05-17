package com.example.kancolleatlas.data;

public class Ship {
	private String shipName;
	private String shipType;
	private int shipImg;
	private int shipTypeImg;
	private int normalImg;
	private int brokenImg;
	
	public String getshipName() {
		return shipName;
	}
	public void setshipName(String shipName) {
		this.shipName = shipName;
	}
	public String getshipType() {
		return shipType;
	}
	public void setshipType(String shipType) {
		this.shipType = shipType;
	}	
	
	public int getnormalImg() {
		return normalImg;
	}
	public void setnormalImg(int normalImg) {
		this.normalImg = normalImg;
	}
	
	public int getbrokenImg() {
		return brokenImg;
	}
	public void setbrokenImg(int brokenImg) {
		this.brokenImg = brokenImg;
	}
	
	public int getshipTypeImg() {
		return shipTypeImg;
	}
	public void setshipTypeImg(int shipTypeImg) {
		this.shipTypeImg = shipTypeImg;
	}
	
	public int getshipImg() {
		return shipImg;
	}
	public void setshipClass(int shipImg) {
		this.shipImg = shipImg;
	}
	
//	//給shiptypeact用的
//	public Ship(String shipName, String shipType, String shipImg) {
//		super();
//		this.shipName = shipName;
//		this.shipType = shipType;
//	}
	
	//給shipclassact用的
	public Ship(String shipName, String shipType, int shipImg) {
		super();
		this.shipName = shipName;
		this.shipType = shipType;
		this.shipImg = shipImg;
	}
	
//	public Ship(String shipName, String shipType, int shipImg, int normalImg, int brokenImg) {
//		super();
//		this.shipName = shipName;
//		this.shipType = shipType;
//		this.shipImg = shipImg;
//		this.normalImg = normalImg;
//		this.brokenImg = brokenImg;
//	}
	
}
