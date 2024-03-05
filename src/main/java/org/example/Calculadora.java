package org.example;

import java.text.DecimalFormat;

public class Calculadora {
	
	public int somar(int a, int b) {
		return a + b;
	}
	
	public int subtrair(int a, int b) {
		return a - b;
	}
	
	public int multiplicar(int a, int b ) {
		return a * b;
	}

	public int dividir(int a, int b) { return a / b; }

	public float media(int a, int b) { return (a+b)/2; }

	public float mediaVariosNumeros(int[] numeros) {
		float soma = 0;
		for (int numero : numeros) {
			soma += numero;
//			System.out.println(soma);
		}

		float media = (float) soma / numeros.length; // Calculando a média.
		DecimalFormat df = new DecimalFormat("#.##"); // Formato para arredondar para duas casas decimais.
		return Float.parseFloat(df.format(media));
	}



}
