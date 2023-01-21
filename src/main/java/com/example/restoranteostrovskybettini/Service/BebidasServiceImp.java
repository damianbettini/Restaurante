package com.example.restoranteostrovskybettini.Service;

import com.example.restoranteostrovskybettini.Entity.Bebida;
import com.example.restoranteostrovskybettini.Interface.BebidaService;
import com.example.restoranteostrovskybettini.Repository.BebidaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BebidasServiceImp implements BebidaService {
    private final BebidaRepository bebidaRepository;

    public BebidasServiceImp(BebidaRepository bebidaRepository) {
        this.bebidaRepository = bebidaRepository;
    }

    public ArrayList<Bebida> crearListaBebidas(){

        ArrayList<Bebida> bebidas = new ArrayList<>();

        bebidas.add(new Bebida(null,"Coca Cola común", "400.00", "NO ALCOHOLICAS"));
        bebidas.add(new Bebida(null,"Coca Cola light", "400.00", "NO ALCOHOLICAS"));
        bebidas.add(new Bebida(null,"Coca Cola zero", "400.00", "NO ALCOHOLICAS"));
        bebidas.add(new Bebida(null,"Sprite comun", "350.00", "NO ALCOHOLICAS"));
        bebidas.add(new Bebida(null,"Sprite light", "400.00", "NO ALCOHOLICAS"));
        bebidas.add(new Bebida(null,"Agua", "300.00", "NO ALCOHOLICAS"));
        bebidas.add(new Bebida(null,"Agua con gas", "325.00", "NO ALCOHOLICAS"));

        bebidas.add(new Bebida(null,"Cerveza artesanal ", "800.00", "ALCOHOLICAS"));
        bebidas.add(new Bebida(null,"Gin Tonic", "1000.00", "ALCOHOLICAS"));
        bebidas.add(new Bebida(null,"Fernet", "850.00", "ALCOHOLICAS"));

        return bebidas;

    }

    @Override
    public List<Bebida> listarTodasLasBebidas() {
        return bebidaRepository.findAll();
    }

    @Override
    public Bebida guardarBebida(Bebida bebida) {
        return bebidaRepository.save(bebida);
    }

    @Override
    public Bebida obtenerBebidaPorId(Long id) {
        return bebidaRepository.findById(id).get();
    }

    @Override
    public Bebida actualizarBebida(Bebida bebida) {
        return bebidaRepository.save(bebida);
    }

    @Override
    public void eliminarBebida(Long id) {
        bebidaRepository.deleteById(id);
    }
}
