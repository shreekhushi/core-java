class Restaurant{

    String restaurantName;
    String location;
    String cuisineType;
    int seatingCapacity;
    double rating;

    Chef chef; 

    public void getRestaurantDetails() {
        System.out.println("Restaurant Details:");
        System.out.println("Restaurant Name: " + restaurantName);
        System.out.println("Location: " + location);
        System.out.println("Cuisine Type: " + cuisineType);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Rating: " + rating);
        System.out.println("--------------------------------");

        chef.getChefDetails();

    }
}