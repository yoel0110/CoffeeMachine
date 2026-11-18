import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import entities.Azucarero;

public class TestAzucarero {
    Azucarero azucarero;

    @Before
    public void setUp() {
        azucarero = new Azucarero(10);
    }

    @Test
    public void deberiaDevolverVerdaderoSiHaySuficienteAzucarEnElAzucarero() {
        boolean resultado = azucarero.hasAzucar(5);
        assertTrue(resultado);

        resultado = azucarero.hasAzucar(10);
        assertTrue(resultado);
    }

    @Test
    public void deberiaDevolverFalsoPorqueNoHaySuficienteAzucarEnElAzucarero() {
        boolean resultado = azucarero.hasAzucar(15);
        assertFalse(resultado);
    }

    @Test
    public void deberiaRestarAzucarAlAzucarero() {
        azucarero.giveAzucar(5);
        assertEquals(5, azucarero.getCantidadAzucar());

        azucarero.giveAzucar(2);
        assertEquals(3, azucarero.getCantidadAzucar());
    }
}
