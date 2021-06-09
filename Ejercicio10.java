import java.util.Scanner;
public class Ejercicio10{
	public static void main(String[] args){
	Scanner entrada = new Scanner(System.in);
	int base, altura, area,perimetro;
	System.out.println("Ingrese la base del rectangulo");
	base = entrada.nextInt();
	System.out.println("Ingrese la altura del rectangulo");
	altura = entrada.nextInt();
	area= base*altura;
	System.out.println("El area del rectangulo es: " + area);
	perimetro = 2*base+2*altura;
	System.out.println("El perimetro del rectangulo es: " + perimetro);

	}
}