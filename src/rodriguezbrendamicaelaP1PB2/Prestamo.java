package rodriguezbrendamicaelaP1PB2;

public class Prestamo {
	
	private Alumno alumno;
	private Integer id;
	private Libro libro;
	
	public Prestamo(Integer id, Alumno alumno, Libro libro) {
		this.id = id;
		this.alumno = alumno;
		this.libro = libro;
	}

	public void devolver() {
		libro.setEstaDisponible(Boolean.TRUE);
		
	}

	
	
	

}
