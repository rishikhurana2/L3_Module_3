package interfaces;

public class MixedCapsString extends SpecialString{
	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String j = "";
		String l = "";
		for (int i = 0; i < s.length(); i++) {
			if (i%2 == 0) {
				j += s.substring(i, i+1).toLowerCase(); 
			}
			else {
				j += s.substring(i, i+1).toUpperCase();
			}
		}
		System.out.println(j);
		return j;
	}

}
