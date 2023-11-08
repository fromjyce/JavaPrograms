/* Write a Java program to create a class called Car with private instance variables company_name, model_name, year, and mileage. Provide public getter and setter methods to access and modify the company_name, model_name, and year variables. However, only provide a getter method for the mileage variable.*/


class Car {
    private String company_name;
    private String model_name;
    private int year;
    private int mileage;
    Car (String cname, String mname, int y, int mil) {
        this.company_name = cname;
        this.model_name = mname;
        this.year = y;
        this.mileage = mil;
    }

    public void setCompanyName(String CompanyName) {
        company_name = CompanyName;
    }

    public String getCompanyName() {
        return company_name;
    }

    public void setModelName(String ModelName) {
        model_name = ModelName;
    }

    public String getModelName() {
        return model_name;
    }

    public void setYear(int Year) {
        year = Year;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

}

public class PrivateCarModel {
    public static void main(String[] args) {
        Car car = new Car("Benz", "CX101", 2009, 50000);
        System.out.println(car.getCompanyName());
        System.out.println(car.getModelName());
        System.out.println(car.getYear());
        System.out.println(car.getMileage());
        car.setCompanyName("Tesla");
        System.out.println(car.getCompanyName());
        System.out.println(car.getModelName());
        System.out.println(car.getYear());
        System.out.println(car.getMileage());
        car.setModelName("MD1001");
        System.out.println(car.getCompanyName());
        System.out.println(car.getModelName());
        System.out.println(car.getYear());
        System.out.println(car.getMileage());
        car.setYear(2023);
        System.out.println(car.getCompanyName());
        System.out.println(car.getModelName());
        System.out.println(car.getYear());
        System.out.println(car.getMileage());
        

    }
}
