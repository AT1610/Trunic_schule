public class schule
{
    private String  name;
    private int     schueler;
    private boolean ganztags;
    
    
    public schule(String neuName, int neuSchueler, boolean neuGanztags)
    {
        setName(neuName);
        setSchueler(neuSchueler);
        setGanztags(neuGanztags);
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
     
    public void setName(String neuName)
    {
        name = neuName;
    }
    
    public void setSchueler(int neuSchueler)
    {
        schueler = neuSchueler;
    }
    
    public void setGanztags(boolean neuGanztags)
    {
        ganztags = neuGanztags;
    }
    
    public void printSchule()
    {
        System.out.println(name + " Schule: " + schueler + " Schueler - " + ganztags);
    }
    
}