
package oi;

public class PojoRaca
{
    private Racas racas;

    public Racas getRacas ()
    {
        return racas;
    }

    public void setRacas (Racas racas)
    {
        this.racas = racas;
    }

    @Override
    public String toString()
    {
        return ""+racas;
    }
    
}