package basics;

import java.util.Scanner;

public class SumaProductoNumeros {

	public static void main(String[] args) {
		int num1, num2, suma, producto;
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Ingrese primer valor:");
		num1 = scanner.nextInt();
		System.out.print("Ingrese segundo valor:");
		num2 = scanner.nextInt();
		
		suma = num1 + num2;
		producto = num1*num2;
		
		 System.out.println("El resultado de la suma es: "+suma);
		 System.out.println("El producto es: "+producto);
		
	}

}
