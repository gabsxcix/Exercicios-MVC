package view;

import controller.MetodosCompra;
/**
 * 
 * 
 * @author Gabriellen e Karine
 * @version 1.0
 * @since 2020
 * 
 */
public class Programa {
	/**
	 * Método principal
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) {
		
		MetodosCompra mc = new MetodosCompra();
		
		mc.fazerPedido();
	}

}