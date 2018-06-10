package abstract_classes.farm;

import java.util.ArrayList;

public class Farm{
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		Cow c = new Cow();
		Moose m = new Moose();
		Giraffe g = new Giraffe();
		Pig p = new Pig(); 
		farm.add(c);
		farm.add(m);
		farm.add(g);
		farm.add(p);
		p.run("pig");
		g.run("Giraffe");
		m.run("Moose");
		c.run("Cow");
		for (int i = 0; i < farm.size(); i++) {
			System.out.println(farm.get(i).makeNoise());
		}
	}
}
