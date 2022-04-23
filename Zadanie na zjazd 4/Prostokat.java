import java.util.Objects;

class Prostokat implements MoznaWyznaczycWielokrotnoscPrzekatnej, MoznaWyznaczycWysokosc {

    int bok;
    int podstawa;

    public Prostokat(int p, int b) {
        this.podstawa = p;
        this.bok = b;
    }

    @Override
    public double podstawa() {
        return podstawa;
    }

    @Override
    public double katNachylenia() {
        return Math.PI / 2;

    }

    @Override
    public double bok() {
        return bok;
    }

    @Override
    public double przekatna() {
        return Math.sqrt((bok() * bok()) + (podstawa() * podstawa()));
    }

    @Override
    public double wysokosc() {
        return bok();
    }

    @Override
    public int wielokrotnoscPrzekatnej(int v){return (int)(przekatna() * v);
    }

    @Override
    public double wielokrotnoscPrzekatnej(double v) {
        return przekatna() * v;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MaWlasnosciRownolegloboku)) return false;
        MaWlasnosciRownolegloboku figura = (MaWlasnosciRownolegloboku) o;

        return ((bok == figura.bok() && podstawa == figura.podstawa()) ||
                (bok == figura.podstawa() && podstawa == figura.bok())) &&
                this.katNachylenia() == figura.katNachylenia();
    }

    @Override
    public int hashCode() {
        return Objects.hash(bok, podstawa);
    }

    @Override
    public String toString() {
        return "prostokat";
    }

}