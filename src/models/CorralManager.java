package models;

import java.time.LocalDate;
import java.util.Random;

public class CorralManager{

	private Corral[] corralList;
	public static final int MAX_CORRAL_NUM = 9;

	Random ran = new Random();
	int life = ran.nextInt(99+1);
	public static final int MAXIUM_CORRAL_FILL = 299;
	public static final int DEAD_PARAMETER = 20;
	public static final int KILL_PARAMETER = 50;
	public static final int TOTAL = 3000;
	public static final int ONE_HUNDRED = 100;

	public CorralManager() {
		corralList = new Corral[MAX_CORRAL_NUM];
	}
	public static Corral addCorral(double energy, double water, int foodPackage, int calPackage, int cascPackage){
		return new Corral(energy, water, foodPackage, calPackage, cascPackage);
	}
	/*public int [] fillChicken(){

	}*/

	/*public void generateCorral() {
		for (int i = 0; i < corralList.length; i++) {
			corralList[i] = new Corral();
		}
	}*/
	public Corral[] getCorralList(){
		return this.corralList;
	}
	/*
	public int deadChicken(){
		int dead = 0;
		for (int i = 0;i<corralList.length ;i++ ) {
			for (int j = 0;j<corralList[i].getListChicken() ;j++ ) {
				if (corralList[i] < DEAD_PARAMETER) {
					dead++;		
				}
			}	
		}
	return dead;
	}
	public int killChicken(){
		int kill = 0;
		for (int i = 0;i<corralList.length;i++ ) {
			for (int j = 0;j<corralList[i].getListChicken() ;j++ ) {
				if (corralList[i] < KILL_PARAMETER) {
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
		/*Random ran = new Random();
	private Random Life;

	int valueLife = ran.nextInt(99+1);
	public void fillChicken(){

	}
	public int Chicken(Random ran) {
		int life = valueLife;
		return life;

	}*/
}