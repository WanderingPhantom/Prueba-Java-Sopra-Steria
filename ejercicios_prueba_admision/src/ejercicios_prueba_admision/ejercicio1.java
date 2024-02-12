package ejercicios_prueba_admision;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("LEER NUMERO \n");
		int NUMERO = scanner.nextInt();
		if (NUMERO%2 == 0) {
			System.out.print("Numero Par \n");
		}
		else System.out.print("Numero Impar \n");
		while (NUMERO > 1) {
			NUMERO = NUMERO - 2;
			System.out.print(NUMERO + ", ");
		}
	}

}
