package com.fran.bookstore.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fran.bookstore.domain.Livro;

@Repository
public interface LivroRepository extends  JpaRepository<Livro, Integer>{
	

}
