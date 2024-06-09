package br.com.sgpf.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto", schema = "sgpf")
public class ProdutoEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "idproduto")
private long idProduto;


@Column(name = "nome")
private String nome;

@Column(name = "quantidade")
private String quantidade;

public long getIdProduto() {
	return idProduto;
}

public void setIdProduto(long idProduto) {
	this.idProduto = idProduto;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getQuantidade() {
	return quantidade;
}

public void setQuantidade(String quantidade) {
	this.quantidade = quantidade;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

}
