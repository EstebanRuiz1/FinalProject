package models;

import java.time.LocalDate;
import java.util.Random;

public class CorralManager{

	private Corral[] corralList;
	public static final int MAX_CORRAL_NUM = 30;

	public static final int MAXIUM_CORRAL_FILL = 299;
	public static final int DEAD_PARAMETER = 10;
	public static final int KILL_PARAMETER = 50;
	public static final int TOTAL = 3000;
	public static final int ONE_HUNDRED = 100;

	public static final double CAL_VALUE = 9500;
	public static final double CASC_VALUE = 12000;

	public static final double WATER_COST = 150000;
	public static final double ENERGY_COST = 100000;

	public static final double PURINE_PACKAGE_VALUE = 69000;
	public static final double CHICKEN_VALUE = 4000;

	private int top;

	public CorralManager() {
		corralList = new Corral[MAX_CORRAL_NUM];
	}

		public boolean addCorral(Corral corralObj){
		if( top < corralList.length ){
			corralList[top] = corralObj;
			top++;
			return true;
		}else{
			return false;
		}	
	}

	public int getTop(){
		return this.top;
	}
	
	public Corral[] getCorralList(){
		return this.corralList;
	}

	public Object[][] toMatrixVector(){
		int sizeColumns = corralList[0].objectSaver().length;
		Object[][] datasMatrix = new Object[top][sizeColumns];
		for (int i = 0; i < datasMatrix.length; i++) {
			datasMatrix[i] = corralList[i].objectSaver();
		}
		return datasMatrix;
	}

	public double determineCashCal(int calBags){
		double calAux = calBags * CAL_VALUE;
		return calAux;
	}
	public double determineCashCasc(int cascBags){
		double cascAux = cascBags * CASC_VALUE;
		return cascAux;
	}
	public double totalCost(double calAux, double cascAux){
		double total = calAux + cascAux + WATER_COST + ENERGY_COST;
		return total;
	}
	public double determinePurineValue(int purinePackage){
		double totalPurine = purinePackage * PURINE_PACKAGE_VALUE;
		return totalPurine;
	}
	public int randomDeadChicken(){
		Random ran = new Random();
		int deadAux = 0;
		int dead = ran.nextInt(DEAD_PARAMETER);
		for (int i = 0;i <MAX_CORRAL_NUM ; i++) {
			deadAux += dead;
		}
		return deadAux;
	}
	public int aliveChicken(int dead){
		int aliveAux = (TOTAL * DEAD_PARAMETER) - dead;
		return aliveAux;
	}	
	public double totalCostAliveChicken(int aliveAux){
		double totalCost = aliveAux * CHICKEN_VALUE;
		return totalCost;
	}
	public double costTotal(double totalChicken, double mantainance, double purine){
		double total = totalChicken - mantainance - purine;
		return total;
	}

	public double operateAll ( int chickenTotal, int corralList ){
		double chikenAux = chickenTotal / corralList;
		return chikenAux;
	}
		
}