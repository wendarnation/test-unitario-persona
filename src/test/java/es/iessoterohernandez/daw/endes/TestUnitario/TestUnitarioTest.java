package es.iessoterohernandez.daw.endes.TestUnitario;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class TestUnitarioTest {
	/**
	 * Rigorous Test :-)
	 */
	
	private Persona persona;
	
	@BeforeEach
	public void init() {
		persona = new Persona("Pablo", 22, 'H', 70, 1.70);
	}
	
	@Test
    public void testCalcularIMC() {
        assertEquals(Persona.PESO_IDEAL, persona.calcularIMC());
        
        persona.setPeso(20);
        assertEquals(Persona.INFRAPESO, persona.calcularIMC());
        
        persona.setPeso(150);
        assertEquals(Persona.SOBREPESO, persona.calcularIMC());
    }
	
	@Test
    public void testMayorEdad() {
        assertTrue(persona.esMayorDeEdad());
    }
	
	
	
	
	
	
	
	
}
