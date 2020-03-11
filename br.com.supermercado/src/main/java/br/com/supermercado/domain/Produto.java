package br.com.supermercado.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.supermercado.dtos.commands.ProdutoInsertCommand;
import lombok.Getter;

@Entity
@Getter
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduto;

	private String produto;

	private Double preco;

	private String dataValidade;

	protected Produto() {

	}

	public Produto(ProdutoInsertCommand command) {
		this.produto = command.getProduto();
		this.preco = command.getPreco();
		this.dataValidade = command.getDataValidade();
	}

}
