package models;

import java.time.LocalDate;
import java.util.Random;

public class CorralManager{

	private Corral[] corralList;
	public static final int MAX_CORRAL_NUM = 30;

	public static final int PERCENTAGE =  100;

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
	public double sendWaterCost(){
		double waterCost = WATER_COST;
		return waterCost;
	}
	public double sendEnergyCost(){
		double energyCost = ENERGY_COST;
		return energyCost;
	}
	public double determinePurineValue(int purinePackage){
		double totalPurine = purinePackage * PURINE_PACKAGE_VALUE;
		return totalPurine;
	}
	public int determineTotalDeadChicken(){
		int totalDead = 0;
		for (int i = 0;(i<corralList.length) && (corralList[i]) != null;i++ ) {
			totalDead += corralList[i].getDeadChikens();
		}
		return totalDead;
	}	
	public int determineTotalAliveChicken(int deadChickens){
		int totalAlive = 0;
		for (int i = 0;(i<corralList.length) && (corralList[i]) != null;i++ ) {
			totalAlive += corralList[i].getChickensTotal();
		}
		return totalAlive - deadChickens;
	}
	public double getTotalCal(){
		double totalCal = 0;
		for (int i = 0;(i<corralList.length) && (corralList[i]) != null;i++ ) {
			totalCal += corralList[i].getCalPackage();
		}
		return totalCal * CAL_VALUE;
	}	
	public double getTotalCasc(){
		double totalCasc = 0;
		for (int i = 0;(i<corralList.length) && (corralList[i]) != null;i++ ) {
			totalCasc += corralList[i].getCascPackage();
		}
		return totalCasc * CASC_VALUE;
	}
	public double getTotalPurine(){
		double totalPurine = 0;
		for (int i = 0;(i<corralList.length) && (corralList[i]) != null;i++ ) {
			totalPurine += corralList[i].getFoodPackage();
		}
		return totalPurine * PURINE_PACKAGE_VALUE;
	}
	public double setSelledChicken(int totalChicken){
		double totalCost = totalChicken * CHICKEN_VALUE;
		return totalCost;
	}
	public double determineFinalReport(double selledChicken, double totalCal, double totalCas, double totalPurine, double totalWater, double totalEnergy){
		double totalReport = selledChicken - (totalCal + totalCas + totalPurine + totalWater + totalEnergy);
		return totalReport;
	}	
	public double[] calculateRaceChicken(){
		ChickenType[] chickenType = ChickenType.values();
		double[] chickenRaceList = new double[chickenType.length];
		for (int i = 0;i<chickenType.length ;i++ ) {
			chickenRaceList[i] = calculatePercentageChicken(chickenType[i]);
		}
		return chickenRaceList;
	}
	public double calculatePercentageChicken(ChickenType chickenType){
		double counterChickenRace = 0;
		for (int i = 0;i<corralList.length && corralList[i] != null ;i++ ) {
			if (chickenType.equals(corralList[i].getChickenType())) {
			counterChickenRace++;							
			}			
		}
		return (counterChickenRace * PERCENTAGE) / top;
	}
	public Object[] toParseObject(double[] percentageRace){
		return new Object[]{percentageRace[0], percentageRace[1],percentageRace[2]};
	}
	public String validateProfitOrLoose(double finalCost){
		String result = "";
		if (finalCost > 0) {
			result = "Ganancias";			
		}
		else{
			result = "Perdidas";
		}
		return result;
	}
}