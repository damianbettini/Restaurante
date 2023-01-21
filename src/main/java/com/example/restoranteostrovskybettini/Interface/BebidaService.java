package com.example.restoranteostrovskybettini.Interface;

import com.example.restoranteostrovskybettini.Entity.Bebida;

import java.util.List;

public interface BebidaService {

    public List<Bebida> listarTodasLasBebidas();

    public Bebida guardarBebida(Bebida bebida);

    public Bebida obtenerBebidaPorId(Long id);

    public Bebida actualizarBebida(Bebida bebida);

    public void eliminarBebida(Long id);

}
