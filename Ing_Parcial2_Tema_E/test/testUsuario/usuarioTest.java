package testUsuario;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ing_parcial2_tema_e.UsrCuenta;
import java.time.LocalDate;
public class usuarioTest {
    
    private static UsrCuenta usr;
    static int i = 1;
    
    public usuarioTest() {
    }
    
    @BeforeClass
    public static void antesDeTodo() {
        usr = new UsrCuenta("Juanjo", 1212);
        System.out.println("TEST de usuario");
    }
    
    @AfterClass
    public static void despuesDeTodo() {
        LocalDate ayer = LocalDate.now().minusDays(1);
        System.out.println(ayer +" Fin de las pruebas");
    }
    
    @Before
    public void setUp() {
        System.out.println("Test [" + i + "]");
    }
    
    @After
    public void tearDown() {
        System.out.println("----------------------------------------------------------");
        i++;
    }
    
    @Test
    public void testValidarUsr() {
        int contra = 2222;
        boolean resultado = usr.validarPassword(contra);
        assertTrue(resultado);
    }
    
    @Test
    public void testValidarEmail() {
        String email = "*****@*****.**";
        boolean resultado = false;
        if (email.contains("@") && email.contains(".") && email.length() < 20) {
            resultado = true;
        } 
        assertTrue(resultado);
    }
    
    @Test
    public void testCambioPass() {
        String newPass = "1234";
        usr.cambioPassword(newPass);
        assertEquals(1234, usr.getPassword());
    }
    
    @Test(timeout = 30)
    public void testDelay() {
        UsrCuenta u = new UsrCuenta();
        u.delay(50);
    }
    
    @Test
    public void testUsuariosDiferentes() {
        UsrCuenta u1 = new UsrCuenta("Pedro", 122);
        UsrCuenta u2 = new UsrCuenta("Pepe", 223);
        
        u1.usuariosDiferentes(u2);
        assertNotSame("mismo usuario", u1, u2);
    }
}
