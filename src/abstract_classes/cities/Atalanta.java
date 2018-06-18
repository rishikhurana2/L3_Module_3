package abstract_classes.cities;

public class Atalanta extends City{

	public Atalanta(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub
		return this.population*this.growthRate*(2*this.growthRate);
	}

}
