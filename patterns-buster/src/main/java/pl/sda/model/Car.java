package pl.sda.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Year;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Car implements Driveable, Cloneable {

    private int door;
    private String color;
    private Year productionYear;


    //TODO note that using .clone is not the best way to copy objects in Java
    //TODO we should think about just copying all existing values to the new object
    //TODO and use simply new keyword.
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
//    public Car cloneCar(Car car){
//        Car car1 = new Car();
//        car1.setColor(this.getColor());
//        return car1;
//    }
}
