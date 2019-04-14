package pl.sda.patterns.behavioral.strategy;

import java.math.BigDecimal;
import java.util.List;

public class CardPaymentStrategy implements PaymentStrategy {

    private static void payFor(Item item) {
        System.out.println(item + " paid by card.");
    }

    @Override
    public void pay(List<Item> items) {
        items.forEach(CardPaymentStrategy::payFor);
        double sum = items
                .stream()
                .map(Item::getCash)
                .map(BigDecimal::doubleValue)
                .mapToDouble(Double::doubleValue)
                .sum();

        BigDecimal reduce = items
                .stream()
                .map(Item::getCash)
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);
        System.out.println(reduce);
    }
}