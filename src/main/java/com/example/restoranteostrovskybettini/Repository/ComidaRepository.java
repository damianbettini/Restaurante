package com.example.restoranteostrovskybettini.Repository;

import com.example.restoranteostrovskybettini.Entity.Comida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComidaRepository extends JpaRepository<Comida, Long> {
}
