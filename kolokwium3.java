package com.company;
import java.util.ArrayList;
import java.lang.Math;

class TrojkatRownoramienny
{
    double podstawa, ramie;

    public TrojkatRownoramienny(double podstawa, double ramie)
    {
        this.podstawa = podstawa;
        this.ramie = ramie;
    }

    protected double wysokosc(double podstawa)
    {
        return (podstawa * Math.sqrt(2))/2;
    }

    protected double wysokosc(double podstawa, double ramie)
    {
        return ramie*ramie;
    }

    protected double wysokosc()
    {
        return 0;
    }
}

class TrojkatRownoboczny extends TrojkatRownoramienny
{
    double podstawa;

    public TrojkatRownoboczny(double podstawa)
    {
        super(podstawa, podstawa);
    }

    public TrojkatRownoboczny(double podstawa, double podstawa1)
    {
        super(podstawa, podstawa);
    }
}

public  class main {

public static void main(String[] args)
{
        // oczywiście ma też działać po zmianie tych wartości
        double podstawa = 1, ramie = 2;
        TrojkatRownoramienny trojkat1 = new TrojkatRownoramienny(podstawa, ramie);
        TrojkatRownoboczny trojkat2 = new TrojkatRownoboczny(podstawa, podstawa);
        TrojkatRownoramienny trojkat3 = new TrojkatRownoboczny(podstawa);

        if (trojkat2.wysokosc() == trojkat3.wysokosc())
            System.out.println("To powinno się wydrukować 1 (za 1 p.)");
        if (trojkat1.wysokosc(2.5) == (Math.sqrt((ramie * ramie) - (podstawa * podstawa / 4.)) * 2.5))
            System.out.println("To powinno się wydrukować 2 (za 1 p.)");
        if ((int) ((podstawa * Math.sqrt(3) / 2.) * 2) == trojkat3.wysokosc(2))
            System.out.println("To powinno się wydrukować 3 (za 2 p.)");
        if (trojkat2.equals(trojkat3))
            System.out.println("To powinno się wydrukować 4 (za 1 p.)");

        ArrayList lista1 = new ArrayList();
        lista1.add(trojkat1);
        lista1.add(trojkat2);
        lista1.add(trojkat3);
        lista1.remove(trojkat3);
        if (lista1.contains(trojkat3))
            System.out.println("To powinno się wydrukować 5 (za 2 p.)");
        
}
}
