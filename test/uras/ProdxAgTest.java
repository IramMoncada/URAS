/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uras;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Iram Moncada
 */
public class ProdxAgTest {
    
    public ProdxAgTest() {
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
     * Test of mostrardatos method, of class ProdxAg.
     */
    @Test
    public void testMostrardatos() {
        System.out.println("mostrardatos");
        String valor = "testeo";
        ProdxAg instance = new ProdxAg();
        instance.mostrardatos(valor);
    }

    /**
     * Test of ejecutar method, of class ProdxAg.
     */
    @Test
    public void testEjecutar() {
        System.out.println("ejecutar");
        ProdxAg instance = new ProdxAg();
        instance.ejecutar();
    }
    
}
