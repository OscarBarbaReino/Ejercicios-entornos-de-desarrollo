import _01_Objetos.Suma;
import _01_Objetos.Resta;
import _01_Objetos.Producto;
import _01_Objetos.Cociente;

public class Main {

	public static void main(String[] args) {
		
		Suma suma = new Suma();
		Resta resta = new Resta();
		Producto producto = new Producto();
		Cociente cociente = new Cociente();
		
		System.out.println("Resultados de los métodos de la clase suma.");
		System.out.println("-------------------------------------------");
		System.out.println("");
		System.out.println("Resultado de la suma de dos números reales: "+suma.DosNumReales(2.5,2.5));
		System.out.println("Resultado de la suma de dos números enteros: "+suma.DosNumEnteros(7,7));
		System.out.println("Resultado de la suma de tres números reales: "+suma.TresNumReales(2.5,2.5,3.7));
		System.out.println("Resultado del valor acumulado: "+suma.ValorAcumulado(5));
		System.out.println("");
		
		System.out.println("Resultados de los métodos de la clase resta.");
		System.out.println("-------------------------------------------");
		System.out.println("");
		System.out.println("Resultado de la resta de dos números reales: "+resta.calRestarReal(4.5,8.5));
		System.out.println("Resultado de la resta de dos números enteros: "+resta.calRestaEnteros(12,4));
		System.out.println("Resultado de la resta de tres números reales: "+resta.calRestaNumeros2(1.2,8.7,4.4));
		System.out.println("Resultado del valor acumulado: "+resta.calRestaAcumulada(15));
		System.out.println("");
		
		System.out.println("Resultados de los métodos de la clase producto.");
		System.out.println("-------------------------------------------");
		System.out.println("");
		System.out.println("Resultado de la multiplicación de dos números enteros: "+producto.calProductoEnteros(2, 5));
		System.out.println("Resultado de la multiplicación de dos números reales: "+producto.calProductoReal(3.5, 5.5));
		System.out.println("Resultado de la multiplicación de tres números reales: "+producto.calProductoNum3(5.5, 8.5, 9.5));
		System.out.println("Resultado del cálculo de la poténcia: "+producto.calProductoBexponente(5, 5));
		System.out.println("");
		
		System.out.println("Resultados de los métodos de la clase cociente.");
		System.out.println("-------------------------------------------");
		System.out.println("");
        System.out.println("El valor de la division es "+cociente.calCociente(10,2));
        System.out.println("El valor de la division es "+cociente.calCocienteReal(5.1,3.5));
        try {
            System.out.println("El valor del inverso es "+cociente.calCocienteInverso(0)); 
        } catch(Exception ex){
            System.out.println("El numero 0 no tiene inverso"); 
        }
        System.out.println("El valor de la raiz es "+cociente.calCocienteRaiz(9));
	}
}
