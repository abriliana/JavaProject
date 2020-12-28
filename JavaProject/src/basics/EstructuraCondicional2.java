package basics;

import java.util.Scanner;

public class EstructuraCondicional2 {

		public static void main(String[] args) {
			int num1,num2;
			
			Scanner scanner = new Scanner (System.in);
			System.out.print("Ingrese 1er valor :");
			num1 = scanner.nextInt();
			
			System.out.print("Ingrese 2do valor :");
			num2 = scanner.nextInt();
			
			if (num1 > num2)
				System.out.print("El valor mayor es :"+num1);
			else
				System.out.print("El valor mayor es :"+num2);
			
		}


}
