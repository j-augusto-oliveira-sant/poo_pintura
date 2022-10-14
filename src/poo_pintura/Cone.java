package poo_pintura;

public class Cone {
	private double raio;
	private double altura;
	private double geratriz;
	private double area_fundo_circulo;
	private double area_total;
	//
	private double litros;
	private double latas;
	private double RENDIMENTO=3.45;
	
	Cone(double raio, double altura){
		this.raio = raio;
		this.altura = altura;
		this.geratriz = Math.sqrt(Math.pow(altura, 2)+Math.pow(raio, 2));
		this.area_fundo_circulo = Math.PI*(Math.pow(raio,2));
		this.area_total = Math.PI*raio*(raio+geratriz);
		this.litros = area_total/RENDIMENTO;
		this.latas = Math.ceil(litros/18);
	}
	
	public double calcular_preco(double valor_tipo){
		return latas*valor_tipo;
	}
	
	@Override
	public String toString() {
		return "Raio: " + raio + "\nAltura: " + altura + "\ngeratriz: " + geratriz + "\nArea Fundo: "
				+ area_fundo_circulo + "\nArea Total: " + area_total + "\nlitros: " + litros + "\nlatas: " + latas
				+ "\nRendimento: " + RENDIMENTO;
	}

	public double getRaio() {
		return raio;
	}

	public double getAltura() {
		return altura;
	}

	public double getGeratriz() {
		return geratriz;
	}

	public double getArea_fundo_circulo() {
		return area_fundo_circulo;
	}

	public double getArea_total() {
		return area_total;
	}

	public double getLitros() {
		return litros;
	}

	public double getLatas() {
		return latas;
	}

	public double getRENDIMENTO() {
		return RENDIMENTO;
	}

	
}
