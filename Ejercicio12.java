import java.util.Scanner;
public class Ejercicio12{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		double temperaturaCelcius, tFaherenheint;
		System.out.println("Ingrese la temperatura en grados Celcius");
		temperaturaCelcius = entrada.nextDouble();
		tFaherenheint = temperaturaCelcius*9/5 +32;
		System.out.println("La temperatura en Grados Faherenheint es: "+ tFaherenheint);
	}

}