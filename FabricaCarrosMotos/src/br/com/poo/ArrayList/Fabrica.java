package br.com.poo.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Fabrica {

	public static void main(String[] args) {
		//Ler as informações inseridas pelo usuário
		Scanner leia = new Scanner(System.in); //Capturar dados do teclado

	    //Listar os dados
		ArrayList<Veiculo> listVeiculo = new ArrayList<>();

		//Retorno
		int voltar;
		
		//Indice da condição 'for'
		int i = 0;
		
		do
		{
			System.out.println("Qual veiculo desejada inserir as informações ? \n");
			System.out.println("Moto - Digite '1'\n");
			System.out.println("Carro - Digite '2'\n\n");
			System.out.print("Opção: ");
			int opcao = leia.nextInt();
			System.out.println("\n");
		switch (opcao) {
		case 1:
			//Instanciação
			Moto moto = new Moto();
			
            System.out.println("Insira os dados de uma Moto.\n");
            
            System.out.print("Cor da Moto: ");
            String cor = leia.nextLine();
            moto.setCor(cor);
            
            System.out.print("Ano da Moto: ");
            String ano = leia.nextLine();
            moto.setAno(ano);
            
            
            System.out.print("Modelo da Moto: ");
            String modelo = leia.nextLine();
            moto.setModelo(modelo);
            
            System.out.print("Placa da Moto: ");
            String placa = leia.nextLine();
            moto.setPlaca(placa);
            
            System.out.print("Valor da Moto: ");
            Double valorMoto = leia.nextDouble();
            moto.setValor(valorMoto);
            
            //Adicionar os dados inseridos para a lista de Veiculos
            listVeiculo.add(moto);
			
			break;
		case 2:

			//Instanciação
			Carro carro = new Carro();
			
            System.out.println("Insira os dados de uma Carro.\n");
            
            System.out.print("Cor do Carro: ");
            cor = leia.nextLine();
            carro.setCor(cor);
            
            System.out.print("Ano do Carro: ");
            ano = leia.nextLine();
            carro.setAno(ano);
            
            
            System.out.print("Modelo do Carro: ");
            modelo = leia.nextLine();
            carro.setModelo(modelo);
            
            System.out.print("Placa do Carro: ");
            placa = leia.nextLine();
            carro.setPlaca(placa);
            
            System.out.print("Valor do Carro: ");
            Double valorCarro = leia.nextDouble();
            carro.setValor(valorCarro);
            
            //Adicionar os dados inseridos para a lista de Veiculos
            listVeiculo.add(carro);
			break;
		}
		
		
		
		System.out.print("\n Digite 1 para escolher outra opção ou 2 para finalizar: ");
		voltar = leia.nextInt();
		}
		while(voltar == 1);
	}
	

}
