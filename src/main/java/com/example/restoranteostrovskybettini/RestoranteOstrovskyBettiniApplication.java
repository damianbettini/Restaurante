package com.example.restoranteostrovskybettini;

import com.example.restoranteostrovskybettini.Entity.Bebida;
import com.example.restoranteostrovskybettini.Entity.Role;
import com.example.restoranteostrovskybettini.Entity.User;
import com.example.restoranteostrovskybettini.Repository.BebidaRepository;
import com.example.restoranteostrovskybettini.Repository.UserRepository;
import com.example.restoranteostrovskybettini.Service.RestoranteService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class RestoranteOstrovskyBettiniApplication implements CommandLineRunner {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(RestoranteOstrovskyBettiniApplication.class, args);

        UserRepository userRepository = context.getBean(UserRepository.class);

        RestoranteService resto = new RestoranteService(context);
        //resto.crearRestorante();

    }

    private BebidaRepository bebidaRepository;
    public RestoranteOstrovskyBettiniApplication(BebidaRepository bebidaRepository){
        this.bebidaRepository = bebidaRepository;
    }
    @Override
    public void run(String... args) throws Exception {
       /* Bebida bebida = new Bebida(null,"pruba bebida", "100.00", "NO ALCOHOLICAS");
        Bebida bebidaDos = new Bebida(null,"pruba bebida dos", "102.00", "NO ALCOHOLICAS");
        bebidaRepository.save(bebida);
        bebidaRepository.save(bebidaDos);
*/
    }
}
