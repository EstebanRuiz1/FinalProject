package views;

import java.util.Scanner;
import java.text.DecimalFormat;

public class IOManager{
	private Scanner sc;

	public static final String GET_OPTION = "\nBienvenido al sistema de gestion de la granja avicola 'La belleza', por favor ingrese la opcion que necesite:";
	public static final String GET_FIRST_OPTION = "1 para añadir pollos";
	public static final String GET_SECOND_OPTION = "2 para ver la cantidad de aves muertas";
	public static final String GET_TOTAL_DEAD = "El total de aves muertas es de: %s\n";

	public static final String GET_THIRD_OPTION = "3 para añadir cantidad de purina";
	public static final String GET_PURINE = "Escriba la cantidad de purina en bultos gastada en el mes";
	public static final String TOTAL_PURINE = "El total gastado de purina en valor monetario es de: %s\n";

	public static final String ADD_CORRAL = "Escriba para añadir corrales a la lista";

	public static final String GET_CAL_BAGS = "Ingrese la cantidad de cal en bultos";
	public static final String MESSAGE_RESULT_CAL = "El total de gasto monetario en cal es de: %s\n";	
	public static final String GET_CAL = "Escriba la cantidad de cal gastada en numeros";

	public static final String GET_CASC_BAGS = "Ingrese la cantidad de cascarilla en paca";
	public static final String MESSAGE_RESULT_CASC = "El total de gasto monetario en cascarilla es de: %s\n";	
	public static final String MESSAGE_ENERGY = "La cantidad gastada de energia es: 150.000\n";
	public static final String MESSAGE_WATER = "La cantidad gastada de agua es: 100.000\n";

	public static final String GET_CASCARILLA = "Escriba la cantidad de cascarilla gastada en numeros";

	public static final String GET_FOUR_OPTION = "4 para ver el gasto en mantenimiento de los galpones";
	public static final String MESSAGE_TOTAL_COST = "El gasto total de mantenimieto es de: %s\n";

	public static final String GET_FIVE_OPTION = "5 para ver el pollo vivo";
	public static final String TOTAL_ALIVE = "EL total de pollos vivos es de: %s\n";
	public static final String GET_SIX_OPTION = "6 para obtener el total monetario de pollos";
	public static final String TOTAL_COST_CHICKEN = "El total monetario de pollos es de: %s\n";

	public static final String GET_SEVEN_OPTION = "7 para ver la tabla de reportes completa";

	public static final String FORMAT =  "%1$-25s %2$-20s %3$-20s %4$-20s %5$-15s %6$-15s %7$-15s %8$-15s ";
	public static final String CLOSE = "8 para cerrar la aplicación";
	public static final String GOOD_BYE = "Gracias por usar la aplicación :)\n";
	public static final String BACK  = "0 para volver al menú anterior";
	public static final String ERROR = "una opcion valida";
	public static final String FORMAT_DECIMAL = "$#,###,###";

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
		System.out.println(CLOSE);
		return sc.nextByte();
	}
	/*public int deadChicken(int dead){
		System.out.println(GET_SECOND_OPTION);

		return sc.nextInt();
	}*/
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
	public int getPurine(){
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
		//DecimalFormat df = new DecimalFormat( FORMAT_DECIMAL );
		System.out.printf(TOTAL_ALIVE, aliveTotal);
		//System.out.printf(TOTAL_COST_CHICKEN, df.format(money));
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