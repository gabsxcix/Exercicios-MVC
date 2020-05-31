package model;
/**
 * 
 * 
 * @author Gabriellen e Karine
 * @version 1.0
 * @since 2020
 * 
 */
public class Cliente {
	private int codigo;
	private String nome;
	private String endereco;
	private double faturamentoacumulado;
	private double limitecredito;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getFaturamentoacumulado() {
		return faturamentoacumulado;
	}
	public void setFaturamentoacumulado(double faturamentoacumulado) {
		this.faturamentoacumulado = faturamentoacumulado;
	}
	public double getLimitecredito() {
		return limitecredito;
	}
	public void setLimitecredito(double limitecredito) {
		this.limitecredito = limitecredito;
	}
	
	
}
