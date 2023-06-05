package com.training.expense.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.expense.model.Category;
@Repository
public interface CategoryRepository extends CrudRepository<Category,Integer> {

	Optional<Category> findByName(String name);

}
