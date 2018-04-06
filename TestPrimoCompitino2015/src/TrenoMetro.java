/*
 * Cesare Gianfilippo Astianatte De Cal
 * 
 * Rappresenta	un	vagone	della	metro	della	capienza di	50	passeggeri.
 */

public class TrenoMetro {
	
	private Passeggero[] passeggeri;
	
	public TrenoMetro() {
		passeggeri = new Passeggero[50];
	}
		
	public boolean salitaPasseggero(String destinazione, boolean inPossessoDiBiglietto) {
		return passeggeroSale(destinazione, inPossessoDiBiglietto);
	}

	public boolean salitaPasseggero(String destinazione) {
		return passeggeroSale(destinazione, true);
	}
	
	private boolean passeggeroSale(String destinazione, boolean inPossessoDiBiglietto) {
		if (numeroPasseggeri() >= 50) {
			System.out.println("Carrozza piena! Impossibile far salire passeggeri.");
			return false;
		} else {
			System.out.println("C'e' ancora spazio. Num passeggeri a bordo: " + numeroPasseggeri());
			int postoLibero = trovaPrimoPostoLibero(passeggeri);
			Passeggero p = new Passeggero(destinazione, inPossessoDiBiglietto);
			passeggeri[postoLibero] = p;
			return true;
		}		
	}
		
	public Passeggero[] discesaPasseggeri(String destinazione) {
		// Conto num. di passeggeri con destinazione uguale a quella del parametro; inoltre 
		// anche il numero di persone con non solo destinazione uguale al parametro ma
		// anche biglietto settato a false
		int cont = 0;
		int contBigliettoFalse = 0;
		for(int i = 0; i < numeroPasseggeri(); i++)
			if(passeggeri[i].getDestinazione().equals(destinazione))
				if(passeggeri[i].isInPosessoDiBiglietto()) {
					cont++;
				} else {
					cont++;
					contBigliettoFalse++;
				}
		
		// Se tutti i passeggeri non hanno destinazione uguale a quella per
		// parametro, returno un array vuoto
		if(cont==0) return (new Passeggero[0]);
		
		// Creo due copie del vettore:
		// - una per la nuova lista 'pulita'
		// - una per la lista di quelli rimossi con biglietto settato a false
		Passeggero[] passeggeriNuovo = new Passeggero[50];
		Passeggero[] passeggeriReturn = new Passeggero[contBigliettoFalse];
		
		// Se il passeggero ha destinazione uguale a quella passata per parametro
		// lo 'rimuovo' dal vettore; in pratica non lo copio nel nuovo vettore
		int contCopiati = 0, contRimossi = 0, indice = 0;
		do {
			if(!passeggeri[indice].getDestinazione().equals(destinazione)) {
				passeggeriNuovo[contCopiati] = new Passeggero(passeggeri[indice].getDestinazione(), passeggeri[indice].isInPosessoDiBiglietto());
				contCopiati++;
			} else {
				if( ( !passeggeri[indice].isInPosessoDiBiglietto() ) && ( contRimossi < contBigliettoFalse )) {
					passeggeriReturn[contRimossi] = new Passeggero(passeggeri[indice].getDestinazione(), false);
					contRimossi++;
				}
			}
			indice++;
		} while((indice < numeroPasseggeri()));
		
		// Sostituisco la reference al vettore 'vecchio' con quella a quello nuovo
		passeggeri = passeggeriNuovo;
		
		// Returno il vettore di passeggeri rimossi con biglietto settato a false
		if(contBigliettoFalse==0)
			return (new Passeggero[0]);
		else
			return passeggeriReturn;
	}
	
	private int contaValoriNonNull(Passeggero[] array) {
		int numPasseggeri = 0;
		for (int i = 0; i < array.length; i++) {
			if (passeggeri[i] != null) {
				numPasseggeri++;
			}
		}
		return numPasseggeri;
	}
	
	private int trovaPrimoPostoLibero(Passeggero[] array) {
		boolean trovatoNull = false;
		int posizioneNull = -1;
		
		for (int i = 0; i < array.length; i++) {
			if (trovatoNull == false && array[i] == null) {
				posizioneNull = i;
				trovatoNull = true;
			}
		}

		System.out.println("Trovato posto a " + posizioneNull);
		return posizioneNull;
	}

	public int numeroPasseggeri() {
		return contaValoriNonNull(passeggeri);
	}	
}
