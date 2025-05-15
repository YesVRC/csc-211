package order;

@FunctionalInterface
public interface IShippingCalculator {
    double CalculateShipping(Order order);
}
