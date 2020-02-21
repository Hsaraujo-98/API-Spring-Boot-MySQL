package br.com.supermercado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.supermercado.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	Produto saveProduto(Produto produto);

}
