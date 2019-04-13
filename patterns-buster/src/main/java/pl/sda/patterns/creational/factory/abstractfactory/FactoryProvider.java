package pl.sda.patterns.creational.factory.abstractfactory;

import java.util.Map;

import static com.google.common.collect.ImmutableMap.of;

//TODO test
public class FactoryProvider {
    private Map<String, AbstractFactory> itemFactoryMap = of(
            CarItem.class.getSimpleName(), new CarFactory(),
            BikeItem.class.getSimpleName(), new BikeFactory()
    );

    public AbstractFactory create(String type) throws Exception {
        if (type.equals("car")) {
            return new CarFactory();
        } else if (type.equals("bike")) {
            return new BikeFactory();
        } else {
            throw new Exception("Wrong input");
        }
    }

    public AbstractFactory create2(Item item) {
        return itemFactoryMap.get(item.getClass().getSimpleName());
    }

}
