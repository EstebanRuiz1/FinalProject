package models;

import java.time.LocalDate;
import java.util.Random;

public class Poultry{

	Random ran = new Random();
	int life = ran.nextInt(99+1);
	private Corral[] listCorral;
	public static final int MAXIUM_CORRAL_FILL = 299;
	public static final int MAX_CORRAL_NUM = 9;
	public static final int DEAD_PARAMETER = 20;
	public static final int KILL_PARAMETER = 50;
	public static final int TOTAL = 3000;
	public static final int ONE_HUNDRED = 100;

	public Poultry() {
		listCorral = new Corral[MAX_CORRAL_NUM];
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
	}/*
	public int deadChicken(){
		int dead = 0;
		for (int i = 0;i<listCorral.length ;i++ ) {
			for (int j = 0;j<listCorral[i].getListChicken() ;j++ ) {
				if (listCorral[i] < DEAD_PARAMETER) {
					dead++;		
				}
			}	
		}
	return dead;
	}
	public int killChicken(){
		int kill = 0;
		for (int i = 0;i<listCorral.length;i++ ) {
			for (int j = 0;j<listCorral[i].getListChicken() ;j++ ) {
				if (listCorral[i] < KILL_PARAMETER) {
					kill++;
				}
			}
		}
	return kill;
	}
	public int deadPercentage(int dead){
		int percent = (dead * ONE_HUNDRED)/TOTAL;
	System.out.println(percent); 
	return percent;
	}*/	
}