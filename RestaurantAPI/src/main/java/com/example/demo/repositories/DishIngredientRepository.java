package com.example.demo.repositories;

import com.example.demo.models.DishIngredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishIngredientRepository extends JpaRepository<DishIngredient, Long> {
}
