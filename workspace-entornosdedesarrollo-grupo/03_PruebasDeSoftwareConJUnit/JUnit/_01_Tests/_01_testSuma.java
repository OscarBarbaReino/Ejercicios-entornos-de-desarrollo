package _01_Tests;

import static org.junit.jupiter.api.Assertions.*;

import _01_Objetos.Suma;

import org.junit.jupiter.api.Test;

/*
 * author Oscar
 * 
 */

class _01_testSuma {

	@Test
     void test() {
		
	}
	
	@Test
	
	// Test calculo dos numeros reales
	
	 public void testDosNumReales() {
		
		double resultadoEsperado = 4.6;
		double resultadoObtenido = Suma.DosNumReales(2.5,2.1);
		
		assertEquals(resultadoEsperado,resultadoObtenido);
		
		
		
	}
	
	@Test
     public void testDosNumEnteros() {
		
		int resultadoEsperado = 5;
		int resultadoObtenido = Suma.DosNumEnteros(2,3);
		
		assertEquals(resultadoEsperado,resultadoObtenido) ;
	}
		
		
	@Test
	   public void testTresNumReales() {
		
			double resultadoEsperado = 8.3;
			double resultadoObtenido = Suma.TresNumReales(2.1,3.1,3.1);
			
			assertEquals(resultadoEsperado,resultadoObtenido) ;
		}
	
	
	@Test
	  public void testValorAcumulado() {
		
		int resultadoEsperado = 1;
		int resultadoObtenido = Suma.ValorAcumulado(1);
		
		assertEquals(resultadoEsperado,resultadoObtenido) ;
	}

}
