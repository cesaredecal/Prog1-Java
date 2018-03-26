public class Semaforo {
  private int colore;

  public int getColore() {
    return colore;
  }

  // setter
  private void setColore(int colore) {
    if (colore == 0 || colore == 1 | colore == 2) {
      this.colore = colore;
    }
  }

  public void cambiaColore() {
    if (colore == 2) {
      setColore(0);
    } else {
      setColore(colore++);
    }
  }

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

  public Semaforo() {
    setColore(0);
  }

  public Semaforo(int colore) {
    setColore(colore);
  }

  public boolean equals(Semaforo altro) {
    if (altro == null) {
      return false;
    }

    if (this == altro) {
      return true;
    }

    if (colore == altro.colore) {
      return true;
    }
  }
}
