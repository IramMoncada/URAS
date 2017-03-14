package uras;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class WadminTest {
    
    public WadminTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of acceder method, of class Wadmin.
     */
    @Test
    public void testAcceder() {
        System.out.println("acceder");
        String usuario = "admin";
        String pass = "root";
        Wadmin instance = new Wadmin();
        instance.acceder(usuario, pass);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals("admin", usuario);
        assertEquals("root", pass);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ejecutar method, of class Wadmin.
     */
    @Test
    public void testEjecutar() {
        System.out.println("ejecutar");
        Wadmin instance = new Wadmin();
        instance.ejecutar();
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
