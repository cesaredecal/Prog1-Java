public class TestSpezzata {
  public static void main(String a[]) {
    Spezzata s = new Spezzata(); // elementi è null
    s.elementi = new Punto[3];
    
    s.elementi[0] = new Punto();
    s.elementi[1] = new Punto();
    s.elementi[1].x = 1;
    s.elementi[1].y = 1;
  }
}
