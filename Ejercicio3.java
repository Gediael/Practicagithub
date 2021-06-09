import java.util.Scanner;
pulbic class Ejercicio3{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int num1,doble,triple;
		System.out.println("Ingrese un numero");
		num1 = entrada.nextInt();
		doble = 2*num1;
		System.out.println("El doble del numero es " +doble);
		triple =3*num1;
		System.out.println("EL triple del numero es "+triple);

	}
}