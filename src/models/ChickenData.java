package models;

public enum ChickenData{
	ENERGY("energia"), 
	WATER("Agua"), 
	FOOD_PACKAGE("Bultos de comida"), 
	CAL_PACKAGE("Cal"), 
	CASC_PACKAGE("Cascarilla"); 

	private String label;

	ChickenData(String label){
		this.label = label;
	} 
	public String getLabel(){
		return label;

	}
}