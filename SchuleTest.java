

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SchuleTest
{
    @Test
    public void testWenig()
    {
        Schule Gymnasium;
        Gymnasium = new Schule("Gymnasium", 0, true);
        //Fehlermeldung
        Gymnasium.printSchule();
        assertEquals(1, Gymnasium.getSchueler());
    }
    
    @Test
    public void testOk()
    {
        Schule Volksschule;
        Volksschule = new Schule("Volksschule", 300, false);
        Volksschule.printSchule();
        assertEquals(300, Volksschule.getSchueler());
    }
    
    @Test
    public void testViel()
    {
        Schule Internat;
        Internat = new Schule("Internat", 5010, true);
        //Fehlermeldung
        Internat.printSchule();
        assertEquals(1, Internat.getSchueler());
    }
}