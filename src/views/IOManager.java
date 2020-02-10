package views;

import java.util.Scanner;
import java.text.DecimalFormat;

public class IOManager{
	private Scanner sc;

	public static final String GET_OPTION = "\nBienvenido al sistema de gestion de la granja avicola 'La belleza', por favor ingrese la opcion que necesite:";
	public static final String GET_FIRST_OPTION = "1 para añadir pollos";
	public static final String GET_SECOND_OPTION = "2 para ver la cantidad de aves muertas";

	public static final String GET_THIRD_OPTION = "3 para añadir cantidad de purina";
	public static final String GET_PURINE = "Escriba la cantidad de purina gastada en el mes";
	public static final String ADD_CORRAL = "Escriba para añadir corrales a la lista";

	public static final String GET_FOUR_OPTION = "4 para añadir la cantidad de cal gastada";
	public static final String GET_CAL_BAGS = "Ingrese la cantidad de cal";
	public static final String MESSAGE_RESULT_CAL = "El total de gasto monetario en cal es de: %s\n";	
	public static final String GET_CAL = "Escriba la cantidad de cal gastada en numeros";

	public static final String GET_FIVE_OPTION = "5 para añadir la cantidad de cascarilla gastada";
	public static final String GET_CASC_BAGS = "Ingrese la cantidad de cascarilla";
	public static final String MESSAGE_RESULT_CASC = "El total de gasto monetario en cascarilla es de: %s\n";	

	public static final String GET_CASCARILLA = "Escriba la cantidad de cascarilla gastada en numeros";

	public static final String GET_SIX_OPTION = "6 para ver el gasto en mantenimiento de los galpones";
	public static final double WATER_USE = 150.000;
	public static final double ENERGY_USE = 100.000;

	public static final String GET_SEVEN_OPTION = "7 para ver el pollo vendido vivo y el pollo vendido muerto";
	public static final String GET_EIGHT_OPTION = "8 para ver la tabla de reportes completa";

	public static final String FORMAT =  "%1$-25s %2$-20s %3$-20s %4$-20s %5$-15s %6$-15s %7$-15s %8$-15s ";
	public static final String CLOSE = "9 para cerrar la aplicación";
	public static final String GOOD_BYE = "Gracias por usar la aplicación :)\n";
	public static final String BACK  = "6 para volver al menú anterior";
	public static final String ERROR = "una opcion valida";
	public static final String FORMAT_DECIMAL = "$#,###,###"

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
	public int deadChicken(){
		System.out.println(GET_SECOND_OPTION);
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
	public void showCashCal(double calAux){
		DecimalFormat df = new DecimalFormat( FORMAT_DECIMAL );
		System.out.printf(MESSAGE_RESULT_CAL, df.format ( calAux ) );
	}

	public int readCascBags(){
		System.out.println(GET_CASC_BAGS);
		return sc.nextInt();
	}
	public void showCashCasc(double cascAux){
		System.out.printf(MESSAGE_RESULT_CASC, cascAux);

	}

	
	
}