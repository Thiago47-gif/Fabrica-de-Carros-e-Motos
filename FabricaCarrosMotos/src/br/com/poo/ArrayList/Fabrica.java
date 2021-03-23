package br.com.poo.ArrayList;

import java.util.ArrayList;

import java.util.Scanner;

public class Fabrica {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); //Capturar dados do teclado

	    //Lista
		ArrayList<Moto> listMoto = new ArrayList<>();

		ArrayList<Carro> listCarro = new ArrayList<>();

		//instânciar
		Moto moto = new Moto();
		Carro carro = new Carro();

		//Mostrar carros e motos
		int voltar;
		
		do
		{
			System.out.println("Qual informação de veiculo desejada: \n");
			System.out.println("Moto - Digite '1'\n");
			System.out.println("Carro - Digite '2'\n\n");
			System.out.print("Opção: ");
			int opcao = leia.nextInt();
			System.out.println("\n");
		switch (opcao) {
		case 1:

			moto.setAno("2017");
			moto.setCor("Laranja");
			moto.setModelo("Honda CBR 1000 RR");
			moto.setPlaca("IPY2515");
			moto.setCategoria("Esportiva");
			moto.setCilindro("2");
			listMoto.add(moto);
			mostrarMoto(listMoto);
			break;
		case 2:

			carro.setAno("2014");
			carro.setCor("Vermelho");
			carro.setModelo("Chevrolet Onix");
			carro.setPlaca("IPY2515");
			carro.setChassi("BR53536387FG");
			carro.setTracao("4x4");
			listCarro.add(carro);
			mostrarCarro(listCarro);
			break;
		}
		System.out.print("\n Digite 1 para escolher outra opção ou 2 para finalizar: ");
		voltar = leia.nextInt();
		}
		while(voltar == 1);
	}
	//Método de listagem de dados
	public static void mostrarMoto(ArrayList<Moto> listMoto) {
		for(Moto item1: listMoto) {
			System.out.printf("%s\n", item1.toString());
		}
	}

	public static void mostrarCarro(ArrayList<Carro> listCarro) {
		for(Carro item2: listCarro) {
			System.out.printf("%s\n", item2.toString());
		}

	}

}
