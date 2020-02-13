package views;

import java.util.Scanner;
import java.text.DecimalFormat;
import models.ChickenType;

public class IOManager{
	private Scanner sc;

	public static final String GET_OPTION = "\nBienvenido al sistema de gestion de la granja avicola 'La belleza', por favor ingrese la opcion que necesite:";
	
	public static final String GET_FIRST_OPTION = "1 Para ingresar cantidad pollos y corrales";
	public static final String CHICKEN_ADD = "Ingrese la cantidad de pollos que desea";
	public static final String CORRAL_ADD = "Ingrese la cantidad de corrales que desea";
	public static final String TOTAL_CORRAL = "El total de pollos en corrales es de: %s\n";

	
	public static final String GET_SECOND_OPTION = "2 Para ver la cantidad de aves muertas";
	public static final String GET_TOTAL_DEAD = "El total de aves muertas es de: %s\n";

	public static final String GET_THIRD_OPTION = "3 Para añadir cantidad de purina";
	public static final String GET_PURINE = "Escriba la cantidad de purina en bultos gastada en el mes";
	public static final String TOTAL_PURINE = "El total gastado de purina en valor monetario es de: %s\n";

	public static final String GET_CAL_BAGS = "Ingrese la cantidad de cal en bultos";
	public static final String MESSAGE_RESULT_CAL = "El total de gasto monetario en cal es de: %s\n";	
	public static final String GET_CAL = "Escriba la cantidad de cal gastada en numeros";

	public static final String GET_CASC_BAGS = "Ingrese la cantidad de cascarilla en paca";
	public static final String MESSAGE_RESULT_CASC = "El total de gasto monetario en cascarilla es de: %s\n";	
	public static final String MESSAGE_ENERGY = "La cantidad gastada de energia es: 150.000\n";
	public static final String MESSAGE_WATER = "La cantidad gastada de agua es: 100.000\n";

	public static final String GET_CASCARILLA = "Escriba la cantidad de cascarilla gastada en numeros";

	public static final String GET_FOUR_OPTION = "4 Para ver el gasto en mantenimiento de los galpones";
	public static final String MESSAGE_TOTAL_COST = "El gasto total de mantenimieto es de: %s\n";

	public static final String GET_FIVE_OPTION = "5 Para ver el pollo vivo";
	public static final String TOTAL_ALIVE = "EL total de pollos vivos es de: %s\n";
	
	public static final String GET_SIX_OPTION = "6 Para obtener el total monetario de pollos";
	public static final String TOTAL_COST_CHICKEN = "El total monetario de pollos es de: %s\n";

	public static final String GET_SEVEN_OPTION = "7 para agregar nuevo corral de pollos";
	public static final String MESSAGE_READ_CHICKEN_RACE = "Ingrese el tipo de raza de pollo \n"+
																"1. Pollos Ecuatorianos \n" + 
																"2. Pollos Blancos \n" + 
																"3. Polla Negra \n";
	public static final String GET_EIGHT_OPTION = "8 para ver datos por corral";

	//public static final String FORMAT =  "%1$-25s %2$-20s %3$-20s %4$-20s %5$-15s %6$-15s %7$-15s %8$-15s ";
	public static final String CLOSE = "0 para cerrar la aplicación";
	public static final String GOOD_BYE = "Gracias por usar la aplicación :)\n";
	public static final String BACK  = "0 Para volver al menú anterior";
	public static final String ERROR = "una opcion valida";
	public static final String FORMAT_DECIMAL = "$#,###,###";
	public static final String FORMAT_DECIMAL_CHICKEN = "#,###,###";

	public static final String CHICKEN_RACE = "Raza del pollo";
	public static final String FOOD_PACKAGE = "Bultos de purina";
	public static final String CAL_PACKAGE = "Bultos de cal";
	public static final String CASC_PACKAGE = "Bultos de cascarilla";
	public static final String CHICKEN_TOTAL = "Total de pollos vivos";
	public static final String DEAD_CHICKEN = "Total de pollos muertos";

	public static final String FORMAT = "%1$-25s %2$-20s %3$-20s %4$-20s %5$-15s %6$-15s";
	public static final Object[] HEADERS = { CHICKEN_RACE, FOOD_PACKAGE, CAL_PACKAGE, CASC_PACKAGE, CHICKEN_TOTAL, DEAD_CHICKEN };
	

	public IOManager(){
		sc = new Scanner(System.in);
	}
	public byte getOption(){
		System.out.println(GET_OPTION);
		System.out.println(GET_FIRST_OPTION);
		System.out.println(GET_SECOND_OPTION);
		System.out.println(GET_THIRD_OPTION);
		System.out.println(GET_FOUR_OPTION);
		System.out.println(GET_FIVE_OPTION);
		System.out.println(GET_SIX_OPTION);
		System.out.println(GET_SEVEN_OPTION);
		System.out.println(GET_EIGHT_OPTION);
		System.out.println(CLOSE);
		return sc.nextByte();
	}

	public void generateHeader() {
		System.out.println( String.format(FORMAT, HEADERS ));
		System.out.println("------------------------------------------------------------------------------------------------------------------------------");
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

	public int readChickenAll (){
		System.out.println(CHICKEN_ADD);
		return sc.nextInt();
	}
	public int readCorralAdd(){
		System.out.println(CORRAL_ADD);
		return sc.nextInt();
	}
	public int showCorralChickenAdded(double total){
	DecimalFormat fd = new DecimalFormat( FORMAT_DECIMAL_CHICKEN );
	System.out.printf(TOTAL_CORRAL, fd.format(total));
		System.out.println(BACK);
		return sc.nextInt();
	}

	public int showDeadChicken(int dead){
		System.out.printf(GET_TOTAL_DEAD, dead);
		System.out.println(BACK);
		return sc.nextInt();
	}
	public void exitApp(){
		System.out.println(GOOD_BYE);
	}
	public void showError(){
		System.out.println(ERROR);
	}
	public int readCalBags(){
		System.out.println(GET_CAL_BAGS);
		return sc.nextInt();
	}
	public int readCascBags(){
		System.out.println(GET_CASC_BAGS);
		return sc.nextInt();
	}
	public int showMantainance(double totalCost, double cascAux, double calAux){
		DecimalFormat df = new DecimalFormat( FORMAT_DECIMAL );
		System.out.printf(MESSAGE_RESULT_CASC,df.format(cascAux));
		System.out.printf(MESSAGE_RESULT_CAL, df.format(calAux));
		System.out.printf(MESSAGE_ENERGY);
		System.out.printf(MESSAGE_WATER);
		System.out.printf(MESSAGE_TOTAL_COST, df.format(totalCost));
		System.out.println(BACK);
		return sc.nextInt();
	}
	public int readPurine(){
		System.out.println(GET_PURINE);
		return sc.nextInt();
	}
	public int showPurineSpend(double purineTotal){
		DecimalFormat df = new DecimalFormat( FORMAT_DECIMAL );
		System.out.printf(TOTAL_PURINE, df.format(purineTotal));
		System.out.println(BACK);
		return sc.nextInt();
	}
	public int showAliveReport(int aliveTotal){
		System.out.printf(TOTAL_ALIVE, aliveTotal);
		System.out.println(BACK);
		return sc.nextInt();
	}
	public double showChickenSellReport(double money){
		DecimalFormat df = new DecimalFormat( FORMAT_DECIMAL );
		System.out.printf(TOTAL_COST_CHICKEN, df.format(money));
		System.out.println(BACK);
		return sc.nextInt();
	}
}

