class Umbrella {
    String color;
    double length;
    String type;
    String brand;
    int price;

    Umbrella() {
	}
	
    Umbrella(String color) {
	this.color = color; 
	}
	
    Umbrella(String color, double length) {
        this.color = color; 
		this.length = length;
    }
	
    Umbrella(String color, double length, String type) {
        this.color = color; 
		this.length = length; 
		this.type = type;
    }
	
    Umbrella(String color, double length, String type, String brand) {
        this.color = color; 
		this.length = length; 
		this.type = type; 
		this.brand = brand;
    }
	
    Umbrella(String color, double length, String type, String brand, int price) {
        this.color = color; 
		this.length = length;
		this.type = type; 
		this.brand = brand; 
		this.price = price;
    }

    void display() {
        System.out.println(color + " " + length + " " + type + " " + brand + " " + price);
    }
}