class Kwadrat extends Prostokat implements MoznaWyznaczycPrzekatna {

    public Kwadrat(int p, int b) {
        super(p, b);
    }

    public Kwadrat(int p) {
        super(p, p);
    }

    @Override
    public String toString() {
        return "kwadrat";
    }
}
