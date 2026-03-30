class Clip {
    String type;
    String color;
    String material;
    double size;
    int quantity;

    Clip() {
        System.out.println("Clip default constructor");
    }

    Clip(String type) {
        this.type = type;
    }

    Clip(String type, String color) {
        this.type = type;
        this.color = color;
    }

    Clip(String type, String color, String material) {
        this.type = type;
        this.color = color;
        this.material = material;
    }

    Clip(String type, String color, String material, double size) {
        this.type = type;
        this.color = color;
        this.material = material;
        this.size = size;
    }

    Clip(String type, String color, String material, double size, int quantity) {
        this.type = type;
        this.color = color;
        this.material = material;
        this.size = size;
        this.quantity = quantity;
    }

    void display() {
        System.out.println(type + " " + color + " " + material + " " + size + " " + quantity);
    }
}