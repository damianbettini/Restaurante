package com.example.restoranteostrovskybettini.Repository;

import com.example.restoranteostrovskybettini.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
