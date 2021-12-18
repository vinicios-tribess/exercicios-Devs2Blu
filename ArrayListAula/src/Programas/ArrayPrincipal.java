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
			System.out.println("Lista contém registros");
		}
		
		int posicao3 = 3;
		System.out.println("O veículo da posição 3 é o: " + listaCarros.get(posicao3));
		
		//Inverte as marcas das posições 2 e 3
		int posicao2 = 2;
		String marcaSalva;
		marcaSalva = listaCarros.get(posicao2);
		listaCarros.set(posicao2, listaCarros.get(posicao3));
		listaCarros.set(posicao3, marcaSalva);
		System.out.println(listaCarros);
		
		//Em qual posição está um elemento segundo seu conteúdo
		System.out.println(listaCarros.indexOf("BMW"));
		
		/*Remover uma marca de acordo com a posição
		posicao2 = Integer.parseInt(JOptionPane.showInputDialog("Qual a posição que quer eliminar?"));
		listaCarros.remove(posicao2);
		System.out.println(listaCarros);
		*/
		
		//Remover uma marca de acordo com o nome
		posicao2 = Integer.parseInt(JOptionPane.showInputDialog("Qual a marca que quer eliminar?"));
		listaCarros.remove(posicao2);
		System.out.println(listaCarros);
		
	}

}