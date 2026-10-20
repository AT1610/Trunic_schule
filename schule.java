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
    
    public void printSchule()
    {
        System.out.println(name + " Schule: " + schueler + " Schueler - " + ganztags);
    }
    
}