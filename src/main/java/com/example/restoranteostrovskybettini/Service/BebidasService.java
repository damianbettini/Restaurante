package com.example.restoranteostrovskybettini.Service;

import com.example.restoranteostrovskybettini.Entity.Bebida;
import com.example.restoranteostrovskybettini.Enum.CategoriaBebida;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BebidasService {

    public ArrayList<Bebida> crearListaBebidas(){

        ArrayList<Bebida> bebidas = new ArrayList<>();

        bebidas.add(new Bebida(null,"Coca Cola común", 400.0, CategoriaBebida.NO_ALCOHOLICAS));
        bebidas.add(new Bebida(null,"Coca Cola light", 400.0, CategoriaBebida.NO_ALCOHOLICAS));
        bebidas.add(new Bebida(null,"Coca Cola zero", 400.0, CategoriaBebida.NO_ALCOHOLICAS));
        bebidas.add(new Bebida(null,"Sprite comun", 350.0, CategoriaBebida.NO_ALCOHOLICAS));
        bebidas.add(new Bebida(null,"Sprite light", 400.0, CategoriaBebida.NO_ALCOHOLICAS));
        bebidas.add(new Bebida(null,"Agua", 300.0, CategoriaBebida.NO_ALCOHOLICAS));
        bebidas.add(new Bebida(null,"Agua con gas", 325.0, CategoriaBebida.NO_ALCOHOLICAS));

        bebidas.add(new Bebida(null,"Cerveza artesanal ", 800.0, CategoriaBebida.ALCOHOLICAS));
        bebidas.add(new Bebida(null,"Gin Tonic", 1000.0, CategoriaBebida.ALCOHOLICAS));
        bebidas.add(new Bebida(null,"Fernet", 850.0, CategoriaBebida.ALCOHOLICAS));

        return bebidas;

    }
}
