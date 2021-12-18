package Programas;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayPrincipal {

	public static void main(String[] args) {
		
		ArrayList<String> listaCarros = new ArrayList<>();
		
		//Adicionando marcas
		listaCarros.add("Mazda");
		listaCarros.add("Mercedes");
		listaCarros.add("BMW");
		listaCarros.add("Toyota");
		listaCarros.add("Honda");
		
		System.out.println(listaCarros);
		
		if (listaCarros.isEmpty()) {
			System.out.println("Lista vazia");
		} else {
			System.out.println("Lista cont�m registros");
		}
		
		int posicao3 = 3;
		System.out.println("O ve�culo da posi��o 3 � o: " + listaCarros.get(posicao3));
		
		//Inverte as marcas das posi��es 2 e 3
		int posicao2 = 2;
		String marcaSalva;
		marcaSalva = listaCarros.get(posicao2);
		listaCarros.set(posicao2, listaCarros.get(posicao3));
		listaCarros.set(posicao3, marcaSalva);
		System.out.println(listaCarros);
		
		//Em qual posi��o est� um elemento segundo seu conte�do
		System.out.println(listaCarros.indexOf("BMW"));
		
		/*Remover uma marca de acordo com a posi��o
		posicao2 = Integer.parseInt(JOptionPane.showInputDialog("Qual a posi��o que quer eliminar?"));
		listaCarros.remove(posicao2);
		System.out.println(listaCarros);
		*/
		
		//Remover uma marca de acordo com o nome
		posicao2 = Integer.parseInt(JOptionPane.showInputDialog("Qual a marca que quer eliminar?"));
		listaCarros.remove(posicao2);
		System.out.println(listaCarros);
		
	}

}