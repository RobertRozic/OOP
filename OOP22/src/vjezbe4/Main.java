package vjezbe4;

public class Main {

    public static void main(String[] args) {
        Krug k1 = new Krug();
        Krug k2 = new Krug(5);

        System.out.println(k1.dajOpseg());
        System.out.println(k1.dajPovrsinu());

        System.out.println(k2.dajOpseg());
        System.out.println(k2.dajPovrsinu());
    }
}
