/*
 * Cesare Gianfilippo Astianatte De Cal
 * 
 * Rappresenta	un	vagone	della	metro	della	capienza di	50	passeggeri.
 */

public class TrenoMetro {
	
	private int numeroPasseggeri = 0;
	private Passeggero[] passeggeri = new Passeggero[50];
	
	public TrenoMetro() {
	}
		
	public boolean salitaPasseggero(String destinazione, boolean inPossessoDiBiglietto) {
		return passeggeroSale(destinazione, inPossessoDiBiglietto);
	}

	public boolean salitaPasseggero(String destinazione) {
		return passeggeroSale(destinazione, true);
	}
	
	private boolean passeggeroSale(String destinazione, boolean inPossessoDiBiglietto) {
		if (numeroPasseggeri >= 50) {
			return false;
		}
		
		Passeggero p = new Passeggero(destinazione, inPossessoDiBiglietto);
		passeggeri[numeroPasseggeri] = p;
		numeroPasseggeri += 1;
		return true;
	}
	
	public Passeggero[] discesaPasseggeri(String destinazione) {
		Passeggero[] passeggeriRimossi = new Passeggero[50];
		int numeroPasseggeriRimossi = 0;
				
		for (int i = 0; i < numeroPasseggeriRimossi; i++) {
			Passeggero p = passeggeri[i];
			
			if (p.getDestinazione() == destinazione) {
				passeggeri[i] = null;
				numeroPasseggeri -= 1;

				if (p.isInPosessoDiBiglietto() == false) {
					passeggeriRimossi[numeroPasseggeriRimossi] = p;
					numeroPasseggeriRimossi++;
				}
			}
		}
				
		Passeggero[] passeggeriRimossiCopia = new Passeggero[numeroPasseggeriRimossi];
	
		for (int i = 0; i < numeroPasseggeriRimossi; i++) {
			passeggeriRimossiCopia[i] = passeggeriRimossi[i];
		}
					
		return passeggeriRimossiCopia;
	}

	public int numeroPasseggeri() {
		return numeroPasseggeri;
	}	
}
