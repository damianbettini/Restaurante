package com.example.restoranteostrovskybettini.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Bebida")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bebida{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="nombre", nullable = false)
    private String nombre;
    @Column(name="precio", nullable = false)
    private String precio;
    @Column(name="categoria", nullable = false)
    private String categoriaBebida;
}
