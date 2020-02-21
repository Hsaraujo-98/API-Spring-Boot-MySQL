package br.com.supermercado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.supermercado.domain.Produto;
import br.com.supermercado.dtos.commands.ProdutoInsertCommand;
import br.com.supermercado.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public List<Produto> list() {

		return produtoRepository.findAll();
	}

	public Produto inserir(ProdutoInsertCommand command) {

		Produto produto = new Produto(command);

		return produtoRepository.save(produto);
	}

}
