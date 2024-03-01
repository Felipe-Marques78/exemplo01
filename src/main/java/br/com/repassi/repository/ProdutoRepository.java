package br.com.repassi.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.repassi.entity.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
	
}
