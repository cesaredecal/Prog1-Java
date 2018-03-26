public class TestCerchio {
	public static void main(String[] args) {
		Cerchio c1 = new Cerchio();
		Punto p1 = new Punto();

		/*
			HEAP:
			raggio: 0 (address: 2100)
			centro: null (address: 2100)
			x: 0 (address: 2000)
			y: 0 (address: 2000)

			STACK:
			c1: 2100
			p1: 2000
		*/

		c1.raggio = 2;
		p1.x = 1;
		p1.y = 1;
		c1.centro = p1;

		/*
			HEAP:
			raggio: 2 (address: 2100)
			centro: 2000  (address: 2100)
			x: 1 (address: 2000)
			y: 1 (address: 2000)

			STACK:
			c1: 2100
			p1: 2000
		*/

		System.out.println("c1.centro == p1?: " + (c1.centro == p1));

		Cerchio c2 = new Cerchio();
		c2.raggio = 2;
		c2.centro = new Punto();
		c2.centro.x = 1;
		c2.centro.y = 1;

		// Usiamo la dot notation


		int num[];
		Punto punti [];

		num = new int[3];
		punti = new Punto[3];

		num[0] = 2;

		punti[0] = new Punto();
		for (int i = 0; i < punti.length; i++) {
			if (punti[i] == null) {
				punti[i] = new Punto();
				System.out.println("Trovato NULL!!!!!!!!!!");
			}
		}
	}
}
