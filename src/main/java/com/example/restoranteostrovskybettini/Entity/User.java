package com.example.restoranteostrovskybettini.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Set;


@Entity
@Table(name="User")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String mail;
    private String clave;
    private String usuario;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="user_roles"
            ,joinColumns=@JoinColumn(name="user_id")
            ,inverseJoinColumns=@JoinColumn(name="role_id"))
    private Set roles;
    @Transient
    private String confirClave;
}
