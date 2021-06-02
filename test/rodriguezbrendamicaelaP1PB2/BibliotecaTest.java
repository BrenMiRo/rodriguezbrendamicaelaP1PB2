package rodriguezbrendamicaelaP1PB2;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class BibliotecaTest {

	@Test
	public void DadoUnLibroDeGeografiaPuedeImprimir() {
		LibroGeografia libroG = new LibroGeografia(123, "sgfdg", "sdf");
		
		String impresion = libroG.imprimir();
				
		Assert.assertEquals("Se esta imprimiendo libro de geografia", impresion);
		
	}
	
	@Test
	public void DadoUnLibroDeHistoriaPuedeImprimir() {
		LibroHistoria libroH = new LibroHistoria(123, "sgfdg", "sdf");
		
		String impresion = libroH.imprimir();
				
		Assert.assertEquals("Se esta imprimiendo libro de historia", impresion);
		
	}
	
	
	@Test
	public void DadoUnLibroCuandoSePrestaNoEstaDisponible() {
		LibroMatematica libroM = new LibroMatematica(123, "sgfdg", "sdf");
		
		libroM.prestar();
		
		Assert.assertEquals(Boolean.FALSE, libroM.getEstaDisponible());
		
	}
	
	@Test
	public void AlDevolverUnLibroEstaDisponible() {
		LibroHistoria libroH = new LibroHistoria(123, "sgfdg", "sdf");
		Alumno alumno1 = new Alumno(123,"sdfd","dfgdf");
		Prestamo prestamo1 = new Prestamo(123,alumno1,libroH);
		
		prestamo1.devolver();
		
		Assert.assertEquals(Boolean.TRUE, libroH.getEstaDisponible());
	}
	
	
	
	
	
	
	
	

}
