package vjezbe4;

public class Krug implements Oblik {
    private Tocka s;
    private double r;

    public Krug() {
        this.s = new Tocka();
        this.r = 1;
    }

    public Krug(double r) {
        this.s = new Tocka();
        this.r = r;
    }

    @Override
    public double dajOpseg() {
        return 2 * r * Math.PI;
    }

    @Override
    public double dajPovrsinu() {
        return Math.pow(r, 2) * Math.PI;
    }
}
