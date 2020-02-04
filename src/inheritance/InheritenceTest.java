package inheritance;

import java.sql.SQLOutput;

public class InheritenceTest {
    public static void main(String[] args) {
        Vehicle[] garage = new Vehicle[4];
        Vehicle vehicle1 = new Vehicle(5);
//        vehicle1.numberOfTires = 1;
//        vehicle1.go();
//        vehicle1.report();
        garage[0] = vehicle1;

        Car car1 = new Car();
//        car1.go();
//        car1.report();
        garage[1]= car1;

        Truck truck1 = new Truck();
//        truck1.go();
//        truck1.report();
        garage[2] = truck1;


        Motorcycle moto1 = new Motorcycle();
//        moto1.go();
//        moto1.report();
        garage[3] = moto1;
        System.out.println(garage);
        for (Vehicle veh : garage){
            veh.go();
            veh.report();
            if(veh instanceof Vehicle)
                System.out.println("Of course I'm a vehicle");
            if(veh instanceof Car)
                System.out.println("Hey look I'm a car!");
        }
    }
}
