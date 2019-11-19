import java.util.ArrayList;

public class Libreria {
	private ArrayList <Libro> listaLibros;

	public ArrayList<Libro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(ArrayList<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}

	@Override
	public String toString() {
		return "Libreria [listaLibros=" + listaLibros + "]";
	}
	
	public Libro buscarIsbn (String isbn)	{
			for (Libro l : getListaLibros() ) {
			if (l.getIsbn().equalsIgnoreCase(isbn)) {			
			return l;
			}
		}
			return null;
	}
	
	public ArrayList <Libro> busquedaEditorial (String editorial){
		ArrayList <Libro> listaLibrosEditorial = new ArrayList <Libro> ();
		for (Libro l :listaLibros) {
			if (l.getEditorial().equalsIgnoreCase(editorial)) {
				listaLibrosEditorial.add(l);				
			}
		}
		return listaLibrosEditorial;
	}
	
	public ArrayList<Autor> busquedaAutores (String nombre) {
		ArrayList <Autor> listaAutores = new ArrayList <Autor> ();
		for (Libro l : listaLibros) {
			if (l.getAutor().getNombre().equalsIgnoreCase(nombre)) {
				listaAutores.add(l.getAutor());
			}
		}
		return listaAutores;
	}
}


