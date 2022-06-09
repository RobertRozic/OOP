package vjezbe6;

public class Pravokutnik extends GrafickiObjekt{
    private float a;
    private float b;

    public Pravokutnik(float a, float b) {
        this.a = a;
        this.b = b;
    }

    @Override
    float povrsina() {
        return a*b;
    }

    @Override
    float opseg() {
        return 2*a + 2*b;
    }
}
