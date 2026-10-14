public class schule
{
    private String  name;
    private int     schueler;
    private boolean ganztags;
    
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
}