package vjezbe5;

import vjezbe4.Tocka;

public class Main {
    public static void main(String[] args) {
        Cilindar c1 = new Cilindar();
        Cilindar c2 = new Cilindar(5, 10);

        Tocka t1 = new Tocka(3, 3);
        Tocka t2 = new Tocka(3, 3);


        System.out.println(t1.equals(t2));
    }
}
