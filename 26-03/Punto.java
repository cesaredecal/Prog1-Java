public class Punto {
	public int x;
	public int y;

	public Punto() {
		setValori(0, 0);
	}

	public Punto(int x, int y) {
		setValori(x, y);
	}

	public void setValori(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Punto(Punto p) {
		// usa metodo clone
		// check for null
		setValori(p.x, p.y);
	}
}
