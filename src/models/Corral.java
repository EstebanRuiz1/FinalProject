package models;

public class Corral {

	private double energy;
	private double water;
	private int foodPackage;
	private int calPackage;
	private int cascPackage;

	
	public Corral(double energy, double water, int foodPackage, int calPackage, int cascPackage) {
		this.energy = energy;
		this.water = water;
		this.foodPackage = foodPackage;
		this.calPackage = calPackage;
		this.cascPackage =cascPackage;
	}
	public void setEnergy(double energy){
		this.energy = energy;
	}
	public double getEnergy(){
		return this.energy ;
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
		return new Object[]{energy, water, foodPackage, calPackage, cascPackage};
	}


	
	
}
