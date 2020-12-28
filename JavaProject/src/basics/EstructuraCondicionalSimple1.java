package basics;

import java.util.Scanner;

public class EstructuraCondicionalSimple1 {

	public static void main(String[] args) {
		int sueldo;
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Ingrese valor sueldo:");
		
		sueldo = scanner.nextInt();
		
		if (sueldo>30000)
			System.out.print("Debe pagar impuestos.");
		else
			System.out.print("No debe pagar impuestos.");
		
	}

}
