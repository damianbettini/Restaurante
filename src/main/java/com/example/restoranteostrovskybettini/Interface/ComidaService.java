package com.example.restoranteostrovskybettini.Interface;

import com.example.restoranteostrovskybettini.Entity.Bebida;
import com.example.restoranteostrovskybettini.Entity.Comida;

import java.util.List;

public interface ComidaService{
    public List<Comida> listarTodasLasComidas();


    public Comida guardarComida(Comida comida);

    public Comida obtenerComidaPorId(Long id);

    public Comida actualizarComida(Comida comida);

    public void eliminarComida(Long id);
}
