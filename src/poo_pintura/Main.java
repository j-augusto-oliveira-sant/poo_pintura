package poo_pintura;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.Piramide 2.Cubo 3.Cone :");
		int choice = scan.nextInt();
		if (choice==1) {
			ex1();
		} else if (choice==2) {
			ex2();
		} else {
			ex3();
		}
		scan.close();
	}
	public static void ex1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("--PIRAMIDE--");
		System.out.println("ab:");
		double ab = scan.nextDouble();
		System.out.println("h");
		double h = scan.nextDouble();
		Piramide piramide = new Piramide(ab,h);
		System.out.println("Tipo de tinta 1,2,3:");
		int tinta = scan.nextInt();
		double preco_tinta = 0;
		if (tinta==1) {
			preco_tinta = 127.90f;
		} else if (tinta==2) {
			preco_tinta = 258.98f;
		} else {
			preco_tinta = 344.34f;
		}
		piramide.setPreco_tinta(preco_tinta);
		System.out.println("Area Triangulo: "+piramide.getArea_triangulo_lado());
		System.out.println("Area Base: "+piramide.getArea_base_piramide());
		System.out.println("Area Total: "+piramide.getArea_total_piramide());
		System.out.println("Tipo de tinta: "+tinta);
		System.out.println("Litros: "+piramide.getLitros());
		System.out.println("Latas: "+piramide.getLatas());
		System.out.println("Preço: "+piramide.getPreco_total());
		System.out.println("Volume: "+piramide.getVolume_piramide());
		scan.close();
	}
	public static void ex2() throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("--CUBO--");
		Cubo cubo = new Cubo(4);
		cubo.setTipo(1);
		cubo.setRendimento(2);
		//
		System.out.println(cubo);
		scan.close();
	}	
	public static void ex3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("--CONE--");
		double altura = 9;
		double raio= 3.5;
		double tipo = 467.98f;
		Cone cone = new Cone(raio,altura);
		System.out.println(cone);
		System.out.println("Preço: "+cone.calcular_preco(tipo));
		scan.close();
	}
}
