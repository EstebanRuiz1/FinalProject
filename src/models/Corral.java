package models;

public class Corral {
	private Chicken[] listChicken;
	private int counter;
	
	public Corral() {
		listChicken = new Chicken[300];
		counter = 0;
	}

	public void addChicken(Chicken chicken) {
		listChicken[counter] = chicken;
		counter++;
	}
	
	public Chicken[] getListChicken() {
		return listChicken;
	}
	
	
}
