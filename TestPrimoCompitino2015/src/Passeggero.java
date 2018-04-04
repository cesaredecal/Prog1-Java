public class Passeggero {
	private String destinazione;
	private boolean inPossessoDiBiglietto;
		
	public Passeggero(String destinazione) {
		setAttributes(destinazione, true);
	}

	public Passeggero(String destinazione, boolean inPossessoDiBiglietto) {
		setAttributes(destinazione, inPossessoDiBiglietto);
	}
	
	private void setAttributes(String destinazione, boolean inPossessoDiBiglietto) {
		if (destinazione == null) {
			this.destinazione = "CAPOLINEA";
		} else {
			this.destinazione = destinazione;
		}
		this.inPossessoDiBiglietto = inPossessoDiBiglietto;
	}
	
	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	public boolean isInPosessoDiBiglietto() {
		return inPossessoDiBiglietto;
	}

	public void setInPossessoDiBiglietto(boolean inPossessoDiBiglietto) {
		this.inPossessoDiBiglietto = inPossessoDiBiglietto;
	}

	@Override
	public String toString() {
		return "Passeggero [destinazione=" + destinazione + ", inPossessoDiBiglietto=" + inPossessoDiBiglietto + "]";
	}
}
