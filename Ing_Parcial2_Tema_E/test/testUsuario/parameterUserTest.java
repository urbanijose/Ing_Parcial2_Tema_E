package testUsuario;

import ing_parcial2_tema_e.UsrCuenta;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class parameterUserTest {
    
    public parameterUserTest() {
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
   
    @Parameterized.Parameter(value = 0)
    public String valorActual;
    @Parameterized.Parameter(value = 1)
    public UsrCuenta u;
    @Parameterized.Parameter(value = 2)
    public int valorEsperado;
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {"1111", new UsrCuenta("usuario", 2222), 1111},
            {"1112", new UsrCuenta("usuario", 2222), 1111},
            {"aaaa", new UsrCuenta("usuario", 2222), 1111},
        });
    }
    @Test
    public void testCambioPass(){
        u.cambioPassword(valorActual);
        assertEquals(valorEsperado, u.getPassword());
    }
}

