package com.fran.bookstore.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fran.bookstore.domain.Categoria;

@Repository
public interface CategoriaRepository extends  JpaRepository<Categoria, Integer>{
	

}
