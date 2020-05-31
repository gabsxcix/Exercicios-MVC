package model;
/**
 * 
 * 
 * @author Gabriellen e Karine
 * @version 1.0
 * @since 2020
 * 
 */
public class Vendedor extends Funcionario{
	private int codigo;
	private String nome;
	private int numerovendedor;
	
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
	public int getNumerovendedor() {
		return numerovendedor;
	}
	public void setNumerovendedor(int numerovendedor) {
		this.numerovendedor = numerovendedor;
	}
	
	
}
