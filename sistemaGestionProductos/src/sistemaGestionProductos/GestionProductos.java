package sistemaGestionProductos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionProductos {

	private List<Producto> listaProductos = new ArrayList<Producto>();
	private Scanner scn = new Scanner(System.in);
	
	public void agregarProducto() {
		int id = ingresarId();
		String nombre = ingresarNombre();
		double precio = ingresarPrecio();
		Producto producto = new Producto(id, nombre, precio);
		listaProductos.add(producto);
		System.out.println(producto);
	}
	
	public void listarProductos() {
		System.out.println("Listado de productos");
		System.out.println("--------------------");
		for(Producto p : listaProductos) {
			System.out.println(p);
		}
	}
	
	public void buscarProducto() {
		int id = ingresarId();
		Producto producto = buscarProductoById(id);
		if (producto != null) {
			System.out.println(producto);
		} else {
			System.out.println("No se encontro el producto con Id: " + id);
		}
	}
	
	public void eliminarProducto() {
		
	}
	
	private Producto buscarProductoById(int id) {
		for (Producto p : listaProductos) {
			if (p.getId() == id) 
				return p;
		}
		return null;
	}

	private int ingresarId() {
        System.out.print("Ingrese el Id del producto: ");
        while (!scn.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, ingrese un número entero. ");
            scn.next(); 
        }
        int id = scn.nextInt();
        scn.nextLine();
        return id;
	}
	
	private String ingresarNombre() {
		System.out.print("Ingrese el nombre del producto (mínimo 3 caracteres no vacíos): ");
		String nombre = scn.nextLine();
		while(nombre.trim().length() < 3) {
			System.out.println("Entrada inválida. Debe contener al menos 3 caracteres no vacíos.");
			nombre = scn.nextLine(); 
		}
		return nombre;
	}
	
    private double ingresarPrecio() {
        System.out.print("Ingrese el precio del producto (coma separador de decimales): ");
        while (!scn.hasNextDouble()) {
            System.out.println("Entrada inválida. Por favor, ingrese un número decimal válido.");
            scn.next(); 
        }
        double precio = scn.nextDouble();
        scn.nextLine();
        return precio;
    }
}
