package rodriguezbrendamicaelaP1PB2;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class BibliotecaTest {

	@Test
	public void DadoUnLibroDeGeografiaPuedeImprimir() {
		LibroGeografia libroG = new LibroGeografia(123, "sgfdg", "sdf");
		
		String impresion = libroG.imprimir();
				
		Assert.assertEquals("Se esta imprimiendo libro de geografia", impresion);
		
	}
	
	
	@Test
	public void DadoUnLibroCuandoSePrestaNoEstaDisponible() {
		LibroMatematica libroM = new LibroMatematica(123, "sgfdg", "sdf");
		
		libroM.prestar();
		
		Assert.assertEquals(Boolean.FALSE, libroM.getEstaDisponible());
		
	}
	

}
