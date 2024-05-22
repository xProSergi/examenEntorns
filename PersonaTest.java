import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class PersonaTest {

    @Test
    public void testSetCorreoValid() {
        Persona persona = new Persona();
        assertTrue(persona.setCorreo("test@example.com"), "Correo válido debería ser aceptado");
        assertTrue(persona.setCorreo("user.name@domain.co"), "Correo válido debería ser aceptado");
        assertTrue(persona.setCorreo("user+name@domain.com"), "Correo válido con '+' debería ser aceptado");
    }

    private void assertTrue(boolean setCorreo, String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertTrue'");
    }

    @Test
    public void testSetCorreoInvalid() {
        Persona persona = new Persona();
        assertFalse(persona.setCorreo("test@example"), "Correo inválido debería ser rechazado");
        assertFalse(persona.setCorreo("test@.com"), "Correo inválido debería ser rechazado");
        assertFalse(persona.setCorreo("test@com"), "Correo inválido debería ser rechazado");
        assertFalse(persona.setCorreo("test.com"), "Correo inválido debería ser rechazado");
        assertFalse(persona.setCorreo("@example.com"), "Correo inválido debería ser rechazado");
    }

    @Test
    public void testSetEdadValid() {
        Persona persona = new Persona();
        assertTrue(persona.setEdad(18), "Edad de 18 años debería ser aceptada");
        assertTrue(persona.setEdad(25), "Edad de 25 años debería ser aceptada");
        assertTrue(persona.setEdad(100), "Edad de 100 años debería ser aceptada");
    }

    @Test
    public void testSetEdadInvalid() {
        Persona persona = new Persona();
        assertFalse(persona.setEdad(17), "Edad menor a 18 debería ser rechazada");
        assertFalse(persona.setEdad(0), "Edad menor a 18 debería ser rechazada");
        assertFalse(persona.setEdad(-5), "Edad negativa debería ser rechazada");
    }
}
