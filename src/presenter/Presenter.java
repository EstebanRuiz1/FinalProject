package presenter;

import models.*;
import views.IOManager;


public class Presenter{
	private CorralManager corralObj;
	private IOManager io;

	public Presenter(){
		corralObj = new CorralManager();
		io = new IOManager();;
		menu();
	}
	
	public void menu(){
		byte option = io.getOption();
		switch (option) {
			case 1:
				showFillChicken();
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
				tableReport();
				menu();
			break;
			case 8:
				exitApp();
			break;
			default:
				error();
				menu();
			break;
		}
	}
	public void showFillChicken(){
		//io.chickenFull();
	}
	public void dead(){
		int dead = corralObj.randomDeadChicken();
		io.showDeadChicken(dead);
	}
	public void food(){
		int foodPackage = io.getPurine();
		double foodSpend = corralObj.determinePurineValue(foodPackage);
		io.showPurineSpend(foodSpend); 
	}
	public void mantainance(){
		int cascBags = io.readCascBags();
		int calBags = io.readCalBags();
		double calAux = corralObj.determineCashCal( calBags );
		double cascAux = corralObj.determineCashCasc( cascBags );
		double mantainance = corralObj.totalCost(calAux, cascAux);
		io.showMantainance(mantainance, cascAux, calAux);
	}	
	public void aliveChicken(){
		int dead = corralObj.randomDeadChicken();
		int totalAlive = corralObj.aliveChicken(dead);
		io.showAliveReport(totalAlive);
	}
	public void sellChiken(){

		int dead = corralObj.randomDeadChicken();
		int totalAlive = corralObj.aliveChicken(dead);
		double totalCost = corralObj.totalCostAliveChicken(totalAlive);
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
	public void exitApp(){
		io.exitApp();	
	}
	public void error(){
		io.showError();
	}
}