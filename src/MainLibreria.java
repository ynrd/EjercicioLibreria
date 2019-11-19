import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Scanner;

public class MainLibreria {

	public static void main(String[] args) {
		// VARIABLES
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		ArrayList<Libro> listaLibros = new ArrayList<Libro>();
		Libreria libreria = new Libreria();
		libreria.setListaLibros(listaLibros);
		String nopcion = " ";

		// PROGRAMA
		do {
			mostrarMenu();
			opcion = leerOp();

			if (opcion == 1) {
				System.out.println("Ha escogido dar de alta un nuevo libro.");
				System.out.println("Introduzca un título: ");
				String titulo = leerDato();
				System.out.println("Introduzca un ISBN: ");
				String isbn = leerDato();
				System.out.println("Introduzca la editorial: ");
				String editorial = leerDato();
				System.out.println("Introduzca el nombre del autor: ");
				String nombre = leerDato();
				System.out.println("Introduzca apellidos del autor: ");
				String apellidos = leerDato();
				System.out.println("Introduzca fecha de nacimiento del autor");
				String fecha = leerDato();

				Autor autor = new Autor(nombre, apellidos, fecha);

				Libro libro = new Libro(titulo, isbn, editorial, autor);
				listaLibros.add(libro);
			}

			else if (opcion == 2) {
				System.out.println("Los libros que tiene son: ");
				recorrerArray(listaLibros);
			}

			else if (opcion == 3) {
				System.out.println("Ha escogido buscar un libro por ISBN ");
				System.out.println("Introduzca un ISBN a buscar: ");
				String isbn = leerDato();
				Libro libro = libreria.buscarIsbn(isbn);
				System.out.println(libro);
			}

			else if (opcion == 4) {
				System.out.println("Introduzca una editorial para buscar un libro: ");
				String editorial = sc.nextLine();
				ArrayList listaLibrosEditorial = libreria.busquedaEditorial(editorial);
				recorrerArray(listaLibrosEditorial);
			}

			else if (opcion == 5) {
				System.out.println("Introduzca un nombre de autor: ");
				String nombre = sc.nextLine();
				ArrayList<Autor> listaAutores = libreria.busquedaAutores(nombre);
				System.out.println(listaAutores);
			}

		} while (opcion != 0);

	}

	public static void mostrarMenu() {
		System.out.println("Escoja una opción: ");
		System.out.println("1. Alta de un libro");
		System.out.println("2. Listar libros");
		System.out.println("3. Buscar por ISBN ");
		System.out.println("4. Buscar por editorial");
		System.out.println("5. Búsqueda de autores por nombre");
		System.out.println("0. Salir del programa");
	}


	public static int leerOp () {
		Scanner sc = new Scanner (System.in);
		String nopcion = sc.nextLine();
		int opcion = 0;
		try {
			opcion = Integer.parseInt(nopcion);
		} catch ( NumberFormatException e) {
			System.out.println("Sólo se admiten números");
	}
		return opcion;		
	}

	public static String leerDato() {
		Scanner sc = new Scanner(System.in);
		String dato = sc.nextLine();
		return dato;
	}

	public static void recorrerArray(ArrayList<Libro> listaLibros) {
		int i = 0;
		for (Libro valor : listaLibros) {
			mostrarArray(valor, i);
			i++;
		}
	}

	public static void mostrarArray(Libro valor, int i) {
		System.out.println("El título del libro es: " + valor.getTitulo());
		System.out.println("El ISBN del libro es: " + valor.getIsbn());
		System.out.println("La editorial del libro es: " + valor.getEditorial());
		System.out.println("El autor de un libro es: " + valor.getAutor());

	}

}
