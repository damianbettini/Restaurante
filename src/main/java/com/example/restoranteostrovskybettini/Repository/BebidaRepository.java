package com.example.restoranteostrovskybettini.Repository;

import com.example.restoranteostrovskybettini.Entity.Bebida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BebidaRepository extends JpaRepository<Bebida,Long> {
}
