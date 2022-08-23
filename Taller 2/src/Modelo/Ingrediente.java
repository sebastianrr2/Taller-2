package Modelo;


/*
 *La clase Ingrediente representa a un ingrediente que se puede 
 *agregar o eliminar de algún elemento en un pedido.
 */

public class Ingrediente {

	// ************************************************************************
	// Atributos
	// ************************************************************************
	
	
	/** 
	 * El nombre del ingrediente, no están repetidos
	 */
	private String nombre;
	
	/* 
	 * El costo adicional por agregar un ingrediente
	 */
	private int costoAdicional;
	
	//Falta asosiacion de Restaurante hacia Ingredientes y agregados/eliminados 
	//desde ProductoAjustado
	
	
	// ************************************************************************
	// Constructores
	// ************************************************************************

	
	/**
	 * Construye un nuevo ingrediente e inicializa sus 
	 * atributos con la información de los parámetros. 
	 */
	public Ingrediente(String nombre, int costoAdicional) 
	{
		this.nombre = nombre;
		this.costoAdicional = costoAdicional;
	}
	
	
	// ************************************************************************
	// Métodos para consultar los atributos
	// ************************************************************************


	/**
	 * Consulta el nombre 
	 * 
	 * @return nombre
	 */
	public String getNombre() 
	{
		return nombre;
	}

	
	/**
	 * Consulta el precio adicional
	 * 
	 * @return costoAdicional 
	 */
	public int getCostoAdicional() 
	{
		return costoAdicional;
	}

}
