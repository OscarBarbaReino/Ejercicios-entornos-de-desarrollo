package _01_Objetos;

/**
 * Declaramos la clase suma.
 *
 * @author Adri�n
 * @version 1.0
 */

public class Suma {


	
	/**
	* M�todo que realiza la suma de dos n�meros reales.
	* 
	* @param n1  N�mero real.
	* @param n2  N�mero real.
	* @return n1+n2 Resulado de la suma de dos n�meros reales.
	*/
	
	public static double DosNumReales(double n1, double n2) {
		
		return n1+n2;
	}
	
	/**
	* M�todo que realiza la suma de dos n�meros enteros.
	* 
	* @param n1  N�mero entero.
	* @param n2  N�mero entero.
	* @return n1+n2 Resultado de la suma de dos n�meros enteros.
	*/
	
	public static int DosNumEnteros(int n1, int n2) {
		
		return n1+n2;
	}
	
	
	/**
	* M�todo que realiza la suma de tres n�meros reales.
	* 
	* @param n1  N�mero real.
	* @param n2  N�mero real.
	* @param n3  N�mero real.
	* @return n1+n2+n3 Resultado de la suma de tres n�meros reales.
	*/
	
	public static double TresNumReales(double n1, double n2, double n3) {
		
		return n1+n2+n3;
	}
	
	
	/**
	* M�todo que al nosotros introducir una n�mero este ser� sumado a un valor acumulado.
	* 
	* @param n1 N�mero entero.
	* @param va Valor acumulado
	* @return va El valor aumulado de todos los n�meros que hayamos introducido.
	*/
	
	public static int ValorAcumulado(int n1) {
	    int va = 0;
		va = va+n1;
		
		return va;
	}
}