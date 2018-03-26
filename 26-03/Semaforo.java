public class Semaforo {
  public int colore;

  public String toString() {
    String stato = null;

    if (colore == 0) {
      stato = "giallo";
    } else {
      if (colore == 1) {
        stato = "rosso";
      } else {
        stato = "verde";
      }
    }
    return stato;
  }
}
