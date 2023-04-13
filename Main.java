package Builder;

public class Main {
	public static void main(String[]args) {
		System.out.println("Hola");
		
		Book book =new BookBuilder().setTitulo("El Poder De Los Lambdas").setIsbn("974-84-9916-901-9").setAutor("Walter Cueva").setFechaPublicacion("30/01/1990").setNumeroPaginas("777 paginas").build();
		
		Plant plant=new PLantBuilder().setId(5).setAge(13).setSize(10).setClimate("Tropical").setScientificName("Solanum").setColor("Verde Oscuro").setlighPreference("Baja cantidad de agua").build();
	}

}
