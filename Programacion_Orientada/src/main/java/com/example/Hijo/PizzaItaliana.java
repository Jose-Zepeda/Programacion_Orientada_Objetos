package com.example.Hijo;
import com.example.Padre.Pizza;
public class PizzaItaliana extends Pizza

{
    //DECLARACION DE PROPIEDADES
    private String salsa;
    private String tiempo;

    //GETTERS AND SETTERS
    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    //CONSTRUCTOR
    public PizzaItaliana(String nombre, double precio, String ingredientes, String salsa, String tiempo) {
        super(nombre, precio, ingredientes);
        this.salsa = salsa;
        this.tiempo = tiempo;
    }

    //IMPRIMIR EN PANTALLA QUE LA PIZZA ESTA LISTA PARA SERVIR Y QUE ESTA AGREGANDO LA SALSA
    public void Preparar()
    {
        System.out.println("Agregando salsa...");
        System.out.println("La pizza esta lista para ser servida");
    }

    //IMPRIMIR EN PANTALLA LOS DATOS DE LA PIZZA
    public String obtenerDetalles()
    {
        return "*Nombre: " + this.getNombre() + "\n*Precio: " + this.getPrecio() + "\n*Ingredientes: " + this.getIngredientes() + "\n*Salsa: " + this.getSalsa() + "\n*Tiempo: " + this.getTiempo();
    }
}
