

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class schuleTest
{
    @Test
    public void testWenig()
    {
        schule Gymnasium;
        Gymnasium = new schule("Gymnasium", 0, true);
        //Fehlermeldung
        Gymnasium.printSchule();
        assertEquals(0, Gymnasium.getSchueler());
    }
    
    @Test
    public void testOk()
    {
        schule Volksschule;
        Volksschule = new schule("Volksschule", 300, false);
        Volksschule.printSchule();
        assertEquals(300, Volksschule.getSchueler());
    }
    
    @Test
    public void testViel()
    {
        schule Internat;
        Internat = new schule("Internat", 5010, true);
        //Fehlermeldung
        Internat.printSchule();
        assertEquals(0, Internat.getSchueler());
    }
}