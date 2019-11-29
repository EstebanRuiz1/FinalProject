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
				food();
				menu();
			break;
			case 3:
				expenditure();
				menu();
			break;
			case 4:
				mantainance();
				menu();
			break;
			case 5:
				exit();
			break;
			default:
				error();
				menu();
			break;
		}
	}
	public void addChicken(){

	}
	public void food(){

	}
	public void expenditure(){

	}
	public void mantainance(){

	}
	public void exit(){

	}
	public void error(){

	}
	
}