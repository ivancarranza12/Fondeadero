package ar.edu.unlam.pb2.Fondeadero;

import static org.junit.Assert.*;

import org.junit.Test;

public class FondeaderoTest {

	@Test
	public void test() {
		
		Integer cantidadMaximaAmarras = 70;
		
		Fondeadero fon = new Fondeadero (cantidadMaximaAmarras);
		
		
		assertNotNull(fon);
	}
	
	@Test
	
	public void queSePuedaCrearUnYate() {
		String nombre =  "AZ1";
		String duenio = "Andrés Borgeat";
		Double manga = 18.87;
		Double calado = 5.15;
		Double eslora = 119.0;
		Integer tripulación =37;
		Double peso = 5500.0;
		
		Yate yate = new Yate (nombre,duenio,manga,calado,eslora,tripulación,peso);
		
		
		assertNotNull(yate);
		
		
	}
	@Test 
	public void queSePuedaAgregarUnYateAlFondeadero () {
		
		String nombre =  "AZ1";
		String duenio = "Andrés Borgeat";
		Double manga = 18.87;
		Double calado = 5.15;
		Double eslora = 119.0;
		Integer tripulación =37;
		Double peso = 5500.0;
		
		Yate yate = new Yate (nombre,duenio,manga,calado,eslora,tripulación,peso);
		Fondeadero fon = new Fondeadero (7);
		
		
		fon.agregarYate(yate);
		fon.agregarYate(yate);
		fon.agregarYate(yate);
		fon.desamarrarYate(yate);
		Integer vO = fon.getYatesAmarrados().size();
		Integer v1= fon.getLugaresOcupados();
		Integer vE = 5;
		
		assertEquals(vE,v1);
		
	}
	
	@Test 
	public void queSePuedaObtenerPrecioDeAmarre () {
		
		String nombre =  "AZ1";
		String duenio = "Andrés Borgeat";
		Double manga = 18.87;
		Double calado = 5.15;
		Double eslora = 119.0;
		Integer tripulación =37;
		Double peso = 5500.0;
		
		Yate yate = new Yate (nombre,duenio,manga,calado,eslora,tripulación,peso);
		Fondeadero fon = new Fondeadero (7);
		
		fon.agregarYate(yate);
		Double vO = fon.obtenerPrecioDeAmarre(yate);
		Double vE = 3000.0;
		assertEquals(vE,vO);

	}	
}
