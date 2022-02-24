package _01_Objetos;

/**
 * Declaramos la clase suma.
 *
 * @author Adri�n
 * @version 1.0
 */

public class Suma {

	private double r1;
	private int r2;
	private double r3;
	private int va;
	
	/**
	* M�todo que realiza la suma de dos n�meros reales.
	* 
	* @param n1  N�mero real.
	* @param n2  N�mero real.
	* @return r Resulado de la suma de dos n�meros reales.
	*/
	
	public double DosNumReales(double n1, double n2) {
		r1 = n1+n2;
		return r1;
	}
	
	/**
	* M�todo que realiza la suma de dos n�meros enteros.
	* 
	* @param n1  N�mero entero.
	* @param n2  N�mero entero.
	* @return r Resultado de la suma de dos n�meros enteros.
	*/
	
	public int DosNumEnteros(int n1, int n2) {
		r2 = n1+n2;
		return r2;
	}
	
	
	/**
	* M�todo que realiza la suma de tres n�meros reales.
	* 
	* @param n1  N�mero real.
	* @param n2  N�mero real.
	* @param n3  N�mero real.
	* @return r Resultado de la suma de tres n�meros reales.
	*/
	
	public double TresNumReales(double n1, double n2, double n3) {
		r3 = n1+n2+n3;
		return r3;
	}
	
	
	/**
	* M�todo que al nosotros introducir una n�mero este ser� sumado a un valor acumulado.
	* 
	* @param n1 N�mero entero.
	* @param va Valor acumulado
	* @return va El valor aumulado de todos los n�meros que hayamos introducido.
	*/
	
	public int ValorAcumulado(int n1) {
		va = va+n1;
		return va;
	}
}