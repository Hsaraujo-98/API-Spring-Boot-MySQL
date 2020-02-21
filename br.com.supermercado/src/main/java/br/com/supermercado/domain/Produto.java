package br.com.supermercado.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.supermercado.dtos.commands.ProdutoInsertCommand;
import lombok.Getter;

@Entity
@Getter
@Table(name = "produto")
public class Produto {

	@Id
	@Column(name = "idProduto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduto;

	@Column(name = "produtoNome")
	private String produto;

	@Column(name = "produtoPreco")
	private Double preco;

	@Column(name = "prodDtValidade")
	private String dataValidade;

	protected Produto() {

	}

	public Produto(ProdutoInsertCommand command) {
		this.produto = command.getProduto();
		this.preco = command.getPreco();
		this.dataValidade = command.getDataValidade();
	}

}
