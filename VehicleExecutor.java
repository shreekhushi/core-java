class VehicleExecutor{
	
	public static void main(String[] v){
		
		Vehicle vehicleOne = new Vehicle();
		vehicleOne.vehicleId = 1;
		vehicleOne.type = "Car";
		vehicleOne.brand = "Toyota";
		vehicleOne.speed = 80 ;
		vehicleOne.color = "Sky Blue";
		
		Vehicle vehicleTwo = new Vehicle();
		vehicleTwo.vehicleId = 2;
		vehicleTwo.type = "Bike";
		vehicleTwo.brand = "Honda";
		vehicleTwo.speed = 90 ;
		vehicleTwo.color = "Blue";
		
		Vehicle vehicleThree = new Vehicle();
		vehicleThree.vehicleId = 3;
		vehicleThree.type = "Truck";
		vehicleThree.brand = "Ford";
		vehicleThree.speed = 100 ;
		vehicleThree.color = "Maroon";
		
		Vehicle vehicleFour = new Vehicle();
		vehicleFour.vehicleId = 4;
		vehicleFour.type = "Bus";
		vehicleFour.brand = "BMW";
		vehicleFour.speed = 110 ;
		vehicleFour.color = "Golden";
		
		Vehicle vehicleFive = new Vehicle();
		vehicleFive.vehicleId = 1;
		vehicleFive.type = "Scooter";
		vehicleFive.brand = "Hyundai";
		vehicleFive.speed = 120 ;
		vehicleFive.color = "Red";
		
		Vehicle vehicleSix = new Vehicle();
		vehicleSix.vehicleId = 1;
		vehicleSix.type = "Van";
		vehicleSix.brand = "Tata";
		vehicleSix.speed = 120 ;
		vehicleSix.color = "Blue";
		
		Vehicle vehicleSeven = new Vehicle();
		vehicleSeven.vehicleId = 1;
		vehicleSeven.type = "Auto";
		vehicleSeven.brand = "Mahindra";
		vehicleSeven.speed = 130 ;
		vehicleSeven.color = "Black";
		
		Vehicle vehicleEight = new Vehicle();
		vehicleEight.vehicleId = 1;
		vehicleEight.type = "Jeep";
		vehicleEight.brand = "Kia";
		vehicleEight.speed = 140 ;
		vehicleEight.color = "Black";
		
		Vehicle vehicleNine = new Vehicle();
		vehicleNine.vehicleId = 1;
		vehicleNine.type = "Cycle";
		vehicleNine.brand = "Coimbatore";
		vehicleNine.speed = 150 ;
		vehicleNine.color = "Grey";
		
		Vehicle vehicleTen = new Vehicle();
		vehicleTen.vehicleId = 1;
		vehicleTen.type = "Electric Car";
		vehicleTen.brand = "Suzuki";
		vehicleTen.speed = 160 ;
		vehicleTen.color = "Silver";
		
		Vehicle vehicleEleven = new Vehicle();
		vehicleEleven.vehicleId = 1;
		vehicleEleven.type = "Electric Bike";
		vehicleEleven.brand = "Nissan";
		vehicleEleven.speed = 170 ;
		vehicleEleven.color = "Green";
		
		Vehicle vehicleTwelve = new Vehicle();
		vehicleTwelve.vehicleId = 1;
		vehicleTwelve.type = "Mini Truck";
		vehicleTwelve.brand = "Chevrolet";
		vehicleTwelve.speed = 180 ;
		vehicleTwelve.color = "Yellow";
		
		Vehicle vehicleThirteen = new Vehicle();
		vehicleThirteen.vehicleId = 1;
		vehicleThirteen.type = "Luxury Car";
		vehicleThirteen.brand = "Mercedes";
		vehicleThirteen.speed = 200 ;
		vehicleThirteen.color = "Orange";
		
		Vehicle vehicleFourteen = new Vehicle();
		vehicleFourteen.vehicleId = 14;
		vehicleFourteen.type = "Sports Bikee";
		vehicleFourteen.brand = "Volkswagen";
		vehicleFourteen.speed = 190 ;
		vehicleFourteen.color = "Brown";
		
		Vehicle vehicleFifteen = new Vehicle();
		vehicleFifteen.vehicleId = 15;
		vehicleFifteen.type = "Pickup Truck";
		vehicleFifteen.brand = "Renault";
		vehicleFifteen.speed = 100 ;
		vehicleFifteen.color = "Purple";
		
		
		Vehicle vehicle[] = new Vehicle[15];
		vehicle[0] = vehicleOne;
		vehicle[1] = vehicleTwo;
		vehicle[2] = vehicleThree;
		vehicle[3] = vehicleFour;
		vehicle[4] = vehicleFive;
		vehicle[5] = vehicleSix;
		vehicle[6] = vehicleSeven;
		vehicle[7] = vehicleEight;
		vehicle[8] = vehicleNine;
		vehicle[9] = vehicleTen;
		vehicle[10] = vehicleEleven;
		vehicle[11] = vehicleTwelve;
		vehicle[12] = vehicleThirteen;
		vehicle[13] = vehicleFourteen;
		vehicle[14] = vehicleFifteen;
		
		
		for(Vehicle details : vehicle){
			System.out.println(details.vehicleId);
			System.out.println(details.type);
			System.out.println(details.brand);
			System.out.println(details.speed);
			System.out.println(details.color);
			System.out.println("---------------");
		}
	}
}