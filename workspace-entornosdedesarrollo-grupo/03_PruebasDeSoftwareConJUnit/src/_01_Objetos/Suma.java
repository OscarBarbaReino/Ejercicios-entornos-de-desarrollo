package _01_Objetos;

/**
 * Declaramos la clase suma.
 *
 * @author Adrián
 * @version 1.0
 */

public class Suma {


	
	/**
	* Método que realiza la suma de dos números reales.
	* 
	* @param n1  Número real.
	* @param n2  Número real.
	* @return n1+n2 Resulado de la suma de dos números reales.
	*/
	
	public static double DosNumReales(double n1, double n2) {
		
		return n1+n2;
	}
	
	/**
	* Método que realiza la suma de dos números enteros.
	* 
	* @param n1  Número entero.
	* @param n2  Número entero.
	* @return n1+n2 Resultado de la suma de dos números enteros.
	*/
	
	public static int DosNumEnteros(int n1, int n2) {
		
		return n1+n2;
	}
	
	
	/**
	* Método que realiza la suma de tres números reales.
	* 
	* @param n1  Número real.
	* @param n2  Número real.
	* @param n3  Número real.
	* @return n1+n2+n3 Resultado de la suma de tres números reales.
	*/
	
	public static double TresNumReales(double n1, double n2, double n3) {
		
		return n1+n2+n3;
	}
	
	
	/**
	* Método que al nosotros introducir una número este será sumado a un valor acumulado.
	* 
	* @param n1 Número entero.
	* @param va Valor acumulado
	* @return va El valor aumulado de todos los números que hayamos introducido.
	*/
	
	public static int ValorAcumulado(int n1) {
	    int va = 0;
		va = va+n1;
		
		return va;
	}
}