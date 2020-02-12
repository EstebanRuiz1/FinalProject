package models;

public enum ChickenType{
	
	CHICKEN_ONE("Pollos Ecuatorianos"),
	CHICKEN_TWO("Pollos Blancos"),
	CHICKEN_THREE("Polla Negra");

	private String label;

	ChickenType(String label){
		this.label = label;
	} 
	public String getLabel(){
		return label;

	}
}