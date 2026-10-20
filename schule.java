public class schule
{
    private String  name;
    private int     schueler;
    private boolean ganztags;
    private boolean privat;
    private int     klassen;
    
    public schule(String neuName, boolean neuGanztags, boolean neuPrivat, int neuSchueler, int neuKlassen)
    {
        setName(neuName);
        setGanztags(neuGanztags);
        setPrivat(neuPrivat);
        setSchueler(neuSchueler);
        setKlassen(neuKlassen);
    }
    
    public schule(String neuName, int neuSchueler, boolean neuGanztags)
    {
        setName(neuName);
        setSchueler(neuSchueler);
        setGanztags(neuGanztags);
        setPrivat(false);
        setKlassen(12);
    }
    
    public schule(String neuName, boolean neuGanztags)
    {
        setName(neuName);
        setGanztags(neuGanztags);
        setSchueler(1);
        setPrivat(false);
        setKlassen(12);
    }
    
    public schule(String neuName, boolean neuPrivat, int neuSchueler)
    {
        setName(neuName);
        setPrivat(neuPrivat);
        setSchueler(neuSchueler);
        setGanztags(false);
        setKlassen(12);
    }
    
    public schule(String neuName)
    {
        setName(neuName);
        setGanztags(false);
        setPrivat(false);
        setSchueler(1);
        setKlassen(12);
    }
    
    public schule()
    {
        setName("UNKN");
        setGanztags(false);
        setPrivat(false);
        setSchueler(1);
        setKlassen(12);
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
    
    public void setPrivat(boolean neuPrivat)
    {
        privat = neuPrivat;
    }
    
    public void setKlassen(int neuKlassen)
    {
        klassen = neuKlassen;
    }
    
    public void printSchule()
    {
        System.out.println(name + " Schule: " + schueler + " Schueler - " + ganztags);
    }
    
}