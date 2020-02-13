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
					initApp();
				break;
			}
		}while(option != 9 );
	}
	private void manageAddCorral() {
		
		ChickenType chickenType = io.readChickenType();
		int foodPackage = io.readPurine();
		int calPackage = io.readCalBags();
		int cascPackage = io.readCascBags();
		int chickenTotal = io.readChickenAll();
		int deadChickens = io.readDeadChicken();
		
		
		Corral corral = new Corral( chickenType, foodPackage, calPackage, cascPackage, chickenTotal, deadChickens );
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
		int totalDead = corralManagerObj.totalDeadChicken();
		io.showDead(totalDead);
	}
	private void showAlive(){
		int totalDead = corralManagerObj.totalDeadChicken();
		int totalAlive = corralManagerObj. totalAliveChicken(totalDead);
		io.showAlive(totalAlive);
	}
	private void showSelledChicken(){
		int totalDead = corralManagerObj.totalDeadChicken();
		int totalAlive = corralManagerObj. totalAliveChicken(totalDead);		
		double selledChicken = corralManagerObj.setSelledChicken(totalAlive);
		io.showSelledChicken(selledChicken);
	}
	private void totalReport(){
		int totalDead = corralManagerObj.totalDeadChicken();
		int totalAlive = corralManagerObj. totalAliveChicken(totalDead);		
		double selledChicken = corralManagerObj.setSelledChicken(totalAlive);

		double totalCal = corralManagerObj.getTotalCal();

		double totalCas = corralManagerObj.getTotalCasc();

		double totalPurine = corralManagerObj.getTotalPurine();

		double totalWater =  corralManagerObj.sendWaterCost();

		double totalEnergy = corralManagerObj.sendEnergyCost();

		double finalReport = corralManagerObj.finalReport(selledChicken, totalCal, totalCas, totalPurine, totalWater, totalEnergy);
		String winOrLose = corralManagerObj.decideProfitOrLoose(finalReport);
		io.showFinalReport(winOrLose, finalReport); 
	}
	private void createCorrals() {

		Corral corralOne = new Corral( ChickenType.CHICKEN_ONE ,15, 6, 7, 800, 20);
		Corral corralTwo = new Corral (ChickenType.CHICKEN_ONE, 20,5,10,300,10);
		Corral corralThree = new Corral (ChickenType.CHICKEN_ONE, 20,8,9,500,12);
		Corral corralFour = new Corral (ChickenType.CHICKEN_ONE, 12,7,8,600,15); 
		Corral corralFive = new Corral (ChickenType.CHICKEN_ONE, 12,7,8,600,15);
		Corral corralSix = new Corral (ChickenType.CHICKEN_TWO, 12,7,8,600,15);
		Corral corralSeven = new Corral (ChickenType.CHICKEN_TWO, 12,7,8,600,15);
		Corral corralEight = new Corral (ChickenType.CHICKEN_TWO, 10,9,7,400,20);
		Corral corralNine = new Corral (ChickenType.CHICKEN_TWO, 20,15,10,500,30);
		Corral corralTen = new Corral (ChickenType.CHICKEN_TWO, 30,10,15,700,40);

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