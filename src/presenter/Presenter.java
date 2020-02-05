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
				cal();
				menu();
			break;
			case 5:
				cas();
				menu();
			break;
			case 6:
				mantainance();
				menu();
			break;
			case 7:
				selledAliveChicken();
				menu();
			break;
			case 8:
				table();
				menu();
			break;
			case 9:
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
	//	int deadChicken = op.countDead();
	}
	public void food(){
	//	corralObj.doFoodCount();
	}
	public void cal(){
	//	int spendCalCas = op.doCalCasOperation();
	}
	public void cas(){
		
	}
	public void mantainance(){
	//	int mantainance = op.getMantainance();
	}	
	public void sellDeadAndAlive(){
	//	int alive = op.selledAliveChicken();
	//	int dead = op.selledDeadChicken();
	}
	public void tableReport(){

	}
	public void exitApp(){
		io.exitApp();	
	}
	public void error(){
		io.showError();
	}
	
}