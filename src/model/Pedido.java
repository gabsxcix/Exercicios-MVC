package model;

import java.util.Date;
/**
 * 
 * 
 * @author Gabriellen e Karine
 * @version 1.0
 * @since 2020
 * 
 */
public class Pedido {
	private int codigo;
	private int numeropedido;
	private Date data;
	private String nome;
	private String enderecocliente;
	private int codpeca;
	double precopeca;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getNumeropedido() {
		return numeropedido;
	}
	public void setNumeropedido(int numeropedido) {
		this.numeropedido = numeropedido;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnderecocliente() {
		return enderecocliente;
	}
	public void setEnderecocliente(String enderecocliente) {
		this.enderecocliente = enderecocliente;
	}
	public int getCodpeca() {
		return codpeca;
	}
	public void setCodpeca(int codpeca) {
		this.codpeca = codpeca;
	}
	public double getPrecopeca() {
		return precopeca;
	}
	public void setPrecopeca(double precopeca) {
		this.precopeca = precopeca;
	}
		
}
