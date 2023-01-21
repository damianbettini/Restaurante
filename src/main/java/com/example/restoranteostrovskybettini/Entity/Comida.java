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

    @Column(name="nombre", nullable = false)
    private String nombre;
    @Column(name="precio", nullable = false)
    private String precio;
}
