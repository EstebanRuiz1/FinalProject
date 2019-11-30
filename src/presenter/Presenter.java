package presenter;

import models.*;
import views.Console;

public class Presenter{
	private Avicola av;
	private Console cs;

	public Presenter(){
		av = new Avicola();
		cs = new Console();
		menu();
	}
	public void menu(){
		byte option = cs.getOption();
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
				calCas();
				menu();
			break;
			case 5:
				mantainance();
			break;
			case 6:
				sellDeadAndAlive();
				menu();
			break;
			case 7:
				mensualMoney();
				menu();
			break;
			case 8:
				anualMoney();
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
	public void addChicken(){
		int chicken = cs.getChicken();
	}
	public void dead(){
	//	int deadChicken = op.countDead();
	}
	public void food(){
	//	int food = op.countFood();
	}
	public void calCas(){
	//	int spendCalCas = op.doCalCasOperation();
	}
	public void mantainance(){
	//	int mantainance = op.getMantainance();
	}	
	public void sellDeadAndAlive(){
	//	int alive = op.selledAliveChicken();
	//	int dead = op.selledDeadChicken();
	}
	public void mensualMoney(){
	//	double mMoney = op.doMensualMoney();
	}
	public void anualMoney(){
	//	double yMoney = op.doAnualMoney();
	}
	public void exitApp(){
		cs.exitApp();	
	}
	public void error(){
		cs.showError();
	}
	
}