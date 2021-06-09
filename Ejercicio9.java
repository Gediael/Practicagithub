import java.util.Scanner;
public class Ejercicio9{
	public static void main(String[] args){
	Scanner entrada = new Scanner(System.in);
		String A,B,C;
		System.out.println("Ingrese una palabra");
		A = entrada.nextLine();
		System.out.println("Ingrese otra palabra");
		B= entrada.nextLine();
				System.out.println("La primera palabra es: "+ A );
                System.out.println("La segunda palabra es: "+B);
                C=A;
				A= B;
				System.out.println("La primera palabra es ahora: "+ A );
                System.out.println("La segunda palabra es ahora: "+ C);
	
	}
}