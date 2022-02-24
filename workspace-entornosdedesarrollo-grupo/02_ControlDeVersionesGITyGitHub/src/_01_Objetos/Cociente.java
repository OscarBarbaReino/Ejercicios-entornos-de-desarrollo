package _01_Objetos;

/**
 * Declaramos la clase cociente.
 *
 * @author Oscar
 * @version 1.0
 */

public class Cociente {

	 /**
     * Definimos los atributos
     */
    
    private double num3;
    
    
    
    /**
     * Este metodo calcula el cosciente de 2 numeros enteros
     * @param num1 este es el valor del dividendo
     * @param num2 este es el valor del divisor
     * @return devolvemos el valor del atributo que almacena el resultado(num3)
     */
    public int calCociente(int num1, int num2) {
        //TODO
        num3= num1/num2;
        return (int) num3;// retomo el resultado

    }
    /**
     * Este metodo calculo el cosciente de 2 numeros reales
     * @param num1 este el valor del dividendo
     * @param num2 este el valor del divisor
     * @return devolvemos el valor del atributo que almacena el resultado(num3)
     */
    
    public double calCocienteReal(double num1, double num2) {
        //TODO
        num3= num1/num2;
        return num3;// retomo el resultado
    }
    /**
     * Este metodo calculo el inverso de un numero real, teniendo en cuenta que el 0 no tiene inverso
     * con lo cual habria que controlar la excepcion
     * @param num1 el numero en el que calculamos el inverso
     * @return devolvemos el valor del atributo que almacena el resultado(num3)
     * @throws control de la excepcion 
     */
    public static double calCocienteInverso(double num1) throws Exception {
        //TODO
        double num3=0;
        if (num1!= 0){
            num3=1/num1;
        }else{
            throw new Exception();
        }
        return num3;// retomo el resultadoo
    }
    /**
     * Este metodo calculo la raiz de un numero real, basandonos en que no se puede calcular la raiz de un 
     * numero negativo por lo que habria que controlar la excepción
     * @param num1 el numero en el que calculamos la raiz 
     * @return devolvemos el valor del atributo que almacena el resultado (num3)
     */
    public double calCocienteRaiz(double num1) {
        //TODO
        num3=Math.sqrt(num1);
        return num3;// retomo el resultado
    }
    

}
