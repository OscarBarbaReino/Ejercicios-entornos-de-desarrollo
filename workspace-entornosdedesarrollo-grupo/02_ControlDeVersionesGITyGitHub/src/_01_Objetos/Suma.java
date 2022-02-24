package _01_Objetos;

/**
 * Declaramos la clase suma.
 *
 * @author Adrián
 * @version 1.0
 */

public class Suma {

	private double r1;
	private int r2;
	private double r3;
	private int va;
	
	/**
	* Método que realiza la suma de dos números reales.
	* 
	* @param n1  Número real.
	* @param n2  Número real.
	* @return r Resulado de la suma de dos números reales.
	*/
	
	public double DosNumReales(double n1, double n2) {
		r1 = n1+n2;
		return r1;
	}
	
	/**
	* Método que realiza la suma de dos números enteros.
	* 
	* @param n1  Número entero.
	* @param n2  Número entero.
	* @return r Resultado de la suma de dos números enteros.
	*/
	
	public int DosNumEnteros(int n1, int n2) {
		r2 = n1+n2;
		return r2;
	}
	
	
	/**
	* Método que realiza la suma de tres números reales.
	* 
	* @param n1  Número real.
	* @param n2  Número real.
	* @param n3  Número real.
	* @return r Resultado de la suma de tres números reales.
	*/
	
	public double TresNumReales(double n1, double n2, double n3) {
		r3 = n1+n2+n3;
		return r3;
	}
	
	
	/**
	* Método que al nosotros introducir una número este será sumado a un valor acumulado.
	* 
	* @param n1 Número entero.
	* @param va Valor acumulado
	* @return va El valor aumulado de todos los números que hayamos introducido.
	*/
	
	public int ValorAcumulado(int n1) {
		va = va+n1;
		return va;
	}
}