
public class Libro {
	private String titulo;
	private String isbn;
	private String editorial;
	private Autor autor;
	
	
	public Libro(String titulo, String isbn, String editorial, Autor autor) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.editorial = editorial;
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", isbn=" + isbn + ", editorial=" + editorial + ", autor=" + autor + "]";
	}

}
