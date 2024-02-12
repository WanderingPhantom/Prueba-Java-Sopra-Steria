package ejercicios_prueba_admision;
import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("LEER HORASTRABAJADAS \n");
		int HORASTRABAJADAS = scanner.nextInt();
		System.out.print("LEER TARIFA \n");
		int TARIFA = scanner.nextInt();
		double sueldo = 0;
		if (HORASTRABAJADAS > 40) {
			int horas_extras = HORASTRABAJADAS - 40;
			double tarifa_extra = TARIFA + (50*TARIFA)/100.f;
			sueldo = 40*TARIFA + horas_extras*tarifa_extra;
		}
		else {
			sueldo = HORASTRABAJADAS*TARIFA;
		}
		
		System.out.print("Sueldo del trabajador: " + sueldo);

	}

}
