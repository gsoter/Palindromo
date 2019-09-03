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
		String s = "reviver";
		boolean result = palindromo.isPalondromo(s);
		assertTrue(result);
	}

	@Test
	public void testePalindromoFalsoNegativo() {
		String s = "Reviver";
		boolean result = palindromo.isPalondromo(s);
		assertTrue(result);
	}

	@Test
	public void testePalindromoNegativo() {
		String s = "teste";
		boolean result = palindromo.isPalondromo(s);
		assertFalse(result);
	}

	@Test(expected = NullPointerException.class)
	public void testePalindromoNulo() {
		String s = null;
		boolean result = palindromo.isPalondromo(s);
	}

	@After
	public void testeFim() {
		palindromo = null;
		System.gc();
	}
}
