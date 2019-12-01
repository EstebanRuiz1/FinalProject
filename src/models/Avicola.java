package models;

import java.time.LocalDate;
import java.util.Random;

public class Avicola{

	private Corral[] listCorral;
	public static final int MAXIUM_CORRAL_FILL = 300;
	public static final int MAX_CORRAL_NUM = 10;

	public Avicola() {
		listCorral = new Corral[10];
		generateCorral();
	}
	
	public void generateCorral() {
		for (int i = 0; i < listCorral.length; i++) {
			listCorral[i] = new Corral();
		}
	}
	
	public void fillChicken(){
		for (int i = 0; i < listCorral.length; i++) {
			for (int j = 0; j < listCorral[i].getListChicken().length; j++) {
				listCorral[i].addChicken(new Chicken(LocalDate.of(generateDate()[2], generateDate()[1], generateDate()[0])));
			}
		}
	}	
	
	public int[] generateDate() {
		Random r = new Random();
		int day = r.nextInt(27) + 1;
		int month = r.nextInt(11) + 1;
		int year = r.nextInt(2) + 2017;
		return new int[]{day,month,year};
	}
}