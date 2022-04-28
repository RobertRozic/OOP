package vjezbe5;

import vjezbe4.Krug;

public class Cilindar extends Krug {
    private double v = 1;

    public Cilindar() {

    }

    public Cilindar(double r, double v) {
        super(r);
        this.v = v;
    }

    public double getV() {
        return v;
    }
}
