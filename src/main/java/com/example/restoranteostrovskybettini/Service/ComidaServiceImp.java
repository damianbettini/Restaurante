package com.example.restoranteostrovskybettini.Service;

import com.example.restoranteostrovskybettini.Entity.Comida;
import com.example.restoranteostrovskybettini.Interface.ComidaService;
import com.example.restoranteostrovskybettini.Repository.ComidaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComidaServiceImp implements ComidaService {
    private final ComidaRepository comidaRepository;

    public ComidaServiceImp(ComidaRepository comidaRepository) {
        this.comidaRepository = comidaRepository;
    }

    public ArrayList<Comida> crearListaComidas(){

        ArrayList<Comida> comidas = new ArrayList<>();
        comidas.add(new Comida(null,"Hamburguesa Simple", "1000.00"));
        comidas.add(new Comida(null,"Hamburguesa con queso", "1100.00"));
        comidas.add(new Comida(null,"Hamburguesa Completa", "1350.00"));
        comidas.add(new Comida(null,"Hamburguesa Bettini", "1900.00"));
        comidas.add(new Comida(null,"Hamburguesa Ostrovsky", "2000.00"));

        comidas.add(new Comida(null,"Hamburguesa Sharon", "1800.00"));
        comidas.add(new Comida(null,"Hamburguesa Damian", "1800.00"));
        comidas.add(new Comida(null,"Hamburguesa Carla", "1800.00"));
        comidas.add(new Comida(null,"Hamburguesa Lautaro", "1800.00"));
        comidas.add(new Comida(null,"Hamburguesa Max", "1800.00"));
        comidas.add(new Comida(null,"Hamburguesa Jasbir", "1800.00"));
        comidas.add(new Comida(null,"Hamburguesa Fernando", "1800.00"));
        comidas.add(new Comida(null,"Hamburguesa Facundo", "1800.00"));
        comidas.add(new Comida(null,"Hamburguesa Ivonne", "1800.00"));
        comidas.add(new Comida(null,"Hamburguesa Eliana", "1800.00"));
        comidas.add(new Comida(null,"Hamburguesa Dalma", "1800.00"));
        comidas.add(new Comida(null,"Hamburguesa Eliana", "1800.00"));
        comidas.add(new Comida(null,"Hamburguesa Marcos", "1800.00"));
        comidas.add(new Comida(null,"Hamburguesa Mirna", "1800.00"));
        comidas.add(new Comida(null,"Hamburguesa Hector", "1800.00"));


        comidas.add(new Comida(null,"Porcion de Papas Fritas", "800.00"));
        comidas.add(new Comida(null,"Papas Fritas con Chedar", "1000.00"));
        comidas.add(new Comida(null,"Papas Fritas con Chedar y Panceta", "1100.00"));

        comidas.add(new Comida(null,"Porcion de Nuggets", "1000.00"));

        comidas.add(new Comida(null,"Porcion de Aros de Cebolla", "800.00"));

        return comidas;

    }

    @Override
    public List<Comida> listarTodasLasComidas() {
        return comidaRepository.findAll();
    }

    @Override
    public Comida guardarComida(Comida comida) {
        return comidaRepository.save(comida);
    }

    @Override
    public Comida obtenerComidaPorId(Long id) {
        return comidaRepository.findById(id).get();
    }

    @Override
    public Comida actualizarComida(Comida comida) {
        return comidaRepository.save(comida);
    }

    @Override
    public void eliminarComida(Long id) {
        comidaRepository.deleteById(id);
    }
}
