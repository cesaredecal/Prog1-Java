/*
 * Cesare Gianfilippo Astianatte De Cal
 * 
 * Rappresenta	 un	 passeggero	 della	 metropolitana.
 */

public class Passeggero {
	private String destinazione;
	private boolean inPossessoDiBiglietto;
	
	public Passeggero(String destinazione, boolean inPossessoDiBiglietto) {
		creaPasseggero(destinazione, inPossessoDiBiglietto);
	}
	
	public Passeggero(String destinazione) {
		creaPasseggero(destinazione, true);
	}
	
	@Override
	public String toString() {
		return "Passeggero [destinazione=" + destinazione + ", inPossessoDiBiglietto=" + inPossessoDiBiglietto + "]";
	}
	
	private void creaPasseggero(String destinazione, boolean inPossessoDiBiglietto) {
		if (destinazione == null) {
			this.destinazione = "CAPOLINEA";
		} else {
			this.destinazione = destinazione;
		}
		this.inPossessoDiBiglietto = inPossessoDiBiglietto;
	}
		
	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	public String getDestinazione() {
		return destinazione;
	}

	public boolean isInPosessoDiBiglietto() {
		return inPossessoDiBiglietto;
	}
}
