package com.example;

import com.example.Hijo.PizzaItaliana;
import com.example.Hijo.Topping;
import com.example.Padre.Pizza;

public class Main {
    public static void main(String[] args)
    {
        Pizza PizzaNormal = new Pizza("Pizza Normal", 10.0, "queso, tomate, cebolla");
        Topping pizzaPepperoni = new Topping("pepperoni");
        pizzaPepperoni.Agregar(PizzaNormal);
        System.out.println(PizzaNormal.obtenerDetalles());
        PizzaNormal.Preparar();


        PizzaItaliana PizzaItaliana = new PizzaItaliana("Pizza Italiana", 10.0, "queso, tomate, cebolla", "Italiana", "20 minutos");
        Topping pizzaChampiñones = new Topping("champiñones, jamon");
        pizzaChampiñones.Agregar(PizzaItaliana);
        System.out.println(PizzaItaliana.obtenerDetalles());
        PizzaItaliana.Preparar();
    }
}