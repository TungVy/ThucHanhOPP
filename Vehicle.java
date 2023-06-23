package Week1;

public class Vehicle {

//    khoi tao bien
    private String name;
    private String rangeOfVehicle;
    private double valueOfVehicle;
    private int cylinderCapacity;

//    constructor mac dinh
    public Vehicle() {

    }

//    constructor day du tham so
    public Vehicle(String name, String rangeOfVehicle, double valueOfVehicle, int cylinderCapacity) {
        this.name = name;
        this.rangeOfVehicle = rangeOfVehicle;
        if (valueOfVehicle < 0) {
            this.valueOfVehicle = 0;
        }
        else {
            this.valueOfVehicle = valueOfVehicle;
        }
        if (cylinderCapacity < 0) {
            this.cylinderCapacity = 0;
        }
        else {
            this.cylinderCapacity = cylinderCapacity;
        }
    }

//    phuong thuc tinh muc thue
    public double calTax() {
        if (cylinderCapacity < 100) {
            return valueOfVehicle*0.1;
        }
        else if (cylinderCapacity >= 100 && cylinderCapacity <= 200) {
            return valueOfVehicle*0.3;
        }
        else if (cylinderCapacity > 200) {
            return valueOfVehicle*0.5;
        }
        return 0;
    }

//    getter va setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRangeOfVehicle() {
        return rangeOfVehicle;
    }

    public void setRangeOfVehicle(String rangeOfVehicle) {
        if (valueOfVehicle < 0) {
            this.valueOfVehicle = 0;
        }
        else {
            this.valueOfVehicle = valueOfVehicle;
        }
    }

    public double getValueOfVehicle() {
        return valueOfVehicle;
    }

    public void setValueOfVehicle(double valueOfVehicle) {
        if (cylinderCapacity < 0) {
            this.cylinderCapacity = 0;
        }
        else {
            this.cylinderCapacity = cylinderCapacity;
        }
    }

    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }
}
