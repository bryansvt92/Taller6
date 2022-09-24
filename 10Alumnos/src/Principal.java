import java.util.Scanner;

public class Principal {

	
	//Nombre de los alumnos
			static String[] nombres = new String[10];
			static int indiceDeAlumnoConMayorNota=0;
			//Matriz con las 3 notas de los 5 alumnos
			static double[] notas = new double[10];
			
			static double notaMayor;
	
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		//Registramos 10 alumnos
				for (int i = 0; i < 10; i++) {
					System.out.println("Ingrese el Nombre del Alumno # " + (i+1));
					nombres[i] = teclado.nextLine();
					
					System.out.print("Ingrese la Nota del Alumno # " + (i+1));
					notas[i] = Double.parseDouble(teclado.nextLine());
					
			
				}
				
				
				
			    for (int i=0;i<notas.length;i++ ) {
			        if(notaMayor<notas[i]){
			           notaMayor=notas[i];
			           indiceDeAlumnoConMayorNota=(i+1);
			        }
			     }

			System.out.println("El alumno #"+indiceDeAlumnoConMayorNota+" con nota "+notaMayor+" es el que tiene la nota mas alta");
		
		
	}
}

