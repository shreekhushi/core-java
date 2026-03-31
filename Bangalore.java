class Bangalore{

    String cityName;
    String state;
    int population;
    int pincode;
    String famousFor;

    MallOfAsia mall;

    public void getCityDetails() {
        System.out.println("City Details:");
        System.out.println("City Name: " + cityName);
        System.out.println("State: " + state);
        System.out.println("Population: " + population);
        System.out.println("Pincode: " + pincode);
        System.out.println("Famous For: " + famousFor);
        System.out.println("--------------------------------");

        mall.getMallDetails();

    }
}