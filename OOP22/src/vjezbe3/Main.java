package vjezbe3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test123");
        Metode m = new Metode();
        int a = m.zbroji(3, 5);
        System.out.println("Zbroj je " + a);

        Tocka t1 = new Tocka();
        Tocka t2 = new Tocka(3, 5);

        System.out.println("X je:" + t1.getX());

        double udaljenost = t1.udaljenost(t2);
        System.out.println("Udaljenost t1 i t2 je:" + udaljenost);

        double udaljenost2 = Tocka.udaljenostStaticka(t1, t2);
        System.out.println("Udaljenost t1 i t2 je:" + udaljenost2);


        Linija l1 = new Linija();
        System.out.println("Duzina je" + l1.duzina());

        Tocka t3 = new Tocka(3, 5);
        Tocka t4 = new Tocka(7, 12);

        Linija l2 = new Linija(t3, t4);
        System.out.println("Duzina je" + l2.duzina());

    }



}
