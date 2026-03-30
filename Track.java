class Track{
    String type;
    double length;
    String location;
    String surface;
    int lanes;

    Track() {
        System.out.println("Track default constructor");
    }

    Track(String type) {
        this.type = type;
    }

    Track(String type, double length) {
        this.type = type;
        this.length = length;
    }

    Track(String type, double length, String location) {
        this.type = type;
        this.length = length;
        this.location = location;
    }

    Track(String type, double length, String location, String surface) {
        this.type = type;
        this.length = length;
        this.location = location;
        this.surface = surface;
    }

    Track(String type, double length, String location, String surface, int lanes) {
        this.type = type;
        this.length = length;
        this.location = location;
        this.surface = surface;
        this.lanes = lanes;
    }

    void display() {
        System.out.println(type + " " + length + " " + location + " " + surface + " " + lanes);
    }
}