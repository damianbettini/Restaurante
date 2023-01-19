package com.example.restoranteostrovskybettini.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Restorante{

    private String nombre;

    @OneToMany
    private ArrayList<Comida> comidas;

    @OneToMany
    private ArrayList<Bebida> bebidas;
}
