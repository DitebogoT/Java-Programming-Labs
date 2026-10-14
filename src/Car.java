public class Car {
    String color;
    String brand;
    String model;
    int year;

    Car(String color,String brand, String model,int year){
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void Display(){
        System.out.println(this.color+ " " + this.brand + " " + this.model +" "+ this.year);
        System.out.println();
    }
}
