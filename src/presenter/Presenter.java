package presenter;

import models.*;
import views.IOManager;


public class Presenter{
	private CorralManager corralManagerObj;
	private IOManager io;

	public Presenter(){
		corralManagerObj = new CorralManager();
		io = new IOManager();
		menu();
		initApp();
	}
	
	public void menu(){
		byte option = io.getOption();
		switch (option) {
			case 1:
				addChicken();
				menu();
			break;
			case 2:
				dead();
				menu();
			break;
			case 3:
				food();
				menu();
			break;
			case 4:
				mantainance();
				menu();
			break;
			case 5:
				aliveChicken();
				menu();
			break;
			case 6:
				sellChiken();
				menu();
			break;
			case 7:
				manageAddCorral();
				//menu();
			break;
			case 8:
				io.showListDatas( corralManagerObj.toMatrixVector() );
			case 0:
				exitApp();
			break;
			default:
				error();
				menu();
			break;
		}
	}
	
	public void addChicken(){
		int chickenTotal = io.readChickenAll();
		int corralAdd = io.readCorralAdd();
		double total = corralManagerObj.operateAll(chickenTotal, corralAdd);
		io.showCorralChickenAdded(total);
	}
	public void dead(){
		int dead = corralManagerObj.randomDeadChicken();
		io.showDeadChicken(dead);
	}
	public void food(){
		int foodPackage = io.readPurine();
		double foodSpend = corralManagerObj.determinePurineValue(foodPackage);
		io.showPurineSpend(foodSpend); 
	}
	public void mantainance(){
		int cascBags = io.readCascBags();
		int calBags = io.readCalBags();
		double calAux = corralManagerObj.determineCashCal( calBags );
		double cascAux = corralManagerObj.determineCashCasc( cascBags );
		double mantainance = corralManagerObj.totalCost(calAux, cascAux);
		io.showMantainance(mantainance, cascAux, calAux);
	}	
	public void aliveChicken(){
		int dead = corralManagerObj.randomDeadChicken();
		int totalAlive = corralManagerObj.aliveChicken(dead);
		io.showAliveReport(totalAlive);
	}
	public void sellChiken(){

		int dead = corralManagerObj.randomDeadChicken();
		int totalAlive = corralManagerObj.aliveChicken(dead);
		double totalCost = corralManagerObj.totalCostAliveChicken(totalAlive);
		io.showChickenSellReport( totalCost );
	}
	public void tableReport(){
		/*int dead = corralObj.randomDeadChicken();
		int totalAlive = corralObj.aliveChicken(dead);
		double totalCost = corralObj.totalCostAliveChicken(totalAlive);

		int cascBags = io.readCascBags();
		int calBags = io.readCalBags();
		double calAux = corralObj.determineCashCal( calBags );
		double cascAux = corralObj.determineCashCasc( cascBags );
		double mantainance = corralObj.totalCost(calAux, cascAux);

		int foodPackage = io.getPurine();
		double foodSpend = corralObj.determinePurineValue(foodPackage);

		double totalProfit = corralObj.costTotal(totalCost, mantainance, foodSpend);
		System.out.println(totalProfit);*/
	}

	
	private void initApp() {
		createCorrals();

		//io.showListDatas( corralManagerObj.toMatrixVector() );
	}
	private void manageAddCorral() {
		
		ChickenType chickenType = io.readChickenType();
		int foodPackage = io.readPurine();
		int calPackage = io.readCalBags();
		int cascPackage = io.readCascBags();
		int chickenTotal = io.readChickenAll();
		int deadChickens = io.readCorralAdd();
		
		
		Corral corral = new Corral( chickenType, foodPackage, calPackage, cascPackage, chickenTotal, deadChickens );
		corralManagerObj.addCorral( corral );	
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