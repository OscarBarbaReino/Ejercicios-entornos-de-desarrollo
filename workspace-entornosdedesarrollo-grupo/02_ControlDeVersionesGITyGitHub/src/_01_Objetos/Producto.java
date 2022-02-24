package _01_Objetos;

/**
 * Declaramos la clase producto.
 *
 * @author Marcos
 * @version 1.0
 */

public class Producto {

	/**
	 * Este metodo calcula el producto de 2 numeros enteros
	 * 
	 * @param numero1 este el valor del numero 1
	 * @param numero2 este el valor del numero 2
	 * @return devolvemos el valor del atributo que almacena el resultado
	 */
	public int calProductoEnteros(int numero1, int numero2) {

		return numero1 * numero2;
	}

	/**
	 * Este metodo calculo el producto de 2 numeros reales
	 * 
	 * @param numero1 este el valor del numero 1
	 * @param numero2 este el valor del numero 2
	 * @return devolvemos el valor del atributo que almacena el resultado
	 */
	public double calProductoReal(double numero1, double numero2) {

		return numero1 * numero2;
	}

	/**
	 * Metodo por el que hacemos el producto de 3 numeros Reales
	 * 
	 * @param numero1 es el valor del numero 1
	 * @param numero2 es el valor del numero 2
	 * @param numero3 es el valor del numero 3
	 * @return devolvemos el valor del atributo que almacena el resultado
	 */
	public double calProductoNum3(double numero1, double numero2, double numero3) {

		return numero1 * numero2 * numero3;
	}

	/**
	 * Este metodo calcula la Potencia, tendrá dos parámetro de entrada (base y
	 * exponente) y uno de salida que será la solución
	 * 
	 * @param numero1   es la base de la operacion
	 * @param exponente es el exponetente de la operacion
	 * @return devolvemos el valor del atributo que almacena el resultado
	 */
	public double calProductoBexponente(int numero1, int exponente) {

		return Math.pow(numero1, exponente);
	}
}