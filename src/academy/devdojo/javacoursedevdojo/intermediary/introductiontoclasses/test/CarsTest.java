package academy.devdojo.javacoursedevdojo.intermediary.introductiontoclasses.test;

import academy.devdojo.javacoursedevdojo.intermediary.introductiontoclasses.model.Car;
// import academy.devdojo.javacoursedevdojo.intermediary.introductiontoclasses.model.Pet;

public class CarsTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        // Pet pet = new Pet();

        car1.model = "Giulia";
        car1.brand = "Alfa Romeo";
        car1.year = 2022;

        car2.model = "Levante";
        car2.brand = "Maserati";
        car2.year = 2022;

        System.out.println("Car 01:" + car1.model + ", " + car1.brand + ", " + car1.year);
        System.out.println("Car 02:" + car2.model + ", " + car2.brand + ", " + car2.year);

        car1 = car2;
        //!error car2 = pet; 
        System.out.println("\nCar 01:" + car1.model + ", " + car1.brand + ", " + car1.year);
    }
}
