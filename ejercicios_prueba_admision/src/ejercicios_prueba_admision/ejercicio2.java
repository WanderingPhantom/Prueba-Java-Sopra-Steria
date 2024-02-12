package ejercicios_prueba_admision;
import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio2 {
	
	static class Persona {
		@Override
		public String toString() {
			return "Persona [edat=" + edat + ", sexo=" + sexo + "]";
		}
		private int edat;
		private String sexo;
		
		public Persona (String sexo, int edat) {
			this.edat = edat;
			this.sexo = sexo;
		}
		
		public int getEdat() {
			return edat;
		}
		public void setEdat(int edat) {
			this.edat = edat;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("LEER PERSONAS \n");
		ArrayList<Persona> vec_pers = new ArrayList<Persona>();
		int mujeres_mayores = 0;
		int hombres_menores = 0;
		int hombres_mayores = 0;
		int mujeres_menores = 0;
		for (int i = 0; i < 50; i++) {
			int edat = scanner.nextInt();
			String sexo = scanner.nextLine();
			sexo = sexo.replaceAll("\\s", "");
			Persona p = new Persona(sexo, edat);
			vec_pers.add(p);
		}
		
		for (int i = 0; i < 50; i++) {
			Persona p = vec_pers.get(i);
			if(p.getEdat() >= 18 && p.getSexo().equals("hombre")) hombres_mayores++;
			if(p.getEdat() >= 18 && p.getSexo().equals("mujer")) mujeres_mayores++;
			if(p.getEdat() < 18 && p.getSexo().equals("hombre")) hombres_menores++;
			if(p.getEdat() < 18 && p.getSexo().equals("mujer")) mujeres_menores++;
		}
		System.out.print("\n");
		System.out.print("Cantidad de personas mayores de edad (18 años o más): " + (hombres_mayores + mujeres_mayores) + "\n");
		System.out.print("Cantidad de personas menores de edad: " + (hombres_menores + mujeres_menores) + "\n");
		System.out.print("Cantidad de personas masculinas mayores de edad: " + hombres_mayores + "\n");
		System.out.print("Cantidad de personas femeninas menores de edad: " + mujeres_menores + "\n");
		double porcentaje_mayores = ((hombres_mayores + mujeres_mayores)*100)/50;
		System.out.print("Porcentaje que representan las personas mayores de edad respecto al total de personas: " + porcentaje_mayores + "\n");
		double porcentaje_mujeres = ((mujeres_mayores + mujeres_menores)*100)/50;
		System.out.print("Porcentaje que representan las mujeres respecto al total de personas: " + porcentaje_mujeres + "\n");

	}

}

/* INPUT
 * 
	50 hombre
	20 mujer
	19 hombre
	10 hombre
	9 mujer
	90 mujer
	10 hombre
	8 mujer
	22 hombre
	25 mujer
	2 hombre
	80 mujer
	99 hombre
	6 mujer
	89 mujer
	19 hombre
	27 hombre
	59 hombre
	20 mujer
	19 hombre
	10 hombre
	9 mujer
	90 mujer
	10 hombre
	8 mujer
	22 hombre
	25 mujer
	29 hombre
	87 mujer
	99 hombre
	64 mujer
	89 mujer
	19 hombre
	47 hombre
	50 hombre
	20 mujer
	19 hombre
	11 hombre
	4 mujer
	91 mujer
	10 hombre
	8 mujer
	23 hombre
	25 mujer
	29 hombre
	80 mujer
	99 hombre
	6 mujer
	89 mujer
	19 hombre
	25 hombre

*/
