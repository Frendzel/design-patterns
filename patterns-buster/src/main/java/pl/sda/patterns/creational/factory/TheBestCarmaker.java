package pl.sda.patterns.creational.factory;

import pl.sda.model.*;

import java.time.Year;
import java.util.Map;

import static com.google.common.collect.ImmutableMap.of;
import static pl.sda.model.CarType.*;

//TODO 1. Refactor to use factory here
//TODO 2. Use polymorphism
//TODO 3. Try to implement 3 versions of factory:
//TODO 3.1 With simple ifs
//TODO 3.2 With enum
//TODO 3.3 With map instead of ifs
//TODO 4. For all implementations please add junit tests.
public class TheBestCarmaker {

    private Map<CarType, Car> carMap = of(
            CALIBA, new Calibra(),
            PASSAT, new Passat(),
            CIVIC, new Civic()
    );

    public Calibra makeCalibra(int door, String color, Year productionYear) {
        return new Calibra(door, color, productionYear);
    }

    public Civic makeCivic(int door, String color, Year productionYear) {
        return new Civic(door, color, productionYear);
    }

    public Passat makePassat(int door, String color, Year productionYear) {
        return new Passat(door, color, productionYear);
    }

    public Car newCar(CarType carType, int door, String color, Year productionYear) {
        Car car = carMap.get(carType);
        car.setColor(color);
        car.setDoor(door);
        car.setProductionYear(productionYear);
        //return Car.builder().color(color).door(door).productionYear(productionYear).build();
        return car;
    }

    public Car create(CarType cartype, int door, String color, Year productionYear) {
        switch (cartype) {
            case CIVIC:
                return new Civic(door, color, productionYear);
            case CALIBA:
                return new Calibra(door, color, productionYear);
            case PASSAT:
                return new Passat(door, color, productionYear);
            default:
                throw new RuntimeException("Unsupported car type");
        }
    }


}

//TODO reflection usage