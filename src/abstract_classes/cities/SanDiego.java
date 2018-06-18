package abstract_classes.cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub
		return this.population * this.growthRate + 1000000;
	}

}
