package models;

public class Corral {

	private int foodPackage;
	private int calPackage;
	private int cascPackage;
	private int chickenTotal;
	private int deadChickens;
	private ChickenType chickenType;
		

	
	public Corral( ChickenType chickenType, int foodPackage, int calPackage, int cascPackage, int chickenTotal, int deadChickens) {
		this.chickenType = chickenType;
		this.foodPackage = foodPackage;
		this.calPackage = calPackage;
		this.cascPackage = cascPackage;
		this.chickenTotal = chickenTotal;
		this.deadChickens = deadChickens;
	}
	public void setChickenType(ChickenType chickenType){
		this.chickenType = chickenType;
	}
	public ChickenType getChickenType(){
		return this.chickenType;
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
		return this.calPackage;
	}

	public void setCascPackage(int cascPackage){
		this.cascPackage = cascPackage;
	}
	public int getCascPackage(){
		return this.cascPackage;
	}
	
	public int setChickensTotal(int chickensTotal){
		return this.chickenTotal = chickenTotal;
	}
	
	public int getChickensTotal(){
		return this.chickenTotal;
	}
	
	public int setDeadChikens(int deadChickens){
		return this.deadChickens = deadChickens;
	}
	public int getDeadChikens(){
		return this.deadChickens;
	}
	
	public Object[] objectSaver(){
		return new Object[]{chickenType.getLabel(), foodPackage, calPackage, cascPackage, chickenTotal, deadChickens};
	}


	
	
}
