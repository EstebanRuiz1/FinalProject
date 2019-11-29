package views;

import java.util.Scanner;

public class Console{
	private Scanner sc;

	public static final String GET_OPTION = "Bienvenido al sistema de gestion de la granja avicola 'La belleza', por favor ingrese la opcion que necesite:";
	public static final String GET_FIRST_OPTION = "Ingrese 1 para añadir pollos";
	public static final String GET_SECOND_OPTION = "Ingrese 2 para añadir revisar la cantidad de aves muertas";
	public static final String GET_THIRD_OPTION = "Ingrese 3 para revisar la cantidad de purina gastada";
	public static final String GET_FOUR_OPTION = "Ingrese 4 para revisar la cantidad gastada de cal y cascarilla";
	public static final String GET_FIVE_OPTION = "Ingrese 5 para V¿ver el gasto en mantenimiento de los galpones";
	public static final String GET_SIX_OPTION = "Ingrese 6 para ver el pollo vendido vivo";
	public static final String GET_SEVEN_OPTION = "Ingrese 7 para ver el pollo vendido muerto";
	public static final String GET_EIGHT_OPTION = "Ingrese 8 para ver las ganancias mesuales";
	public static final String GET_NINE_OPTION = "Ingrese 9 para ver las ganancias anuales";
	public static final String WARP_TIME = "Ingrese 0 para adelantar el tiempo dos semanas";

	public Console(){
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
		System.out.println(GET_NINE_OPTION);
		return sc.nextByte();
	}
	
	
}