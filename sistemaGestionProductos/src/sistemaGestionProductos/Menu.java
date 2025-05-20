package sistemaGestionProductos;

import java.util.Scanner;

public class Menu {
	
	private static String opcion;
	private static boolean salir = false;
	static Scanner scn = new Scanner(System.in);
	
	public static void start() {	
		GestionProductos gsProd = new GestionProductos();
		while(!salir) {
			mostrarPantalla();
			opcion = scn.nextLine();
			switch(opcion) {
			case "1" -> gsProd.agregarProducto();
			case "2" -> gsProd.listarProductos();
			case "3" -> gsProd.buscarProducto();
			case "4" -> System.out.println("opcion 4 elegida");
			case "5" -> salirSistema();
			default -> System.out.println("Opcion invalida");
			}
		}
	}
	
	//Metodo de clase
	public static void mostrarPantalla() {
		System.out.println("====================================");
		System.out.println("|      SISTEMA DE GESTION          |");
		System.out.println("|----------------------------------|");
		System.out.println("| 1 - Agregar Producto             |");
		System.out.println("| 2 - Listar Productos             |");
		System.out.println("| 3 - Buscar/Actualizar Productos  |");
		System.out.println("| 4 - Eliminar Producto            |");
		System.out.println("| 5 - Salir de la aplicacion  	   |");
		System.out.println("====================================");
		System.out.println("Elija una de las opciones: ");
	}
	
	public static void salirSistema() {
		System.out.println("ha salido con exito del sistema");
		salir = true;
	}
	
}
