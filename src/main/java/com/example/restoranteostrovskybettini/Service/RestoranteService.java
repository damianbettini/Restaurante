package com.example.restoranteostrovskybettini.Service;

import com.example.restoranteostrovskybettini.Entity.Bebida;
import com.example.restoranteostrovskybettini.Entity.Comida;
import com.example.restoranteostrovskybettini.Entity.Restorante;
import com.example.restoranteostrovskybettini.Repository.BebidaRepository;
import com.example.restoranteostrovskybettini.Repository.ComidaRepository;
import com.example.restoranteostrovskybettini.Repository.UserRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class RestoranteService {


    private ComidaServiceImp comidaServiceImp;


    private BebidasServiceImp bebidasServiceImp;



    private ComidaRepository comidaRepository;
    private BebidaRepository bebidaRepository;
    private UserRepository userRepository;

    public RestoranteService(ApplicationContext context){
        this.comidaRepository = context.getBean(ComidaRepository.class);
        this.bebidaRepository = context.getBean(BebidaRepository.class);
        this.userRepository = context.getBean(UserRepository.class);
        this.bebidasServiceImp = context.getBean(BebidasServiceImp.class);
        this.comidaServiceImp = context.getBean(ComidaServiceImp.class);
    }

    public Restorante crearRestorante(){

        Restorante restorante = new Restorante();
        ArrayList<Comida> comidas = new ArrayList<>();
        ArrayList<Bebida> bebidas = new ArrayList<>();

        restorante.setNombre("BettiniOstrovsky");

        comidas = comidaServiceImp.crearListaComidas();
        bebidas = bebidasServiceImp.crearListaBebidas();
        restorante.setComidas(comidas);
        restorante.setBebidas(bebidas);



        for (Comida aux: comidas) {
            comidaRepository.save(aux);
        }


        for (Bebida aux: bebidas) {
            bebidaRepository.save(aux);
        }


        //restoranteRepository.save(comidas.get(1));
     //  restoranteRepository.save(comidas);
     //  bebidaRepository.save(bebidas);

        return restorante;
    }
}
