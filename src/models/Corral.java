package models;

public class Corral {

	private double energyCost;
	private double water;
	private int foodPackage;
	private int calPackage;
	private int cascPackage;
	private int chickensTotal;
	private int deadChickens;
	private int selledChickens;
	private int chickensAvailable;

	
	public Corral(double energyCost, double water, int foodPackage, int calPackage, int cascPackage) {
		this.energyCost =energyCost;
		this.water = water;
		this.foodPackage = foodPackage;
		this.calPackage = calPackage;
		this.cascPackage =cascPackage;
	}
	public void seenergyCost(double energyCost){
		this.energyCost =energyCost;
	}
	public double geenergyCost(){
		return this.energyCost ;
	}

	public void setWater( double water){
		this.water = water;
	}
	public double getWater( ){
		return this.water ;
	}

	public void setFoodPackage(int foodPackage){
		this.foodPackage = foodPackage;
	}
	public int getFoodPackage(){
		return this.foodPackage;
	}

	public void setCalPackage(int calPackage){
		this.calPackage = calPackage;
	}
	public int getCalPackage(){
		return this.calPackage ;
	}

	public void setCascPackage(int cascPackage){
		this.cascPackage = cascPackage;
	}
	public int getCascPackage(){
		return this.cascPackage;
	}
	public Object[] objectSaver(){
		return new Object[]{energyCost, water, foodPackage, calPackage, cascPackage};
	}


	
	
}
