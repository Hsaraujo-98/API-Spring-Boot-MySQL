package br.com.supermercado.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.supermercado.domain.Produto;
import br.com.supermercado.dtos.commands.ProdutoInsertCommand;
import br.com.supermercado.services.ProdutoService;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@PostMapping()
	public ResponseEntity<?> incluirProduto(@Valid @RequestBody ProdutoInsertCommand command) {

		Produto produto = produtoService.inserir(command);

		return ResponseEntity.ok(produto);
	}

}
