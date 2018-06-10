package interfaces;

public class BackwardsString implements TextFunkifier{
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
	public static void main(String[] args) {
		BackwardsString bs = new BackwardsString();
		System.out.println(bs.funkifyText("This is a test"));
	}
}
