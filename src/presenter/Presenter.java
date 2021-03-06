package presenter;

import models.*;
import java.text.DecimalFormat;
import views.IOManager;


public class Presenter{
	private CorralManager corralManagerObj;
	private IOManager io;

	public Presenter(){
		corralManagerObj = new CorralManager();
		io = new IOManager();
		initApp();
	}
	
	private void initApp() {
		createCorrals();
		byte option = 0;
		do{
			option = io.getOption();
			switch (option) {
				case 1:
					manageAddCorral();
				break;
				case 2:
					io.showListDatas( corralManagerObj.toMatrixVector() );
				break;
				case 3:
					manageMenuReports();
				break;
				case 0:
					exitApp();
				break;
			}
		}while(option != 0 );
	}
	public void manageMenuReports(){
		byte option = 0;
		do{
			option = io.readOptionMenuReports();
			switch( option ){
				case 1:
					showTotalCal();
				break;
				case 2:
					showTotalCasc();
				break;
				case 3:
					showTotalPurine();				
				break;
				case 4: 
					showTotalWater();
				break;
				case 5:
					showTotalEnergy();
				break;
				case 6:
					showDead();
				break;
				case 7:
					showAlive();
				break;
				case 8:
					showSelledChicken();
				break;
				case 9:
					totalReport();
				break;
				case 10:
					percentageChicken();
				break;
				case 0:
					initApp();
				break;
			}
		}while(option != 10 );
	}
	private void manageAddCorral() {
		
		int numberCorral = io.readCorral(); 
		ChickenType chickenType = io.readChickenType();
		int foodPackage = io.readPurine();
		int calPackage = io.readCalBags();
		int cascPackage = io.readCascBags();
		int chickenTotal = io.readChickenAll();
		int deadChickens = io.readDeadChicken();
		
		
		Corral corral = new Corral( numberCorral, chickenType, foodPackage, calPackage, cascPackage, chickenTotal, deadChickens );
		corralManagerObj.addCorral( corral );
	}
	private void showTotalCal(){
		double totalCal = corralManagerObj.getTotalCal();
		io.showCal(totalCal);
	}
	private void showTotalCasc(){
		double totalCas = corralManagerObj.getTotalCasc();
		io.showCasc(totalCas);
	}
	private void showTotalPurine(){
		double totalPurine = corralManagerObj.getTotalPurine();
		io.showPurine(totalPurine);
	}
	private void showTotalWater(){
		double totalWater =  corralManagerObj.sendWaterCost();
		io.showWatercost(totalWater);
	}
	private void showTotalEnergy(){
		double totalEnergy = corralManagerObj.sendEnergyCost();
		io.showEnergyCost(totalEnergy);
	}
	private void showDead(){
		int totalDead = corralManagerObj.determineTotalDeadChicken();
		io.showDead(totalDead);
	}
	private void showAlive(){
		int totalDead = corralManagerObj.determineTotalDeadChicken();
		int totalAlive = corralManagerObj. determineTotalAliveChicken(totalDead);
		io.showAlive(totalAlive);
	}
	private void showSelledChicken(){
		int totalDead = corralManagerObj.determineTotalDeadChicken();
		int totalAlive = corralManagerObj. determineTotalAliveChicken(totalDead);		
		double selledChicken = corralManagerObj.setSelledChicken(totalAlive);
		io.showSelledChicken(selledChicken);
	}
	private void totalReport(){
		int totalDead = corralManagerObj.determineTotalDeadChicken();
		int totalAlive = corralManagerObj. determineTotalAliveChicken(totalDead);		
		double selledChicken = corralManagerObj.setSelledChicken(totalAlive);

		double totalCal = corralManagerObj.getTotalCal();

		double totalCas = corralManagerObj.getTotalCasc();

		double totalPurine = corralManagerObj.getTotalPurine();

		double totalWater =  corralManagerObj.sendWaterCost();

		double totalEnergy = corralManagerObj.sendEnergyCost();

		double finalReport = corralManagerObj.determineFinalReport(selledChicken, totalCal, totalCas, totalPurine, totalWater, totalEnergy);
		String winOrLose = corralManagerObj.validateProfitOrLoose(finalReport);
		io.showFinalReport(winOrLose, finalReport); 
	}
	private void percentageChicken(){
		double[] raceChickenList = corralManagerObj.calculateRaceChicken();
		Object[] parseChickenList = corralManagerObj.toParseObject(raceChickenList);
		io.generateHeaderReport(parseChickenList);
	}
	private void createCorrals() { 
		Corral corralOne = new Corral(1, ChickenType.CHICKEN_ONE ,15, 6, 7, 800, 20);
		Corral corralTwo = new Corral (2, ChickenType.CHICKEN_ONE, 20,5,10,300,10);
		Corral corralThree = new Corral (3, ChickenType.CHICKEN_ONE, 20,8,9,500,12);
		Corral corralFour = new Corral (4, ChickenType.CHICKEN_ONE, 12,7,8,600,15); 
		Corral corralFive = new Corral (5, ChickenType.CHICKEN_ONE, 15,9,6,500,25);
		Corral corralSix = new Corral (6,ChickenType.CHICKEN_TWO, 12,5,9,600,12);
		Corral corralSeven = new Corral (7, ChickenType.CHICKEN_TWO, 12,7,8,800,15);
		Corral corralEight = new Corral (8, ChickenType.CHICKEN_TWO, 10,9,7,400,20);
		Corral corralNine = new Corral (9, ChickenType.CHICKEN_TWO, 20,15,10,500,30);
		Corral corralTen = new Corral (10, ChickenType.CHICKEN_TWO, 30,10,15,700,40);

		corralManagerObj.addCorral( corralOne );
		corralManagerObj.addCorral( corralTwo );
		corralManagerObj.addCorral( corralThree );
		corralManagerObj.addCorral( corralFour );
		corralManagerObj.addCorral( corralFive );
		corralManagerObj.addCorral( corralSix );
		corralManagerObj.addCorral( corralSeven );
		corralManagerObj.addCorral( corralEight);
		corralManagerObj.addCorral( corralNine);
		corralManagerObj.addCorral( corralTen ); 
	}

	public void exitApp(){
		io.exitApp();	
	}
	public void error(){
		io.showError();
	}
}