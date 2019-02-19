package util;

public class Number {

	public static Double strToDouble(String s) throws Exception {
		try {
			return Double.parseDouble(s);
		} catch (Exception e) {
			throw new Exception("Erro ao converter "+s+" para numérico");
		}
	}
	
	public static Long strToLong(String s) throws Exception {
		try {
			return Long.parseLong(s);
		} catch (Exception e) {
			throw new Exception("Erro ao converter "+s+" para numérico");
		}
	}
}
