package vjezbe7;

public class Main {
    public static void main(String[] args) {
        int a = 30;
        int b = 0;
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("Doslo je do pogreske");
        } finally {
            System.out.println("Ovaj dio koda se uvijek izvrsava");
        }

        System.out.println("Nastavak programa");
    }
}
