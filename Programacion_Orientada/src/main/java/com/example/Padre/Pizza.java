package com.example.Padre;

public class Pizza
{

    //DECLARACION DE PROPIEDADES
    private String nombre;
    private double precio;
    private String ingredientes;


    //GETTERS AND SETTERS

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    public void setIngredientes(String ingredientes)
    {
        this.ingredientes = ingredientes;
    }

    public String getNombre()
    {
        return nombre;
    }

    public double getPrecio()
    {
        return precio;
    }

    public String getIngredientes()
    {
        return ingredientes;
    }

    //CONSTRUCTOR
    public Pizza(String nombre, double precio, String ingredientes)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
    }

    //IMPRIMIR EN PANTALLA LOS DATOS DE LA PIZZA

    public String obtenerDetalles()
    {
        return "*Nombre: " + this.getNombre() + "\n*Precio: " + this.getPrecio() + "\n*Ingredientes: " + this.getIngredientes();
    }

    //METODO PARA PREPARAR LA PIZZA
    public void Preparar()
    {
        System.out.println("La pizza esta lista para ser servida");
    }
}
