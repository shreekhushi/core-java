class MobileExecutor{
	
	public static void main(String[] m){
		
		Mobile mobileOne = new Mobile();
		mobileOne.mobileId = 1;
		mobileOne.brand = "Samsung";
		mobileOne.model = "Galaxy S21";
		mobileOne.price = 50000;
		mobileOne.batteryCapacity = 4000;
		
		Mobile mobileTwo = new Mobile();
		mobileTwo.mobileId = 2;
		mobileTwo.brand = "Apple";
		mobileTwo.model = "iPhone 13";
		mobileTwo.price = 70000;
		mobileTwo.batteryCapacity = 3500;
		
		Mobile mobileThree = new Mobile();
		mobileThree.mobileId = 3;
		mobileThree.brand = "OnePlus";
		mobileThree.model = "9 Pro";
		mobileThree.price = 60000;
		mobileThree.batteryCapacity = 4500;
		
		Mobile mobileFour = new Mobile();
		mobileFour.mobileId = 4;
		mobileFour.brand = "Xiaomi";
		mobileFour.model = "Redmi Note 10";
		mobileFour.price = 15000;
		mobileFour.batteryCapacity = 5000;
		
		Mobile mobileFive = new Mobile();
		mobileFive.mobileId = 5;
		mobileFive.brand = "Realme";
		mobileFive.model = "Narzo 50";
		mobileFive.price = 12000;
		mobileFive.batteryCapacity = 5000;
		
		Mobile mobileSix = new Mobile();
		mobileSix.mobileId = 6;
		mobileSix.brand = "Vivo";
		mobileSix.model = "V21";
		mobileSix.price = 25000;
		mobileSix.batteryCapacity = 4000;
		
		Mobile mobileSeven = new Mobile();
		mobileSeven.mobileId = 7;
		mobileSeven.brand = "Oppo";
		mobileSeven.model = "F19";
		mobileSeven.price = 20000;
		mobileSeven.batteryCapacity = 4500;
		
		Mobile mobileEight = new Mobile();
		mobileEight.mobileId = 8;
		mobileEight.brand = "Motorola";
		mobileEight.model = "Edge 20";
		mobileEight.price = 30000;
		mobileEight.batteryCapacity = 5000;
		
		Mobile mobileNine = new Mobile();
		mobileNine.mobileId = 9;
		mobileNine.brand = "Nokia";
		mobileNine.model = "G20";
		mobileNine.price = 13000;
		mobileNine.batteryCapacity = 5050;
		
		Mobile mobileTen = new Mobile();
		mobileTen.mobileId = 10;
		mobileTen.brand = "Asus";
		mobileTen.model = "ROG Phone";
		mobileTen.price = 55000;
		mobileTen.batteryCapacity = 6000;
		
		Mobile mobileEleven = new Mobile();
		mobileEleven.mobileId = 11;
		mobileEleven.brand = "Sony";
		mobileEleven.model = "Xperia 5";
		mobileEleven.price = 65000;
		mobileEleven.batteryCapacity = 4500;
		
		Mobile mobileTwelve = new Mobile();
		mobileTwelve.mobileId = 12;
		mobileTwelve.brand = "Lenovo";
		mobileTwelve.model = "K12";
		mobileTwelve.price = 10000;
		mobileTwelve.batteryCapacity = 5000;
		
		Mobile mobileThirteen = new Mobile();
		mobileThirteen.mobileId = 13;
		mobileThirteen.brand = "Infinix";
		mobileThirteen.model = "Hot 10";
		mobileThirteen.price = 9000;
		mobileThirteen.batteryCapacity = 5200;
		
		Mobile mobileFourteen = new Mobile();
		mobileFourteen.mobileId = 14;
		mobileFourteen.brand = "Google";
		mobileFourteen.model = "Pixel 6";
		mobileFourteen.price = 60000;
		mobileFourteen.batteryCapacity = 4600;
		
		Mobile mobileFifteen = new Mobile();
		mobileFifteen.mobileId = 15;
		mobileFifteen.brand = "Huawei";
		mobileFifteen.model = "P40";
		mobileFifteen.price = 45000;
		mobileFifteen.batteryCapacity = 4200;
		
		
		Mobile mobile[] = new Mobile[15];
		mobile[0] = mobileOne;
		mobile[1] = mobileTwo;
		mobile[2] = mobileThree;
		mobile[3] = mobileFour;
		mobile[4] = mobileFive;
		mobile[5] = mobileSix;
		mobile[6] = mobileSeven;
		mobile[7] = mobileEight;
		mobile[8] = mobileNine;
		mobile[9] = mobileTen;
		mobile[10] = mobileEleven;
		mobile[11] = mobileTwelve;
		mobile[12] = mobileThirteen;
		mobile[13] = mobileFourteen;
		mobile[14] = mobileFifteen;
		
		
		for(Mobile details : mobile){
			System.out.println(details.mobileId);
			System.out.println(details.brand);
			System.out.println(details.model);
			System.out.println(details.price);
			System.out.println(details.batteryCapacity);
			System.out.println("---------------");
		}
	}
}