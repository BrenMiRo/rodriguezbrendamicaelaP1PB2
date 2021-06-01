package rodriguezbrendamicaelaP1PB2;

public class Libro {
	private Integer codigo;
	private String nombre;
	private String autor;
	private Boolean estaDisponible;
	
	
	public Libro (Integer codigo,String nombre,String autor) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.autor = autor;
		
	}
	
	public void prestar() {
		estaDisponible = Boolean.FALSE;
	}

	public Boolean getEstaDisponible() {
		return estaDisponible;
	}


}
