package models;

import java.time.LocalDate;
import java.util.Random;

public class Poultry{

	Random ran = new Random();
	int life = ran.nextInt(99+1);
	private Corral[] listCorral;
	public static final int MAXIUM_CORRAL_FILL = 300;
	public static final int MAX_CORRAL_NUM = 10;

	public Poultry() {
		listCorral = new Corral[10];
		generateCorral();
	}
	public void addChicken(){

	}
	public void generateCorral() {
		for (int i = 0; i < listCorral.length; i++) {
			listCorral[i] = new Corral();
		}
	}
	public void choose(byte option){
		if (option == 1) {
			fillChicken();			
		}
	}
	
	public void fillChicken(){
		for (int i = 0; i < listCorral.length; i++) {
			for (int j = 0; j < listCorral[i].getListChicken().length; j++) {
				listCorral[i].setChicken(new Chicken());
			}
		}
	}	
}