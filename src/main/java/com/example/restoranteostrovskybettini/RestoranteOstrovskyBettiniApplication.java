package com.example.restoranteostrovskybettini;

import com.example.restoranteostrovskybettini.Entity.Bebida;
import com.example.restoranteostrovskybettini.Enum.CategoriaBebida;
import com.example.restoranteostrovskybettini.Service.RestoranteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RestoranteOstrovskyBettiniApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(RestoranteOstrovskyBettiniApplication.class, args);


        RestoranteService resto = new RestoranteService(context);
        resto.crearRestorante();
    }

}
