package interfaces;

public class BackwardsString extends SpecialString{
	public BackwardsString(String s) {
		super(s);
	}
	String j;
	static String b;
	@Override
	public String funkifyText(String s) {
		b = "";
		for (int i = 0; i < s.length(); i++) {
			b += s.charAt(s.length() - (i+1));
		}
		return b;
	}
}
