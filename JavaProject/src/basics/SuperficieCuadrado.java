package basics;

import java.util.Scanner;

public class SuperficieCuadrado {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        int lado, superficie;
        
        lado = scanner.nextInt();
        
        superficie = lado*lado;
        
        System.out.println("La superficie del cuadrado es: "+ superficie);
        
	}

}
