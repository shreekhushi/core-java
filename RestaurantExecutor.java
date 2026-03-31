class RestaurantExecutor{

    public static void main(String[] args) {

        Restaurant r1 = new Restaurant();
        r1.restaurantName = "Spice Garden";
        r1.location = "Bangalore";
        r1.cuisineType = "Indian";
        r1.seatingCapacity = 80;
        r1.rating = 4.5;

        Chef c1 = new Chef();
        c1.chefId = 1;
        c1.name = "Ravi";
        c1.specialization = "South Indian";
        c1.experience = 10;
        c1.salary = 50000;

        r1.chef = c1;
        r1.getRestaurantDetails();


        Restaurant r2 = new Restaurant();
        r2.restaurantName = "Food Palace";
        r2.location = "Hyderabad";
        r2.cuisineType = "Biryani";
        r2.seatingCapacity = 100;
        r2.rating = 4.7;

        Chef c2 = new Chef();
        c2.chefId = 2;
        c2.name = "Imran";
        c2.specialization = "Hyderabadi Biryani";
        c2.experience = 12;
        c2.salary = 60000;

        r2.chef = c2;
        r2.getRestaurantDetails();


        Restaurant r3 = new Restaurant();
        r3.restaurantName = "Ocean Delight";
        r3.location = "Chennai";
        r3.cuisineType = "Seafood";
        r3.seatingCapacity = 70;
        r3.rating = 4.3;

        Chef c3 = new Chef();
        c3.chefId = 3;
        c3.name = "Arjun";
        c3.specialization = "Seafood";
        c3.experience = 8;
        c3.salary = 45000;

        r3.chef = c3;
        r3.getRestaurantDetails();


        Restaurant r4 = new Restaurant();
        r4.restaurantName = "Urban Tadka";
        r4.location = "Mumbai";
        r4.cuisineType = "North Indian";
        r4.seatingCapacity = 120;
        r4.rating = 4.6;

        Chef c4 = new Chef();
        c4.chefId = 4;
        c4.name = "Priya";
        c4.specialization = "Punjabi";
        c4.experience = 9;
        c4.salary = 55000;

        r4.chef = c4;
        r4.getRestaurantDetails();


        Restaurant r5 = new Restaurant();
        r5.restaurantName = "Green Bowl";
        r5.location = "Pune";
        r5.cuisineType = "Healthy";
        r5.seatingCapacity = 60;
        r5.rating = 4.2;

        Chef c5 = new Chef();
        c5.chefId = 5;
        c5.name = "Kiran";
        c5.specialization = "Salads";
        c5.experience = 7;
        c5.salary = 40000;

        r5.chef = c5;
        r5.getRestaurantDetails();


        Restaurant r6 = new Restaurant();
        r6.restaurantName = "Grill House";
        r6.location = "Delhi";
        r6.cuisineType = "Barbecue";
        r6.seatingCapacity = 110;
        r6.rating = 4.4;

        Chef c6 = new Chef();
        c6.chefId = 6;
        c6.name = "Ramesh";
        c6.specialization = "Grilling";
        c6.experience = 11;
        c6.salary = 58000;

        r6.chef = c6;
        r6.getRestaurantDetails();


        Restaurant r7 = new Restaurant();
        r7.restaurantName = "Taste of Kerala";
        r7.location = "Kochi";
        r7.cuisineType = "Kerala";
        r7.seatingCapacity = 75;
        r7.rating = 4.5;

        Chef c7 = new Chef();
        c7.chefId = 7;
        c7.name = "Meena";
        c7.specialization = "Kerala Cuisine";
        c7.experience = 6;
        c7.salary = 42000;

        r7.chef = c7;
        r7.getRestaurantDetails();


        Restaurant r8 = new Restaurant();
        r8.restaurantName = "Royal Feast";
        r8.location = "Kolkata";
        r8.cuisineType = "Bengali";
        r8.seatingCapacity = 90;
        r8.rating = 4.3;

        Chef c8 = new Chef();
        c8.chefId = 8;
        c8.name = "Suresh";
        c8.specialization = "Bengali Cuisine";
        c8.experience = 8;
        c8.salary = 47000;

        r8.chef = c8;
        r8.getRestaurantDetails();


        Restaurant r9 = new Restaurant();
        r9.restaurantName = "Spicy Hub";
        r9.location = "Ahmedabad";
        r9.cuisineType = "Gujarati";
        r9.seatingCapacity = 65;
        r9.rating = 4.1;

        Chef c9 = new Chef();
        c9.chefId = 9;
        c9.name = "Anjali";
        c9.specialization = "Gujarati Thali";
        c9.experience = 7;
        c9.salary = 43000;

        r9.chef = c9;
        r9.getRestaurantDetails();


        Restaurant r10 = new Restaurant();
        r10.restaurantName = "Desert King";
        r10.location = "Jaipur";
        r10.cuisineType = "Rajasthani";
        r10.seatingCapacity = 85;
        r10.rating = 4.6;

        Chef c10 = new Chef();
        c10.chefId = 10;
        c10.name = "Deepak";
        c10.specialization = "Rajasthani";
        c10.experience = 10;
        c10.salary = 52000;

        r10.chef = c10;
        r10.getRestaurantDetails();

        Restaurant r11 = new Restaurant();
        r11.restaurantName = "Street Eats";
        r11.location = "Nagpur";
        r11.cuisineType = "Fast Food";
        r11.seatingCapacity = 50;
        r11.rating = 4.0;

        Chef c11 = new Chef();
        c11.chefId = 11;
        c11.name = "Vikram";
        c11.specialization = "Snacks";
        c11.experience = 5;
        c11.salary = 35000;

        r11.chef = c11;
        r11.getRestaurantDetails();


        Restaurant r12 = new Restaurant();
        r12.restaurantName = "Veg Delight";
        r12.location = "Bhopal";
        r12.cuisineType = "Vegetarian";
        r12.seatingCapacity = 70;
        r12.rating = 4.2;

        Chef c12 = new Chef();
        c12.chefId = 12;
        c12.name = "Pooja";
        c12.specialization = "Veg Cuisine";
        c12.experience = 6;
        c12.salary = 40000;

        r12.chef = c12;
        r12.getRestaurantDetails();


        Restaurant r13 = new Restaurant();
        r13.restaurantName = "Tandoori Nights";
        r13.location = "Lucknow";
        r13.cuisineType = "Mughlai";
        r13.seatingCapacity = 95;
        r13.rating = 4.5;

        Chef c13 = new Chef();
        c13.chefId = 13;
        c13.name = "Manoj";
        c13.specialization = "Tandoor";
        c13.experience = 9;
        c13.salary = 50000;

        r13.chef = c13;
        r13.getRestaurantDetails();


        Restaurant r14 = new Restaurant();
        r14.restaurantName = "Fusion Hub";
        r14.location = "Indore";
        r14.cuisineType = "Fusion";
        r14.seatingCapacity = 80;
        r14.rating = 4.3;

        Chef c14 = new Chef();
        c14.chefId = 14;
        c14.name = "Kavya";
        c14.specialization = "Fusion Dishes";
        c14.experience = 7;
        c14.salary = 45000;

        r14.chef = c14;
        r14.getRestaurantDetails();


        Restaurant r15 = new Restaurant();
        r15.restaurantName = "Urban Cafe";
        r15.location = "Surat";
        r15.cuisineType = "Cafe";
        r15.seatingCapacity = 60;
        r15.rating = 4.4;

        Chef c15 = new Chef();
        c15.chefId = 15;
        c15.name = "Nithin";
        c15.specialization = "Beverages";
        c15.experience = 5;
        c15.salary = 38000;

        r15.chef = c15;
        r15.getRestaurantDetails();


        Restaurant r16 = new Restaurant();
        r16.restaurantName = "Food Junction";
        r16.location = "Trichy";
        r16.cuisineType = "Multi-Cuisine";
        r16.seatingCapacity = 75;
        r16.rating = 4.2;

        Chef c16 = new Chef();
        c16.chefId = 16;
        c16.name = "Divya";
        c16.specialization = "Multi Cuisine";
        c16.experience = 6;
        c16.salary = 42000;

        r16.chef = c16;
        r16.getRestaurantDetails();


        Restaurant r17 = new Restaurant();
        r17.restaurantName = "Grill Master";
        r17.location = "Vizag";
        r17.cuisineType = "Barbecue";
        r17.seatingCapacity = 100;
        r17.rating = 4.6;

        Chef c17 = new Chef();
        c17.chefId = 17;
        c17.name = "Rohit";
        c17.specialization = "Grilling";
        c17.experience = 10;
        c17.salary = 55000;

        r17.chef = c17;
        r17.getRestaurantDetails();


        Restaurant r18 = new Restaurant();
        r18.restaurantName = "Spice Route";
        r18.location = "Patna";
        r18.cuisineType = "Indian";
        r18.seatingCapacity = 85;
        r18.rating = 4.3;

        Chef c18 = new Chef();
        c18.chefId = 18;
        c18.name = "Sunita";
        c18.specialization = "North Indian";
        c18.experience = 8;
        c18.salary = 48000;

        r18.chef = c18;
        r18.getRestaurantDetails();


        Restaurant r19 = new Restaurant();
        r19.restaurantName = "Royal Kitchen";
        r19.location = "Chandigarh";
        r19.cuisineType = "Punjabi";
        r19.seatingCapacity = 90;
        r19.rating = 4.7;

        Chef c19 = new Chef();
        c19.chefId = 19;
        c19.name = "Amit";
        c19.specialization = "Punjabi";
        c19.experience = 11;
        c19.salary = 60000;

        r19.chef = c19;
        r19.getRestaurantDetails();


        Restaurant r20 = new Restaurant();
        r20.restaurantName = "Cafe Bliss";
        r20.location = "Udupi";
        r20.cuisineType = "Cafe";
        r20.seatingCapacity = 55;
        r20.rating = 4.2;

        Chef c20 = new Chef();
        c20.chefId = 20;
        c20.name = "Neha";
        c20.specialization = "Desserts";
        c20.experience = 6;
        c20.salary = 42000;

        r20.chef = c20;
        r20.getRestaurantDetails();
    }
}