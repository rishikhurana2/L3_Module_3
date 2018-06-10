package abstract_classes.farm;

public abstract class Animal {
	public abstract String makeNoise();
	public void run(String animal) {
		System.out.println("The " + animal + " is running");
	}
}
