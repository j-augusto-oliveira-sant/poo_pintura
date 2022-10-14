package poo_pintura;

public class Piramide {
	//triangulo interno
	private double altura_tri_interno;
	private double metadebase_tri_interno;
	private double hipotenusa_tri_interno;
	private double base_tri_interno;
	//Piramide
	private double area_triangulo_lado;
	private double area_piramide_lado;
	private double area_base_piramide;
	private double area_total_piramide;
	private double volume_piramide;

	//Pintura
	private double preco_tinta;
	private double latas;
	private double litros;
	private double preco_total;
	
	Piramide(double ab,double h){
		altura_tri_interno = h;
		metadebase_tri_interno = ab;
		setHipotenusa_tri_interno(altura_tri_interno, metadebase_tri_interno);
		base_tri_interno = ab*2;
		area_triangulo_lado = ((base_tri_interno*hipotenusa_tri_interno)/2);
		area_piramide_lado = area_triangulo_lado*4;
		area_base_piramide = base_tri_interno*base_tri_interno;
		area_total_piramide = ((area_piramide_lado)+area_base_piramide);
		setVolume_piramide();
		//pintura
		litros = area_total_piramide/4.76;
		latas = Math.ceil(litros/18);
	}
	
	public double getHipotenusa_tri_interno() {
		return hipotenusa_tri_interno;
	}
	private void setHipotenusa_tri_interno(double altura_interno,double base_interno) {
		double value = Math.pow(base_interno,2)+Math.pow(altura_interno,2);
		this.hipotenusa_tri_interno = Math.sqrt(value);
	}
	private void setVolume_piramide() {
		this.volume_piramide = (area_base_piramide*altura_tri_interno)/3;
	}
	
	public double getBase_tri_interno() {
		return base_tri_interno;
	}
	
	public double getAltura_tri_interno() {
		return altura_tri_interno;
	}

	public double getArea_triangulo_lado() {
		return area_triangulo_lado;
	}

	public double getArea_piramide_lado() {
		return area_piramide_lado;
	}

	public double getArea_base_piramide() {
		return area_base_piramide;
	}

	public double getArea_total_piramide() {
		return area_total_piramide;
	}

	public double getVolume_piramide() {
		return volume_piramide;
	}

	public double getPreco_tinta() {
		return preco_tinta;
	}

	public void setPreco_tinta(double preco_tinta) {
		this.preco_tinta = preco_tinta;
		setPreco_total(latas*preco_tinta);
	}

	public double getLatas() {
		return latas;
	}

	public double getLitros() {
		return litros;
	}

	public double getPreco_total() {
		return preco_total;
	}

	private void setPreco_total(double preco_total) {
		this.preco_total = preco_total;
	}
	
	
	
}
