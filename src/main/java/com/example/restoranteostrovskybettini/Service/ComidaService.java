package com.example.restoranteostrovskybettini.Service;

import com.example.restoranteostrovskybettini.Entity.Comida;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ComidaService {

    public ArrayList<Comida> crearListaComidas(){

        ArrayList<Comida> comidas = new ArrayList<>();
        comidas.add(new Comida(null,"Hamburguesa Simple", 1000.0));
        comidas.add(new Comida(null,"Hamburguesa con queso", 1100.0));
        comidas.add(new Comida(null,"Hamburguesa Completa", 1350.0));
        comidas.add(new Comida(null,"Hamburguesa Bettini", 1900.0));
        comidas.add(new Comida(null,"Hamburguesa Ostrovsky", 2000.0));

        comidas.add(new Comida(null,"Hamburguesa Sharon", 1800.0));
        comidas.add(new Comida(null,"Hamburguesa Damian", 1800.0));
        comidas.add(new Comida(null,"Hamburguesa Carla", 1800.0));
        comidas.add(new Comida(null,"Hamburguesa Lautaro", 1800.0));
        comidas.add(new Comida(null,"Hamburguesa Max", 1800.0));
        comidas.add(new Comida(null,"Hamburguesa Jasbir", 1800.0));
        comidas.add(new Comida(null,"Hamburguesa Fernando", 1800.0));
        comidas.add(new Comida(null,"Hamburguesa Facundo", 1800.0));
        comidas.add(new Comida(null,"Hamburguesa Ivonne", 1800.0));
        comidas.add(new Comida(null,"Hamburguesa Eliana", 1800.0));
        comidas.add(new Comida(null,"Hamburguesa Dalma", 1800.0));
        comidas.add(new Comida(null,"Hamburguesa Eliana", 1800.0));
        comidas.add(new Comida(null,"Hamburguesa Marcos", 1800.0));
        comidas.add(new Comida(null,"Hamburguesa Mirna", 1800.0));
        comidas.add(new Comida(null,"Hamburguesa Hector", 1800.0));


        comidas.add(new Comida(null,"Porcion de Papas Fritas", 800.0));
        comidas.add(new Comida(null,"Papas Fritas con Chedar", 1000.0));
        comidas.add(new Comida(null,"Papas Fritas con Chedar y Panceta", 1100.0));

        comidas.add(new Comida(null,"Porcion de Nuggets", 1000.0));

        comidas.add(new Comida(null,"Porcion de Aros de Cebolla", 800.0));

        return comidas;

    }
}
