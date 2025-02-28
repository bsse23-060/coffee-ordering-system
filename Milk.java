public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", +MILK";
	}

	public double cost() {
		return .20 + beverage.cost();
	}
}
