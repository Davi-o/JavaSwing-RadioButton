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
public class PessoaTest {
    private static final Produto p = new Produto();
    
    public PessoaTest() { }
    
    @BeforeClass
    public static void setUpClass() { }
    
    @AfterClass
    public static void tearDownClass() { }
    
    @Before
    public void setUp() {
        p.setNomeProduto("Leite");
        p.setTipoProduto("Alimento");
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
}
