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
		System.out.println("\n1º ¿Cuál es la parte más profunda de la corteza terrestre?" + "\n1. La Antártida"
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
		System.out.println("\n2º ¿Cuál es la capital de Marruecos?" + "\n1. Mauritania" + "\n2. Ceuta"
				+ "\n3. Barcelona" + "\n4. Rabat");

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

		// Tercera Pregunta
		System.out.println("\n3º ¿En qué país se encuentra el río Po?" + "\n1. Italia" + "\n2. España" + "\n3. EEUU"
				+ "\n4. China");

		num = sc.nextInt();

		switch (num) {

		case 1:
			System.out.println("La respuesta es Correcta");
			total += puntos;
			acierto++;
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
			System.out.println("La respuesta es Incorrecta");
			total -= puntos;
			fallo++;
			break;

		default:
			System.out.println("La opción introducida no es correcta, por favor inserte un número entre 1 - 4");
		}

		// Cuarta Pregunta
		System.out.println("\n4º ¿Cuál es el país más visitado del mundo?" + "\n1. China" + "\n2. México"
				+ "\n3. Francia" + "\n4. Inglaterra");

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
			System.out.println("La respuesta es Correcta");
			total += puntos;
			acierto++;
			break;

		case 4:
			System.out.println("La respuesta es Incorrecta");
			total -= puntos;
			fallo++;
			break;

		default:
			System.out.println("La opción introducida no es correcta, por favor inserte un número entre 1 - 4");
		}

		// Quinta Pregunta
		System.out.println("\n5º ¿En qué países es oficial el quechua es lengua oficial nacional?" + "\n1. Argentina"
				+ "\n2. Perú" + "\n3. Polonia" + "\n4. Vietnam");

		num = sc.nextInt();

		switch (num) {

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

		// Sexta Pregunta
		System.out.println("\n6º ¿En qué país se encuentra la península de Yucatán?" + "\n1. México" + "\n2. Chile"
				+ "\n3. Japón" + "\n4. China");

		num = sc.nextInt();

		switch (num) {

		case 1:
			System.out.println("La respuesta es Correcta");
			total += puntos;
			acierto++;
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
			System.out.println("La respuesta es Incorrecta");
			total -= puntos;
			fallo++;
			break;

		default:
			System.out.println("La opción introducida no es correcta, por favor inserte un número entre 1 - 4");
		}

		// Séptima Pregunta
		System.out.println("\n7º ¿Cuál es el océano que baña las aguas de Sri Lanka?" + "\n1. Índico" + "\n2. Pacífico "
				+ "\n3. Atlántico" + "\n4. Ártico");

		num = sc.nextInt();

		switch (num) {

		case 1:
			System.out.println("La respuesta es Correcta");
			total += puntos;
			acierto++;
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
			System.out.println("La respuesta es Incorrecta");
			total -= puntos;
			fallo++;
			break;

		default:
			System.out.println("La opción introducida no es correcta, por favor inserte un número entre 1 - 4");
		}

		// Octava Pregunta
		System.out.println("\n8º ¿Cuál es la montaña más alta del mundo?" + "\n1. Pirineos" + "\n2. Mont Blanc"
				+ "\n3. Kilimanjaro" + "\n4. Everest");

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

		// Novena Pregunta
		System.out.println("\n9º ¿Qué nombre recibe un cowboy argentino?" + "\n1. Boludo" + "\n2. Pibe" + "\n3. Gaucho"
				+ "\n4. Caballista");

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
			System.out.println("La respuesta es Correcta");
			total += puntos;
			acierto++;
			break;

		case 4:
			System.out.println("La respuesta es Incorrecta");
			total -= puntos;
			fallo++;
			break;

		default:
			System.out.println("La opción introducida no es correcta, por favor inserte un número entre 1 - 4");
		}

		// Décima Pregunta
		System.out.println("\n10º ¿A qué dos continentes se debe la existencia del vudú?" + "\n1. África y Europa"
				+ "\n2. América y Asia" + "\n3. África y América" + "\n4. Europa y Asia");

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
			System.out.println("La respuesta es Correcta");
			total += puntos;
			acierto++;
			break;

		case 4:
			System.out.println("La respuesta es Incorrecta");
			total -= puntos;
			fallo++;
			break;

		default:
			System.out.println("La opción introducida no es correcta, por favor inserte un número entre 1 - 4");
		}
		// Mensaje final total de puntos
		System.out.println("El total de puntos es: " + total + ". El número de respuestas acertadas: " + acierto
				+ ". El número de fallos: " + fallo);
		if (total == 70) {
			System.out.println("\nEnhorabuena has obtenido el Logro en Geografía");
		} else {
			System.out.println("Lástima, no has alcanzado los 70 puntos. Inténtalo de nuevo");
		}

	}

}
