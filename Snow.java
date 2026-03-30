class Snow{
    String color;
    double temperature;
    String type;
    String region;
    int thickness;

    Snow() {
        System.out.println("Snow default constructor");
    }

    Snow(String color) {
        this.color = color;
    }

    Snow(String color, double temperature) {
        this.color = color;
        this.temperature = temperature;
    }

    Snow(String color, double temperature, String type) {
        this.color = color;
        this.temperature = temperature;
        this.type = type;
    }

    Snow(String color, double temperature, String type, String region) {
        this.color = color;
        this.temperature = temperature;
        this.type = type;
        this.region = region;
    }

    Snow(String color, double temperature, String type, String region, int thickness) {
        this.color = color;
        this.temperature = temperature;
        this.type = type;
        this.region = region;
        this.thickness = thickness;
    }

    void display() {
        System.out.println(color + " " + temperature + " " + type + " " + region + " " + thickness);
    }
}   