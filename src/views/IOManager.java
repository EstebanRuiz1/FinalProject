package views;

import java.util.Scanner;
import java.text.DecimalFormat;
import models.ChickenType;

public class IOManager{
	private Scanner sc;

	public static final String GET_OPTION = "\nBienvenido al sistema de gestion de la granja avicola 'La belleza', por favor ingrese la opcion que desee:";

	public static final String PRINCIPAL_MENU_OPTION  = "1 Para agregar un nuevo corral de pollos\n"+
														"2 Para ver la tabla de corrales\n"+
														"3 Para ver la tabla de reportes\n"+
														//"4 Para ver el total de todo\n"+
														"0 para cerrar la aplicación";	
	public static final String MESSAGE_READ_MENU_REPORTS = "Ingrese:\n"+
															"1 Para ver el gasto total de cal\n"+
															"2 Para ver el gasto total de cascarilla\n"+
															"3 Para ver el gasto total de purina\n"+
															"4 Para ver el gasto de agua\n"+
															"5 Para ver el gasto de luz\n"+
															"6 Para ver los pollos muertos\n"+
															"7 Para ver los pollos vivos\n"+
															"8 Para el valor total de los pollos vivos\n"+
															"9 Para ver si obtuvo ganancias o si genero perdidas\n"+ 
															"10 Para ver la tabla de porcentaje de pollos\n"+
															"0 Para volver al menu anterior";  

	public static final String MESSAGE_READ_CHICKEN_RACE = "Ingrese el tipo de raza de pollo \n"+
															"1. Pollos Ecuatorianos \n" + 
															"2. Pollos Blancos \n" + 
															"3. Polla Negra \n";	

	public static final String MESSAGE_FINAL_REPORT = "Usted tuvo %s \n";
	public static final String MESSAGE_FINAL_VALUE = "con un valor acumulado de: %S\n";	
	public static final String MESSAGE_RESULT_CASC = "El total de gasto monetario en cascarilla es de: %s\n";	
	public static final String MESSAGE_ENERGY = "La cantidad gastada de energia es: %s\n";
	public static final String MESSAGE_WATER = "La cantidad gastada de agua es: %s\n";
	public static final String MESSAGE_RESULT_CAL = "El total de gasto monetario en cal es de: %s\n";	
	public static final String MESSAGE_TOTAL_COST = "El gasto total de mantenimieto es de: %s\n";
	public static final String MESSAGE_GET_CORRAL_NUMBER = "Ingrese el numero del corral";

	public static final String GET_CHICKEN_ADD = "Ingrese la cantidad de pollos que desea";
	public static final String GET_CAL_BAGS = "Ingrese la cantidad de cal en bultos";
	public static final String GET_CAL = "Escriba la cantidad de cal gastada en numeros";
	public static final String GET_CASC_BAGS = "Ingrese la cantidad de cascarilla en paca";
	public static final String GET_CASCARILLA = "Escriba la cantidad de cascarilla gastada en numeros";
	public static final String GET_PURINE = "Escriba la cantidad de purina en bultos gastada en el mes";
	public static final String GET_TOTAL_DEAD = "Ingrese el total de pollos muertos:\n";

	public static final String TOTAL_ALIVE = "EL total de pollos vivos es de: %s\n";
	public static final String TOTAL_DEAD = "El total de pollos muertos es de: %s\n";	
	public static final String TOTAL_COST_CHICKEN = "El total monetario de pollos es de: %s\n";
	public static final String TOTAL_CORRAL = "El total de pollos en corrales es de: %s\n";
	public static final String TOTAL_PURINE = "El total gastado de purina en valor monetario es de: %s\n";

	public static final String GOOD_BYE = "Gracias por usar la aplicación :)\n";
	public static final String BACK  = "0 Para volver al menú anterior";
	public static final String ERROR = "Ingrese una opcion valida";
	public static final String FORMAT_DECIMAL = "$###,###,###,###";
	public static final String FORMAT_DECIMAL_CHICKEN = "#,###,###";

	public static final String CHICKEN_RACE = "Raza del pollo";
	public static final String FOOD_PACKAGE = "Bultos de purina";
	public static final String CAL_PACKAGE = "Bultos de cal";
	public static final String CASC_PACKAGE = "Bultos de cascarilla";
	public static final String CHICKEN_TOTAL = "Total de pollos vivos";
	public static final String DEAD_CHICKEN = "Total de pollos muertos";

	public static final String CHICKEN_ONE = "Pollos Ecuatorianos";
	public static final String CHICKEN_TWO = "Pollos Blancos";
	public static final String CHICKEN_THREE = "Polla Negra";

	public static final String NUMBER_CORRAL = "Numero de corral";

	public static final String FORMAT = "%1$-17s %2$-20s %3$-20s %4$-25s %5$-30s %6$-25s %7$-25s";
	public static final String FORMAT_TOTAL = "%1$-25s %2$-20s %3$-20s %4$-25s %5$-30s";
	public static final String FORMAT_REPORT = "%1$-25s %2$-20s %3$-20s";
	public static final Object[] HEADERS = { NUMBER_CORRAL, CHICKEN_RACE, FOOD_PACKAGE, CAL_PACKAGE, CASC_PACKAGE, CHICKEN_TOTAL, DEAD_CHICKEN };
	public static final Object[] HEADERS_REPORT = { CHICKEN_ONE, CHICKEN_TWO, CHICKEN_THREE};
	public static final Object[] HEADERS_TOTAL = { FOOD_PACKAGE, CAL_PACKAGE, CASC_PACKAGE, CHICKEN_TOTAL, DEAD_CHICKEN };
	

	public IOManager(){
		sc = new Scanner(System.in);
	}
	public byte getOption(){
		System.out.println(GET_OPTION);
		System.out.println(PRINCIPAL_MENU_OPTION);
		return Byte.parseByte(sc.nextLine());
	}

	public void generateHeader() {
		System.out.println( String.format(FORMAT, HEADERS ));
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	public void showListDatas( Object[][] listCorralData ) {
		System.out.println();
		System.out.println();
		generateHeader();
		for (int i = 0; i < listCorralData.length; i++ ){
			Object[] datasObject = listCorralData[i];
			System.out.println( String.format( FORMAT, datasObject ));
		}
	}
	public ChickenType readChickenType(){
		System.out.println( MESSAGE_READ_CHICKEN_RACE );
		String raceSelected = sc.nextLine();
		switch( raceSelected ) {
			case "1":
				return ChickenType.CHICKEN_ONE;
			case "2":
				return ChickenType.CHICKEN_TWO;
			case "3":
				return ChickenType.CHICKEN_THREE;
			default:
				return ChickenType.CHICKEN_ONE;
		}
	}

	public int readCorral(){
		System.out.println(MESSAGE_GET_CORRAL_NUMBER);
		return Integer.parseInt(sc.nextLine());
	}
	public int readChickenAll (){
		System.out.println(GET_CHICKEN_ADD);
		return Integer.parseInt(sc.nextLine());
	}

	public int readCalBags(){
		System.out.println(GET_CAL_BAGS);
		return Integer.parseInt(sc.nextLine());
	}
	public int readCascBags(){
		System.out.println(GET_CASC_BAGS);
		return Integer.parseInt(sc.nextLine());
	}
	public int readPurine(){
		System.out.println(GET_PURINE);
		return Integer.parseInt(sc.nextLine());
	}
	public byte readOptionMenuReports(){
		System.out.println( MESSAGE_READ_MENU_REPORTS );
		return Byte.parseByte( sc.nextLine() );
	}
	public int readDeadChicken(){
		System.out.printf(GET_TOTAL_DEAD);
		return Integer.parseInt(sc.nextLine());
	}	
	public void showCal(double cal){
		DecimalFormat fd = new DecimalFormat( FORMAT_DECIMAL_CHICKEN );
		System.out.printf(MESSAGE_RESULT_CAL, fd.format(cal));
	}
	public void showCasc(double casc){
		DecimalFormat fd = new DecimalFormat( FORMAT_DECIMAL_CHICKEN );
		System.out.printf(MESSAGE_RESULT_CASC, fd.format(casc));
	}
	public void showPurine(double purine){
		DecimalFormat fd = new DecimalFormat( FORMAT_DECIMAL_CHICKEN );
		System.out.printf(TOTAL_PURINE, fd.format(purine));
	}
	public void showWatercost(double water){
		DecimalFormat fd = new DecimalFormat( FORMAT_DECIMAL_CHICKEN );
		System.out.printf(MESSAGE_WATER, fd.format(water));
	}
	public void showEnergyCost(double energy){
		DecimalFormat fd = new DecimalFormat( FORMAT_DECIMAL_CHICKEN );
		System.out.printf(MESSAGE_ENERGY, fd.format(energy));		
	}
	public void showDead(int dead){
		System.out.printf(TOTAL_DEAD, dead);
	}
	public void showAlive(int alive){
		System.out.printf(TOTAL_ALIVE, alive);
	}
	public int showCorralChickenAdded(double total){
	DecimalFormat fd = new DecimalFormat( FORMAT_DECIMAL_CHICKEN );
	System.out.printf(TOTAL_CORRAL, fd.format(total));
		System.out.println(BACK);
		return Integer.parseInt(sc.nextLine());
	}
	public void showError(){
		System.out.println(ERROR);
	}
	public double showChickenSellReport(double money){
		DecimalFormat df = new DecimalFormat( FORMAT_DECIMAL );
		System.out.printf(TOTAL_COST_CHICKEN, df.format(money));
		System.out.println(BACK);
		return Integer.parseInt(sc.nextLine());
	}
	public void generateHeaderReport(Object[] percentageRace){
		System.out.println( String.format(FORMAT_REPORT, HEADERS_REPORT ));
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println( String.format(FORMAT_REPORT, percentageRace ));
	}

	/*public void generateTotalReport(Object[] totalAll){
		System.out.println( String.format(FORMAT_TOTAL, HEADERS_TOTAL));
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println( String.format(FORMAT_TOTAL, totalAll ));	
	}*/
	
	public void showSelledChicken(double selledChicken){
		DecimalFormat df = new DecimalFormat( FORMAT_DECIMAL );
		System.out.printf(TOTAL_COST_CHICKEN, df.format(selledChicken));		
	}
	
	public void showFinalReport(String result, double total){
		DecimalFormat df = new DecimalFormat( FORMAT_DECIMAL );
		System.out.printf(MESSAGE_FINAL_REPORT, result);
		System.out.printf(MESSAGE_FINAL_VALUE, df.format(total));
	}
	
	public void exitApp(){
		System.out.println(GOOD_BYE);
	}

}

