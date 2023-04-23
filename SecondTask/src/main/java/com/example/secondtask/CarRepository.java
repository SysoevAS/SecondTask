package com.example.secondtask;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CarRepository extends JpaRepository<Car, Long> {
    @Query("SELECT p FROM Car p WHERE CONCAT(p.model, '', p.year, '', p.account_date, '', p.owner) LIKE %?1%")
    List<Car> search(String keyword);
}
