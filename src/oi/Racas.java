
package oi;

import java.util.List;

public class Racas
{
    private List<RacaDoABC> raca;

    public List<RacaDoABC> getRaca ()
    {
        return raca;
    }

    public void setRaca (List<RacaDoABC> raca)
    {
        this.raca = raca;
    }

    @Override
    public String toString()
    {
        return ""+raca;
    }
}
