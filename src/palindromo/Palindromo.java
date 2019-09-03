package palindromo;

public class Palindromo implements IPalindromo {

	boolean result;

	@Override
	public boolean isPalondromo(String s) {
		String str = s.replaceAll(" ", "");

		if (str.equals(new StringBuilder(str).reverse().toString()))
			result = true;
		return result;
	}

}
