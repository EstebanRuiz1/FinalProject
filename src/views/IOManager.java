package views;

import java.util.Scanner;

public class IOManager{
	private Scanner sc;

	public static final String GET_OPTION = "Bienvenido al sistema de gestion de la granja avicola 'La belleza', por favor ingrese la opcion que necesite:";
	public static final String GET_FIRST_OPTION = "Ingrese 1 para añadir pollos";
	public static final String GET_SECOND_OPTION = "Ingrese 2 para ver la cantidad de aves muertas";

	public static final String GET_THIRD_OPTION = "Ingrese 3 para añadir cantidad de purina";
	public static final String GET_PURINE = "Escriba la cantidad de purina gastada en el mes";

	public static final String GET_FOUR_OPTION = "Ingrese 4 para añadir la cantidad de cal gastada";	
	public static final String GET_CAL = "Escriba la cantidad de cal gastada en numeros";

	public static final String GET_FIVE_OPTION = "Ingrese 5 para añadir la cantidad de cascarilla gastada";
	public static final String GET_CASCARILLA = "Escriba la cantidad de cascarilla gastada en numeros";

	public static final String GET_SIX_OPTION = "Ingrese 6 para ver el gasto en mantenimiento de los galpones";
	public static final double WATER_USE = 150.000;
	public static final double ENERGY_USE = 100.000;

	public static final String GET_SEVEN_OPTION = "Ingrese 7 para ver el pollo vendido vivo y el pollo vendido muerto";
	public static final String GET_EIGHT_OPTION = "Ingrese 8 para ver la tabla de reportes completa";

	public static final String FORMAT =  "%1$-25s %2$-20s %3$-20s %4$-20s %5$-15s %6$-15s %7$-15s %8$-15s ";
	public static final String CLOSE = "Ingrese 9 para cerrar la aplicación";
	public static final String GOOD_BYE = "Gracias por usar la aplicación :)\n";
	public static final String BACK  = "Ingrese 6 para volver al menú anterior";
	public static final String ERROR = "Ingrese una opcion valida";

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

	
	
}