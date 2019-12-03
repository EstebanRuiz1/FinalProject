package models;

public class Corral {
	public static final int MAXIUM_CORRAL_FILL = 299;
	private Chicken[] listChicken;
	private int counter;
	
	public Corral() {
		listChicken = new Chicken[MAXIUM_CORRAL_FILL];
		counter = 0;
	}

	public void setChicken(Chicken chicken) {
		listChicken[counter] = chicken;
		counter++;
	}
	
	public Chicken[] getListChicken() {
		return listChicken;
	}
	
	
}
