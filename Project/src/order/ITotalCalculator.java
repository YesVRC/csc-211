package order;

@FunctionalInterface
public interface ITotalCalculator {
    double CalculateTotal(Order order);
}
