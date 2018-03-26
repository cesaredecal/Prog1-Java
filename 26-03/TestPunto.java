public class TestPunto {
	public static void main(String[] args) {
		System.out.println("Ciao! Funziona");
		Punto p0 = new Punto();
		Punto p1 = new Punto(1, 2);
		System.out.println("p1 x:" + p1.x);
		System.out.println("p0 x:" + p0.x);
	}
}
