import java.util.Scanner;
public class Ejercicio5{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int numero;
		System.out.println("Ingrese un numero porfavor");
		numero = entrada.nextInt();
		numero++;
		System.out.println("El numero siguiente es: "+numero);
	}
}