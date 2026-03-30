class PowerBank {

        String brand;
        int capacity;
        String color;
        String type;
        String output;
        String input;
        String batteryType;
        double price;
		
		PowerBank(String b, int cp, String c, String t, String o, String i, String bt, double p){
			brand = b;
			capacity = cp;
			color = c;
			type = t;
			output = o;
			input = i;
			batteryType = bt;
			price = p;
		}
		
		public void displayDetails(){
		System.out.println(" Brand: " + brand);
        System.out.println(" Capacity: " + capacity);
        System.out.println(" Color: " + color);
        System.out.println(" Type: " + type);
        System.out.println(" Output: " + output);
        System.out.println(" Input: " + input);
        System.out.println(" Battery Type: " + batteryType);
        System.out.println(" Price: " + price);
		}
}