package palindromo;

import org.junit.*;
import static org.junit.Assert.*;

public class TestePalindromo {

	IPalindromo palindromo;

	@Before
	public void testeInicio() {
		palindromo = new Palindromo();
	}
	
	@Test
	public void testePalindromoPositivo() {
		String s = "Reviver";
		boolean result = palindromo.isPalondromo(s);
		assertTrue(result);
	}
}
