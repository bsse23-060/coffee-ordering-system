public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", +MOCHA";
	}
 
	public double cost() {
		return .50 + beverage.cost();
	}
}
