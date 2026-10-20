public class schule
{
    private String  name;
    private int     schueler;
    private boolean ganztags;
    
    public schule()
    {
        setName("UNKN");
        setGanztags(false);
        setSchueler(0);
    }
    
    public schule(String name, int schueler)
    {
        setName(name);
        setSchueler(schueler);
        setGanztags(false);
    }
    
    public schule(String name, int schueler, boolean ganztags)
    {
        setName(name);
        setGanztags(ganztags);
        setSchueler(schueler);
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getSchueler()
    {
        return schueler;
    }
    
    public boolean getGanztags()
    {
        return ganztags;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setSchueler(int schueler)
    {
        this.schueler = schueler;
    }
    
    public void setGanztags(boolean ganztags)
    {
        this.ganztags = ganztags;
    }
    
    /*
       Print Methode
       Schule: name - schueler Schüler - ganztags
       Schule: Gymnasium - 800 Schüler - Ganztagsschule
       Schule: Volksschule - 250 Schüler - Halbtagsschule
     */
    public void printSchule()
    { 
        if (ganztags == true)
        {
            System.out.println("Schule: " + name + " - " + schueler + " Schüler - " + "Ganztagsschule");
        }
        else
        {
            System.out.println("Schule: " + name + " - " + schueler + " Schüler - " + "Halbtagsschule");
        }
    }
    
}