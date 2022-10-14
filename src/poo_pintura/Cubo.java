package poo_pintura;

public class Cubo {
	private double lado;
	private double area_quadrado;
	private double diagonal_cubo;
	private double area_total;
	private double volume;
	private double tipo;
	private double litros;
	private double rendimento;
	private double latas;
	private double preco;
	
	Cubo(double lado) throws Exception{
		setLado(lado);
		setDiagonal_cubo(lado);
		setArea_quadrado(lado);
		setArea_total(this.area_quadrado);
		setVolume(lado);
	}

	public double getLado() {
		return lado;
	}

	private void setLado(double lado) throws Exception {
		if (lado<0) {
			throw new Exception("Lado menor ou igual a zero");
		} else {
			this.lado = lado;
		}
	}

	public double getArea_quadrado() {
		return area_quadrado;
	}

	private void setArea_quadrado(double lado) {
		this.area_quadrado = lado*lado;
	}

	public double getDiagonal_cubo() {
		return diagonal_cubo;
	}

	private void setDiagonal_cubo(double lado) {
		this.diagonal_cubo = lado*(Math.pow(3, 0.5));
	}

	public double getArea_total() {
		return area_total;
	}

	private void setArea_total(double area_quadrado) {
		this.area_total = area_quadrado*6;
	}

	public double getTipo() {
		return tipo;
	}

	public void setTipo(double tipo) throws Exception {
		if (tipo==1) {
			this.tipo = 101.90f;
		} else if (tipo==2) {
			this.tipo = 212.45f;
		} else if (tipo==3) {
			this.tipo = 345.56f;
		} else {
			throw new Exception("Tipo não encontrado");
		}
	}

	public double getLitros() {
		return litros;
	}

	private void setLitros(double rendimento) {
		this.litros = area_total/rendimento;
		setLatas(litros);
	}

	public double getRendimento() {
		return rendimento;
	}

	@Override
	public String toString() {
		return "Cubo [lado=" + lado + "\n, area_quadrado=" + area_quadrado + "\n, diagonal_cubo=" + diagonal_cubo
				+ "\n, area_total=" + area_total + "\n, volume=" + volume + "\n, tipo=" + tipo + "\n, litros=" + litros
				+ "\n, rendimento=" + rendimento + "\n, latas=" + latas + "\n, preco=" + preco + "]";
	}

	public void setRendimento(double rendimento) throws Exception {
		if (rendimento <= 0) {
			throw new Exception("Rendimento menor ou igual a zero");
		} else {
			setLitros(rendimento);
			this.rendimento = rendimento;
		}
	}

	public double getLatas() {
		return latas;
	}

	private void setLatas(double litros) {
		this.latas = Math.ceil(litros/18);
		setPreco(latas);
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double latas) {
		this.preco = latas*tipo;
	}

	public double getVolume() {
		return volume;
	}

	private void setVolume(double lado) {
		this.volume = lado*lado*lado;
	}
	
}
