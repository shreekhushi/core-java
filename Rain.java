class Rain {
    String type;
    double intensity;
    String season;
    String location;
    int duration;

    Rain() {
        System.out.println("Rain default constructor");
    }

    Rain(String type) {
        this.type = type;
    }

    Rain(String type, double intensity) {
        this.type = type;
        this.intensity = intensity;
    }

    Rain(String type, double intensity, String season) {
        this.type = type;
        this.intensity = intensity;
        this.season = season;
    }

    Rain(String type, double intensity, String season, String location) {
        this.type = type;
        this.intensity = intensity;
        this.season = season;
        this.location = location;
    }

    Rain(String type, double intensity, String season, String location, int duration) {
        this.type = type;
        this.intensity = intensity;
        this.season = season;
        this.location = location;
        this.duration = duration;
    }

    void display() {
        System.out.println(type + " " + intensity + " " + season + " " + location + " " + duration);
    }
}