package poo_pintura;

public class Piramide {
	//FORMA CORRETA DE FAZER
	//metodos seriam as variaveis, para recalcular no get
	//atributos apenas ab e h.
	//triangulo interno
	private double altura_tri_interno;
	private double metadebase_tri_interno;
	//Pintura
	private double preco_tinta;
	//
	private final double RENDIMENTO=4.76f;
	private final double LITROS_LATA=18;
	
	Piramide(double ab,double h,double preco_tinta){
		this.altura_tri_interno = h;
		this.metadebase_tri_interno = ab;
		this.preco_tinta = preco_tinta;
	}
	
	public double litros() {
		return area_total_piramide()/RENDIMENTO;
	}
	
	public double latas() {
		 return Math.ceil(litros()/LITROS_LATA);
	}
	
	public double preco_total() {
		return (latas()*preco_tinta);
	}
	
	public double base_tri_interno() {
		return metadebase_tri_interno*2;
	}
	
	public double hipotenusa() {
		double value = Math.pow(base_tri_interno(),2)+Math.pow(altura_tri_interno,2);
		return Math.sqrt(value);
	}
	
	public double area_triangulo_lado() {
		return ((base_tri_interno()*hipotenusa())/2);
	}
	
	public double area_piramide_lado() {
		return area_triangulo_lado()*4;
	}
	
	public double area_base_piramide() {
		return base_tri_interno()*base_tri_interno();
	}
	
	public double area_total_piramide() {
		return ((area_piramide_lado())+area_base_piramide());
	}
	
	public double getAltura_tri_interno() {
		return altura_tri_interno;
	}
	
	public double getPreco_tinta() {
		return preco_tinta;
	}

	public void setPreco_tinta(double preco_tinta) {
		this.preco_tinta = preco_tinta;
	}

	@Override
	public String toString() {
		return "Piramide [altura_tri_interno=" + altura_tri_interno + ", metadebase_tri_interno="
				+ metadebase_tri_interno + ", preco_tinta=" + preco_tinta + ", RENDIMENTO=" + RENDIMENTO
				+ ", LITROS_LATA=" + LITROS_LATA + ", litros()=" + litros() + ", latas()=" + latas()
				+ ", preco_total()=" + preco_total() + ", base_tri_interno()=" + base_tri_interno() + ", hipotenusa()="
				+ hipotenusa() + ", area_triangulo_lado()=" + area_triangulo_lado() + ", area_piramide_lado()="
				+ area_piramide_lado() + ", area_base_piramide()=" + area_base_piramide() + ", area_total_piramide()="
				+ area_total_piramide() + "]";
	}
	
	
}
