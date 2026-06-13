package testUsuario;

import ing_parcial2_tema_e.UsrCuenta;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class parameterMailTest {
    
    public parameterMailTest() {
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
    public String email;
    @Parameterized.Parameter(value = 1)
    public boolean resultadoEsperado;
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {"jorgesys@tototita.com", true},
            {"jorgesys@tototitacom", false},
            {"jorgesystototita.com", false},
            {"@jorgesystototita.com", false},
            {".jorgesystototita@com", false}
        });
    }
    
    @Test
    public void testValidarMail(){
        UsrCuenta u = new UsrCuenta();
        boolean actual = u.validarMail(email);
        assertEquals(resultadoEsperado, actual);
    }
}
