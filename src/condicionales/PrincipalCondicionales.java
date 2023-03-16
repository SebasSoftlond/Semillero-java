package condicionales;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PrincipalCondicionales {

	/* if(condicion) {
		bloque codigo
	}
	else if(condicion) {
		bloque codigo
	}
	else {
		bloque codigo
	}
	*/
	/**
	 * IMC = peso/estatura elevado a las 2
	 */
	
	public static void main(String[] args) {
		int peso = 50;
		double estatura = 1.77;
		double imc = peso/Math.pow(estatura, 2);
		if(imc < 16) {
			System.out.println("La persona es muy delgada");
		}
		else if(imc < 18.5) {
			System.out.println("La persona es levemente delgada");
		}
		else if(imc < 25) {
			System.out.println("La persona tiene peso normal");
		}
		else {
			System.out.println("La persona tiene sobrepeso");
		}
		
		if(numeroAmstrong(373)) {
			System.out.println("es un numero amstrong");
		}
		else {
			System.out.println("no es un numero amstrong");
		}
		
		if(numeroPerfecto(28)) {
			System.out.println("El numero es perfecto");
		}
		else {
			System.out.println("el numero no es perfecto");
		}
		
		continueBreak();
		
		List<Integer> numeros = Arrays.asList(1,3,4,6,7);
		for (int i = 0; i < numeros.size(); i++) {
			System.out.println("lista " + numeros.get(i));
		}
		
		for (Integer numero : numeros) {
			System.out.println("lista forEach " + numero);
		}
		
		numeros.stream().forEach(x->{
			System.out.println("Stream " + x);
		});
		
		numeros.stream().filter(x->{
			return x%2==0?true:false;
		}).forEach(System.out::println);
		
		/* while (condicion) {
			bloque codigo
		}
		
		do {
			bloque codigo
		}
		while(condicion)
		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			type type = (type) iterator.next();
			
		}
		for (String string : args) {
			
		}
		for, while, do while, foreach */
		
		
	}
	
	public static boolean numeroAmstrong(int numero) {
		int numeroOriginal = numero;
		double digitos;
		double suma = 0;
		int ultimoDigito;
		digitos = Math.floor(Math.log10(numero)) + 1;
		while (numero > 0) {
			ultimoDigito = numero % 10;
			suma += Math.pow(ultimoDigito, digitos);
			numero = numero / 10;
		}
		return suma == numeroOriginal?true:false;
	}
	
	/***
	 * numero perfecto es aquel que es igual a la suma de sus divisores positivos
	 * ejem numero 28 es divisible por 1,2,4,7,14
	 * @param numero
	 * @return
	 */
	public static boolean numeroPerfecto(int numero) {
		int suma = 0;
		int divisor = 1;
		do {
			if(numero % divisor == 0) {
				suma += divisor;
			}
			divisor ++;
		} while(divisor <= numero / 2);
		return suma == numero?true:false;
	}
	
	public static void continueBreak() {
		for (int i = 0; i < 8; i++) {
			if(i == 1) {
				//continue;
				break;
			}
			System.out.println("index " + i);
		}
	}
	
	/* public static void calcularInteres() {
		float tasaMensual = tasaAnual /12;
		float interesMensual = saldo * tasaMensual;
		saldo += interesMensual;
	}*/
	
	/*
	public static void extractoMensual() {
		saldo -= comisionMensual;
		calcularInteres();
	}
	*/
}
