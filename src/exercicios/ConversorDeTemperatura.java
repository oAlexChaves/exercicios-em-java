package exercicios;

import java.util.Scanner;

public class ConversorDeTemperatura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em celsius: ");
		double celsius = sc.nextDouble();
		System.out.println("selecione para onde você quer converter:"
				+ "'1' para Kelvin "
				+ "'2' para Fahrenheit");
		String opcao = sc.next();
		sc.close();
		switch (opcao) {
		case "1":
			System.out.println("A temperatura convertida para Fahrenheit resulta em: " + ((celsius * 1.8) +32 ));
			break;
		case "2":
			System.out.println("A temperatura convertida para Kelvin resulta em:" + (celsius + 273));
			break;
		case "3":
			System.out.println("teste42412");
			break;
		}
	}

}
