package model;
/**
 * 
 * 
 * @author Gabriellen e Karine
 * @version 1.0
 * @since 2020
 * 
 */
public class Peca {
	private int codigo;
	private String descricao;
	private double preco;
	private int quantidadeestoque;
	private Armazem numeroarmazem;
	private int quantidadepeca;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidadeestoque() {
		return quantidadeestoque;
	}
	public void setQuantidadeestoque(int quantidadeestoque) {
		this.quantidadeestoque = quantidadeestoque;
	}
	public Armazem getNumeroarmazem() {
		return numeroarmazem;
	}
	public void setNumeroarmazem(Armazem numeroarmazem) {
		this.numeroarmazem = numeroarmazem;
	}
	public int getQuantidadepeca() {
		return quantidadepeca;
	}
	public void setQuantidadepeca(int quantidadepeca) {
		this.quantidadepeca = quantidadepeca;
	}
	
	
}
