public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", +SOY";
	}

	public double cost() {
		return .25 + beverage.cost();
	}
}
