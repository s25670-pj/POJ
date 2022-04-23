import java.util.Objects;

public class Buzka implements PrzedstawiaEmocje, Skalowalny {
    char znak;
    Buzka(char znak)
    {
        this.znak = znak;
    }

    @Override
    public boolean czySieUsmiecha()
    {
        return this.znak == ')';
    }

    @Override
    public void przestanSieUsmiechac()
    {
        this.znak = '(';
    }

    @Override
    public void draw()
    {
        System.out.println(":-" + znak);
    }

    @Override
    public void draw(int r)
    {
        System.out.println(":-" + String.valueOf(znak).repeat(r));
    }
}
    