package principal;

import figuras.Circulo;
import figuras.Figura;

public class FerramentaCirculo extends Ferramenta {

	public FerramentaCirculo(BarraDeFerramentas barra) {
		super(barra);
	}
	
	@Override
	public Figura criaFigura(int x1, int y1, int x2, int y2) {
		int dx = Math.abs(x2 - x1);
		int dy = Math.abs(y2 - y1);
		int raio = (int) Math.sqrt(dx * dx + dy * dy);
		return new Circulo(x1 - raio, y1 - raio, raio);
	}

	@Override
	public String getNome() {
		return "Círculo";
	}
}
