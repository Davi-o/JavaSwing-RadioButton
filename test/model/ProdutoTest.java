package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Davi, Maria Rita.
 * @since 20/03
 * @version 1.0
 */
public class ProdutoTest {
    private static final Produto p = new Produto();
    
    public ProdutoTest() { }
    
    @BeforeClass
    public static void setUpClass() { }
    
    @AfterClass
    public static void tearDownClass() { }
    
    @Before
    public void setUp() {
        p.setNomeProduto("Leite");
        p.setTipoProduto("Alimento");
        p.setValorProduto(5.0);
        p.setQtdProduto(2);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of verificarSexo method, of class Produto.
     */
    @Test
    public void testVerificarProduto() {
        assertEquals("Comestivel", p.verificarProduto());
    }    
    
    /**
     * Test of verificarSexo method, of class Produto.
     */
    @Test
    public void testValorTotal() {
        assertEquals(10, p.valorTotal(), 0.0);
    }
}
