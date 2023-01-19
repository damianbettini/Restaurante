package com.example.restoranteostrovskybettini.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Comida")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Comida{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private Double precio;
}
