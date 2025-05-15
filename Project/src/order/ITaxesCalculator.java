package order;

import product.Product;

import java.util.List;

@FunctionalInterface
public interface ITaxesCalculator {
    double CalculateTaxes(double total);
}
