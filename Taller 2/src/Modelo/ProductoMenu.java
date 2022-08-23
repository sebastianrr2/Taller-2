package Modelo;

public class ProductoMenu 
{
	private String nombre;
	private int precioBase;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}
	
	
	public String generarTextoFactura()
	{
		return "";
	}
	

}
