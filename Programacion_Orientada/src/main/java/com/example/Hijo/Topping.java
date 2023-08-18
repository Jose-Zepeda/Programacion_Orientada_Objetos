package com.example.Hijo;

import com.example.Padre.Pizza;
public class Topping
{
    //PROPIEDAD
    private String nombre;

    //SETTER
    public Topping(String nombre) {
        this.nombre = nombre;
    }

    //GETTER
    public String getNombre() {
        return nombre;
    }

    public void Agregar(Pizza pizza) {
        String ingredientesActuales = pizza.getIngredientes();
        if (!ingredientesActuales.isEmpty()) {
            ingredientesActuales += ", ";
        }
        ingredientesActuales += this.nombre;
        pizza.setIngredientes(ingredientesActuales);
    }
}
