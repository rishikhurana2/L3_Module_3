package interfaces;

public class MixedCapsString implements TextFunkifier{
	String j;
	public MixedCapsString(String j) {
		this.j = j;
	}
	@Override
	public String funkifyText(String j) {
		return this.j;
	}

}
