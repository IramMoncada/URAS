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
public class Wadmin1Test {
    
    public Wadmin1Test() {
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
     * Test of mostrardatos method, of class Wadmin1.
     */
    @Test
    public void testMostrardatos() {
        System.out.println("mostrardatos");
        String valor = "Data Test";
        Wadmin1 instance = new Wadmin1();
        instance.mostrardatos(valor);
    }

    @Test
    public void testEjecutar() {
        System.out.println("ejecutar");
        Wadmin1 instance = new Wadmin1();
        instance.ejecutar();
    }
    
}
