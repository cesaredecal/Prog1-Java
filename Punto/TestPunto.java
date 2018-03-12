public class TestPunto {
	public static void main(String ar[]) {
		//dichiarazione di variabile
		int v;
		int w;
		//tipo  identificativo
		Punto p1;
		Punto p2;
		
		//assegnamento = con valore
		v = 2;
		w = 2;		
		p1 = new Punto();
		p2 = new Punto();
		
		//write valori
		p1.x = 1;
		p1.y = 2;		
		p2.x = 1;
		p2.y = 2;
		
		//Identità
		boolean esito;
		esito = (v == w);
		System.out.println(esito);
		esito = (p1 == p2);
		System.out.println(esito);
		
		//Uguaglianza
		esito = (p1.x == p2.x && p1.y == p2.y);
		System.out.println(esito);
				
		//assegnamento = con variabile (con valore per riprendere e poi con variabile)
		int a = 3;
		Punto p3 = new Punto();
		int b = a;
		Punto p4 = p3;
		
		//indefinito
		int c;
		//L'istruzione sotto commentata non compila
		//int d = c;
		Punto p5;
		//L'istruzione sotto commentata non compila		
		//Punto p6 = p5;
		
		//null		
		if(p4 == null) System.out.println("p4 e' null");
	}
}















