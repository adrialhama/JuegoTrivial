import java.util.Scanner;

import javax.swing.JOptionPane;

public class EjercicioTrivial {

	public static void main(String[] args) {
		// Variables
		int num, puntos = 10, total = 0, acierto = 0, fallo = 0;

		// Declaro una entrada de datos
		Scanner sc = new Scanner(System.in);

		// Mensaje de Bienvenida
		System.out
				.println("  ____  _                           _     _                 _______   _       _       _ \r\n"
						+ " |  _ \\(_)                         (_)   | |               |__   __| (_)     (_)     | |\r\n"
						+ " | |_) |_  ___ _ ____   _____ _ __  _  __| | ___     __ _     | |_ __ ___   ___  __ _| |\r\n"
						+ " |  _ <| |/ _ \\ '_ \\ \\ / / _ \\ '_ \\| |/ _` |/ _ \\   / _` |    | | '__| \\ \\ / / |/ _` | |\r\n"
						+ " | |_) | |  __/ | | \\ V /  __/ | | | | (_| | (_) | | (_| |    | | |  | |\\ V /| | (_| | |\r\n"
						+ " |____/|_|\\___|_| |_|\\_/ \\___|_| |_|_|\\__,_|\\___/   \\__,_|    |_|_|  |_| \\_/ |_|\\__,_|_|\r\n"
						+ "                                                                                        \r\n"
						+ "                                                                                        "
						+ "\nGeografía");

		// Se mostrará en pantalla la pregunta y la opciones se elegiran con un switch

		// Primera Pregunta
		System.out.println("1º ¿Cuál es la parte más profunda de la corteza terrestre?" + "\n1. La Antártida"
				+ "\n2. La fosa de las Marianas" + "\n3. Himalaya" + "\n4. El Lago Ness ");

		num = sc.nextInt();

		switch (num) {
		/*
		 * la variable total recogerá la suma o resta de las preguntas acertadas. Y las
		 * variables acierto y fallo, el número de respuestas acertadas y falladas
		 */
		case 1:
			System.out.println("La respuesta es Incorrecta");
			total -= puntos;
			fallo++;
			break;
		case 2:
			System.out.println("La respuesta es Correcta");
			total += puntos;
			acierto++;
			break;
		case 3:
			System.out.println("La respuesta es Incorrecta");
			total -= puntos;
			fallo++;
			break;
		case 4:
			System.out.println("La respuesta es Incorrecta");
			total -= puntos;
			fallo++;
			break;

		default:
			System.out.println("La opción introducida no es correcta, por favor inserte un número entre 1 - 4");
		}

		// Segunda Pregunta
		System.out.println("2º ¿Cuál es la capital de Marruecos?" + "\n1. Mauritania"
				+ "\n2. Ceuta" + "\n3. Barcelona" + "\n4. Rabat");

		num = sc.nextInt();

		switch (num) {
		
		case 1:
			System.out.println("La respuesta es Incorrecta");
			total -= puntos;
			fallo++;
			break;
		case 2:
			System.out.println("La respuesta es Incorrecta");
			total -= puntos;
			fallo++;
			break;
		case 3:
			System.out.println("La respuesta es Incorrecta");
			total -= puntos;
			fallo++;
			break;
		case 4:
			
			System.out.println("La respuesta es Correcta");
			total += puntos;
			acierto++;
			break;

		default:
			System.out.println("La opción introducida no es correcta, por favor inserte un número entre 1 - 4");
		}

		// Mensaje final total de puntos
		System.out.println("El total de puntos es: " + total + ". El número de respuestas acertadas: " + acierto
				+ ". El número de fallos: " + fallo);

	}

}
