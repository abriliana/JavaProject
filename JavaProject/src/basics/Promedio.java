package basics;

import java.util.Scanner;

public class Promedio {

	public static void main(String[] args) {
		int num1, num2, num3, num4;
		float promedio, suma;
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Ingrese primer valor:");
		num1 = scanner.nextInt();
		System.out.print("Ingrese segundo valor:");
		num2 = scanner.nextInt();
		System.out.print("Ingrese tercer valor:");
		num3 = scanner.nextInt();
		System.out.print("Ingrese cuarto valor:");
		num4 = scanner.nextInt();

		suma = num1+num2+num3+num4;
		promedio = suma/4;
		System.out.print("El total es de: "+suma+" y el promedio es de: "+promedio+" puntos.");
		
		

	}

}
