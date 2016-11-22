
public class RomanNumeralConverter {

	public int convert(String entrada) {
		int decimal = 0;
		String romanNumeral = entrada.toUpperCase();
		for(int x = 0;x<romanNumeral.length();x++)
		{
			char convertToDecimal = entrada.charAt(x);

			switch (convertToDecimal)
			{
			case 'M':
				decimal += 1000;
				break;

			case 'D':
				decimal += 500;
				break;

			case 'C':
				decimal += 100;
				break;

			case 'L':
				decimal += 50;
				break;

			case 'X':
				decimal += 10;
				break;

			case 'V':
				decimal += 5;
				break;

			case 'I':
				decimal += 1;
				break;
			}
		}
		if (romanNumeral.contains("IV"))
		{
			decimal-=2;
		}
		if (romanNumeral.contains("IX"))
		{
			decimal-=2;
		}
		if (romanNumeral.contains("XL"))
		{
			decimal-=10;
		}
		if (romanNumeral.contains("XC"))
		{
			decimal-=10;
		}
		if (romanNumeral.contains("CD"))
		{
			decimal-=100;
		}
		if (romanNumeral.contains("CM"))
		{
			decimal-=100;
		}
		if (decimal>1000) {
			throw new IllegalArgumentException();
		}
		if (romanNumeral.contains("IIII")) {
			throw new IllegalArgumentException();
		}
		if (romanNumeral.contains("VV")) {
			throw new IllegalArgumentException();
		}
		if (romanNumeral.contains("XXXX")) {
			throw new IllegalArgumentException();
		}
		if (romanNumeral.contains("LL")) {
			throw new IllegalArgumentException();
		}
		if (romanNumeral.contains("DD")) {
			throw new IllegalArgumentException();
		}
		if (romanNumeral.contains("MMMM")) {
			throw new IllegalArgumentException();
		}
		if (romanNumeral.contains("CCCC")) {
			throw new IllegalArgumentException();
		}
		return decimal;
	}
}
