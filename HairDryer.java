class HairDryer{
    String brand;
    int power;
    String color;
    String mode;
    int price;

    HairDryer() {
        System.out.println("HairDryer default constructor");
    }

    HairDryer(String brand) {
        this.brand = brand;
    }

    HairDryer(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    HairDryer(String brand, int power, String color) {
        this.brand = brand;
        this.power = power;
        this.color = color;
    }

    HairDryer(String brand, int power, String color, String mode) {
        this.brand = brand;
        this.power = power;
        this.color = color;
        this.mode = mode;
    }

    HairDryer(String brand, int power, String color, String mode, int price) {
        this.brand = brand;
        this.power = power;
        this.color = color;
        this.mode = mode;
        this.price = price;
    }

    void display() {
        System.out.println(brand + " " + power + " " + color + " " + mode + " " + price);
    }
}