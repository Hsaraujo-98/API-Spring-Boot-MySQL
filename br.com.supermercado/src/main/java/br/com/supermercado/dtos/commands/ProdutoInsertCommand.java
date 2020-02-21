package br.com.supermercado.dtos.commands;

import javax.validation.constraints.NotBlank;

import lombok.Getter;

@Getter
public class ProdutoInsertCommand {

	@NotBlank(message = "Produto deve ser preenchido")
	private String produto;

	@NotBlank(message = "Preço deve ser preenchido")
	private Double preco;

	@NotBlank(message = "Data de validade deve ser preenchida")
	private String dataValidade;
}
