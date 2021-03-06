package examples.packaging;


public class Car {
    private String make, model;
    /**
     *  Represents a car by its make and model.
     * @param make The make of the car. <br>
     *             For Example: "Ford" or "Toyota"
     * @param model The model of the car. <br>
     *              For Example: "Taurus or "Camry"
     */
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    /**
     * Returns the <code>String</code> representation
     * of a <code>Car</code>.  In the form of:<br>
     * <code>make:model</code>
     *
     * @return the make:model of the Car.
     * @see java.lang.Object#toString()
     * @since 1.0
     */
    public String toString() {
        return make + " " + model;
    }
}
