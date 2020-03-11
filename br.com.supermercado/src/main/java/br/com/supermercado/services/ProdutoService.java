package br.com.supermercado.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.supermercado.domain.Produto;
import br.com.supermercado.dtos.commands.ProdutoInsertCommand;
import br.com.supermercado.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public Produto inserir(ProdutoInsertCommand command) {

		Produto produto = new Produto(command);

		return produtoRepository.save(produto);
	}

}
