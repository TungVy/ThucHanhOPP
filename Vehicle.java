package Week1;

public class Vehicle {

//    khoi tao bien
    private String name;
    private String rangeOfVehicle;
    private int cylinderCapacity;
    private double valueOfVehicle;

//    constructor mac dinh
    public Vehicle() {

    }

//    constructor day du tham so
    public Vehicle(String name, String rangeOfVehicle, int cylinderCapacity, double valueOfVehicle) {
        this.name = name;
        this.rangeOfVehicle = rangeOfVehicle;
        setCylinderCapacity(cylinderCapacity);
        setValueOfVehicle(valueOfVehicle);
        calTax();
    }

//    phuong thuc tinh muc thue
    public double calTax() {
        if (cylinderCapacity < 100) {
            return valueOfVehicle*0.1;
        }
        else if (cylinderCapacity <= 200) {
            return valueOfVehicle*0.3;
        }
        else if (cylinderCapacity > 200) {
            return valueOfVehicle*0.5;
        }
        return 0;
    }

//    phuong thuc in bang ke khai tien thue cua xe
    public void printVehicle() {
        System.out.printf("%-20s%-20s%-20d%-20.2f%-20.2f\n", name, rangeOfVehicle, cylinderCapacity, valueOfVehicle, calTax());
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
        this.rangeOfVehicle = rangeOfVehicle;
    }

    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        if (cylinderCapacity < 0) {
            this.cylinderCapacity = 0;
        }
        else {
            this.cylinderCapacity = cylinderCapacity;
        }
    }
    public double getValueOfVehicle() {
        return valueOfVehicle;
    }

    public void setValueOfVehicle(double valueOfVehicle) {
        if (valueOfVehicle < 0) {
            this.valueOfVehicle = 0;
        }
        else {
            this.valueOfVehicle = valueOfVehicle;
        }
    }


}
