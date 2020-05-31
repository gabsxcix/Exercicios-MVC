package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.Armazem;
import model.Cliente;
import model.Peca;
import model.Pedido;
import model.Vendedor;

/**
 * 
 * 
 * @author Gabriellen e Karine
 * @version 1.0
 * @since 2020
 * 
 */
public class MetodosCompra {
	/**
	 * Método para fazer cadastrar um pedido
	 * calcular total de vendas e comissao do funcionario
	 * e imprimir todos esses valores
	 * 
	 * @throws Exception
	 */
	public void fazerPedido() {
		Scanner sc = new Scanner(System.in);
		Pedido pedido = new Pedido();
		Cliente cliente = new Cliente();
		Vendedor vendedor = new Vendedor();
		Armazem armazem = new Armazem();
		Peca peca = new Peca();
		
		try {
		System.out.println("Informe o numero do pedido: ");
		pedido.setNumeropedido(sc.nextInt());
		limpaBuffer(sc);
		}catch(InputMismatchException e) {
			System.out.println("Digite um número!");
			System.exit(0);
		}
		System.out.println("Informe o nome do pedido: ");
		pedido.setNome(sc.nextLine());
		System.out.println("Informe o nome do cliente: ");
		cliente.setNome(sc.nextLine());
		try {
		System.out.println("Informe o numero do vendedor: ");
		vendedor.setNumerovendedor(sc.nextInt());
		limpaBuffer(sc);
		System.out.println("Informe o numero do armazem: ");
		armazem.setNumeroarmazem(sc.nextInt());
		limpaBuffer(sc);
		System.out.println("Informe a quantidade de peças: ");
		peca.setQuantidadepeca(sc.nextInt());
		limpaBuffer(sc);
		System.out.println("Informe o preço da peça: ");
		peca.setPreco(sc.nextDouble());
		}catch(InputMismatchException e) {
			System.out.println("Digite um número!");
			System.exit(0);
		}
		
		double comissao = peca.getPreco() * 0.05;
		double venda = peca.getPreco() * peca.getQuantidadepeca();
		
		System.out.println("Número do pedido: " +pedido.getNumeropedido());
		System.out.println("Nome: " +pedido.getNome());
		System.out.println("Nome Cliente: " +cliente.getNome());
		System.out.println("Vendedor numero: " +vendedor.getNumerovendedor());
		System.out.println("Armazem numero: " +armazem.getNumeroarmazem());
		System.out.println("A quantidade total de peças: " +peca.getQuantidadepeca());
		System.out.println("Preco cotado: " +peca.getPreco());
		System.out.println();
		System.out.println("Preco total da venda: "+ venda);
		System.out.println("Preco total de comissao: " +comissao);
		
	}
	
	public void limpaBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }
}
