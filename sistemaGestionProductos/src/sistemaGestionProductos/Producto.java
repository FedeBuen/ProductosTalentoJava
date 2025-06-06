package sistemaGestionProductos;

public class Producto {

	private int id;
	private String nombre;
	private double precio;
	
	public Producto(int id, String nombre, double precio) {
		this.id = id;
		this.setNombre(nombre);
		this.setPrecio(precio);
	}
	
	public int getId() {
		return this.id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Id: " + id + ", Nombre: " + nombre + ", Precio: $" + precio;
	}
	
}
