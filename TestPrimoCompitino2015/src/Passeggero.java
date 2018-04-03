public class Passeggero {
	private String destinazione;
	private boolean inPossessoDiBiglietto;
		
	public Passeggero(String destinazione) {
		this.destinazione = destinazione;
	}

	public Passeggero(String destinazione, boolean inPossessoDiBiglietto) {
		this.destinazione = destinazione;
		this.inPossessoDiBiglietto = inPossessoDiBiglietto;
	}

	@Override
	public String toString() {
		return "Passeggero [destinazione=" + destinazione + ", inPossessoDiBiglietto=" + inPossessoDiBiglietto + "]";
	}
}
