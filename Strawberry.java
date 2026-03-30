class Strawberry{
    String color;
    double weight;
    String taste;
    String origin;
    int price;

    Strawberry() {
        System.out.println("Strawberry default constructor");
    }

    Strawberry(String color) {
        this.color = color;
    }

    Strawberry(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    Strawberry(String color, double weight, String taste) {
        this.color = color;
        this.weight = weight;
        this.taste = taste;
    }

    Strawberry(String color, double weight, String taste, String origin) {
        this.color = color;
        this.weight = weight;
        this.taste = taste;
        this.origin = origin;
    }

    Strawberry(String color, double weight, String taste, String origin, int price) {
        this.color = color;
        this.weight = weight;
        this.taste = taste;
        this.origin = origin;
        this.price = price;
    }

    void display() {
        System.out.println(color + " " + weight + " " + taste + " " + origin + " " + price);
    }
}