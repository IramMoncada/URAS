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
public class ReportesTest {
    
    public ReportesTest() {
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
     * Test of sumaTotal method, of class Reportes.
     */
    @Test
    public void testSumaTotal() {
        System.out.println("sumaTotal");
        Reportes instance = new Reportes();
        instance.sumaTotal();
        
    }

    /**
     * Test of mostrardatos method, of class Reportes.
     */
    @Test
    public void testMostrardatos() {
        System.out.println("mostrardatos");
        Reportes instance = new Reportes();
        instance.mostrardatos();
    }

    /**
     * Test of mostrardatos1 method, of class Reportes.
     */
    @Test
    public void testMostrardatos1() {
        System.out.println("mostrardatos1");
        String valor = "data";
        Reportes instance = new Reportes();
        instance.mostrardatos1(valor);
    }

    /**
     * Test of total method, of class Reportes.
     */
    @Test
    public void testTotal() {
        System.out.println("total");
        Reportes instance = new Reportes();
        instance.total();
    }

    /**
     * Test of total1 method, of class Reportes.
     */
    @Test
    public void testTotal1() {
        System.out.println("total1");
        Reportes instance = new Reportes();
        instance.total1();
    }

    /**
     * Test of ejecutar method, of class Reportes.
     */
    @Test
    public void testEjecutar() {
        System.out.println("ejecutar");
        Reportes instance = new Reportes();
        instance.ejecutar();
    }
    
}
