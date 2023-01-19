package com.example.restoranteostrovskybettini.Entity;

import com.example.restoranteostrovskybettini.Enum.CategoriaBebida;
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
    private String nombre;
    private Double precio;
    private CategoriaBebida categoriaBebida;
}
