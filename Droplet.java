class Droplet {
    String color;
    double size;
    String shape;
    String state;
    int weight;

    Droplet() {
        System.out.println("Droplet created using default constructor");
    }

    Droplet(String color) {
        this.color = color;
    }

    Droplet(String color, double size) {
        this.color = color;
        this.size = size;
    }

    Droplet(String color, double size, String shape) {
        this.color = color;
        this.size = size;
        this.shape = shape;
    }

    Droplet(String color, double size, String shape, String state) {
        this.color = color;
        this.size = size;
        this.shape = shape;
        this.state = state;
    }

    Droplet(String color, double size, String shape, String state, int weight) {
        this.color = color;
        this.size = size;
        this.shape = shape;
        this.state = state;
        this.weight = weight;
    }

    void display() {
        System.out.println(color + " " + size + " " + shape + " " + state + " " + weight);
    }
}