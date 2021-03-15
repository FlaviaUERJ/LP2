class Circulo {

	int raio; 
	int posicao_x, posicao_y;

	Circulo(int raio, int posicao_x, int posicao_y) {
		this.raio = raio;
		this.posicao_x = posicao_x;
		this.posicao_y = posicao_y;
	}

	void print () {
		System.out.format("O raio desse circulo eh %d e ele esta na posicao (%d,%d)\n", this.raio, this.posicao_x, this.posicao_y);
	}

}

class CirculoApp {

	public static void main(String[] args) {
		
		Circulo c1 = new Circulo(8,4,4);
		c1.print();
	}
}
