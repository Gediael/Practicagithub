import java.util.Scanner;
public class Ejercicio2{
	public static void main(String[] args){
	String pais,capital;
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingrese el nombre de un pais");
	pais = entrada.nextLine();
	System.out.println("Ingrese el nombre de la capital del pais");
	capital = entrada.nextLine();
	System.out.println(capital+ " es la capital de " + pais);
	}

}