public class TrenoMetro {
	
	private int numeroPasseggeri = 0;
	private Passeggero[] passeggeri;
	
	public TrenoMetro() {
		
	}
	
	public boolean salitaPasseggero(String destinazione, boolean inPossessoDiBiglietto) {
		if (numeroPasseggeri >= 50) {
			System.out.println("Errore, raggiuntacapienza massima treno!");
			return false;
		}
		
		Passeggero p = new Passeggero(destinazione, inPossessoDiBiglietto);
		
		passeggeri[numeroPasseggeri] = p;
		numeroPasseggeri++;
		System.out.println("num passeggeri:" + numeroPasseggeri);
		return true;
	}
	
	public Passeggero[] discesaPasseggeri(String destinazione) {		
		Passeggero[] passeggeriConDest = new Passeggero[numeroPasseggeri];
		int numPasseggeriConDest = 0;
		for (int i = 0; i < numeroPasseggeri; i++) {
			Passeggero p = passeggeri[i];
			
			if (p != null) {
				if (p.getDestinazione() == destinazione) {
					if (p.isInPosessoDiBiglietto() == true) {
						passeggeri[i] = null;
					} else {
						passeggeriConDest[numPasseggeriConDest] = p;
						numPasseggeriConDest++;
					}
					numeroPasseggeri--;
				}
			}
		}
		return passeggeriConDest;
	}

	public int numeroPasseggeri() {
		return numeroPasseggeri;
	}	
}
