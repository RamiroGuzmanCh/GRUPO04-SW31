package Builder;

public class BookBuilder {
	private String titulo;
	private String isbn;
	private String autor;
	private String fechaPublicacion;
	private String numeroPaginas;
	
	
	public BookBuilder setTitulo(String titulo) {
		this.titulo=titulo;
		return this;
	}
	
	public BookBuilder setIsbn(String isbn) {
		this.isbn=isbn;
		return this;
	}
	
	public BookBuilder setAutor(String autor) {
		this.autor=autor;
		return this;
	}
	
	public BookBuilder setFechaPublicacion(String fechaPublicacion) {
		this.fechaPublicacion=fechaPublicacion;
		return this;
	}
	
	public BookBuilder setNumeroPaginas(String numeroPaginas) {
		this.numeroPaginas=numeroPaginas;
		return this;
	}
	
	public Book build() {
		Book book=new Book();
		
		book.setTitulo(this.titulo);
		book.setIsbn(this.isbn);
		book.setAutor(this.autor);
		book.setFechaPublicacion(this.fechaPublicacion);
		book.setNumeroPaginas(this.numeroPaginas);
		
		return book;
		
	}

}
