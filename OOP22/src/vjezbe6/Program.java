package vjezbe6;

public class Program {

    public static void main(String[] args) {
        try {
            Pravokutnik p1 = new Pravokutnik(5, 10);
            System.out.println(p1.povrsina());
            System.out.println(p1.opseg());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
