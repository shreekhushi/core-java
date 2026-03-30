class Pawn{
    String color;
    String material;
    int height;
    String position;
    int value;

    Pawn() {
        System.out.println("Pawn default constructor");
    }

    Pawn(String color) {
        this.color = color;
    }

    Pawn(String color, String material) {
        this.color = color;
        this.material = material;
    }

    Pawn(String color, String material, int height) {
        this.color = color;
        this.material = material;
        this.height = height;
    }

    Pawn(String color, String material, int height, String position) {
        this.color = color;
        this.material = material;
        this.height = height;
        this.position = position;
    }

    Pawn(String color, String material, int height, String position, int value) {
        this.color = color;
        this.material = material;
        this.height = height;
        this.position = position;
        this.value = value;
    }

    void display() {
        System.out.println(color + " " + material + " " + height + " " + position + " " + value);
    }
}