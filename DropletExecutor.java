class DropletExecutor {
    public static void main(String[] args) {

        
        Droplet d1 = new Droplet();
        Droplet d2 = new Droplet("Blue");
        Droplet d3 = new Droplet("Red", 2.5);
        Droplet d4 = new Droplet("Green", 3.2, "Round");
        Droplet d5 = new Droplet("Yellow", 1.5, "Oval", "Liquid");
        Droplet d6 = new Droplet("White", 2.0, "Sphere", "Liquid", 10);

        d1.display();
        d2.display();
        d3.display();
        d4.display();
        d5.display();
        d6.display();

    }
}