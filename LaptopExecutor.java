class LaptopExecutor{
	
	public static void main(String[] l){
		
		Laptop laptopOne = new Laptop();
		laptopOne.laptopId = 1;
		laptopOne.brand = "Dell";
		laptopOne.processor = "i5";
		laptopOne.ram = 8;
		laptopOne.price = 50000;
		
		Laptop laptopTwo = new Laptop();
		laptopTwo.laptopId = 2;
		laptopTwo.brand = "HP";
		laptopTwo.processor = "i7";
		laptopTwo.ram = 16;
		laptopTwo.price = 70000;
		
		Laptop laptopThree = new Laptop();
		laptopThree.laptopId = 3;
		laptopThree.brand = "Lenovo";
		laptopThree.processor = "Ryzen 5";
		laptopThree.ram = 8;
		laptopThree.price = 55000;
		
		Laptop laptopFour = new Laptop();
		laptopFour.laptopId = 4;
		laptopFour.brand = "Asus";
		laptopFour.processor = "i3";
		laptopFour.ram = 4;
		laptopFour.price = 35000;
		
		Laptop laptopFive = new Laptop();
		laptopFive.laptopId = 5;
		laptopFive.brand = "Acer";
		laptopFive.processor = "i5";
		laptopFive.ram = 8;
		laptopFive.price = 48000;
		
		Laptop laptopSix = new Laptop();
		laptopSix.laptopId = 6;
		laptopSix.brand = "Apple";
		laptopSix.processor = "M1";
		laptopSix.ram = 8;
		laptopSix.price = 90000;
		
		Laptop laptopSeven = new Laptop();
		laptopSeven.laptopId = 7;
		laptopSeven.brand = "MSI";
		laptopSeven.processor = "i7";
		laptopSeven.ram = 16;
		laptopSeven.price = 85000;
		
		Laptop laptopEight = new Laptop();
		laptopEight.laptopId = 8;
		laptopEight.brand = "Samsung";
		laptopEight.processor = "i5";
		laptopEight.ram = 8;
		laptopEight.price = 60000;
		
		Laptop laptopNine = new Laptop();
		laptopNine.laptopId = 9;
		laptopNine.brand = "LG";
		laptopNine.processor = "i3";
		laptopNine.ram = 4;
		laptopNine.price = 40000;
		
		Laptop laptopTen = new Laptop();
		laptopTen.laptopId = 10;
		laptopTen.brand = "Razer";
		laptopTen.processor = "i9";
		laptopTen.ram = 32;
		laptopTen.price = 150000;
		
		Laptop laptopEleven = new Laptop();
		laptopEleven.laptopId = 11;
		laptopEleven.brand = "Huawei";
		laptopEleven.processor = "i5";
		laptopEleven.ram = 8;
		laptopEleven.price = 65000;
		
		Laptop laptopTwelve = new Laptop();
		laptopTwelve.laptopId = 12;
		laptopTwelve.brand = "Sony";
		laptopTwelve.processor = "i7";
		laptopTwelve.ram = 16;
		laptopTwelve.price = 95000;
		
		Laptop laptopThirteen = new Laptop();
		laptopThirteen.laptopId = 13;
		laptopThirteen.brand = "Toshiba";
		laptopThirteen.processor = "i3";
		laptopThirteen.ram = 4;
		laptopThirteen.price = 30000;
		
		Laptop laptopFourteen = new Laptop();
		laptopFourteen.laptopId = 14;
		laptopFourteen.brand = "Microsoft";
		laptopFourteen.processor = "i7";
		laptopFourteen.ram = 16;
		laptopFourteen.price = 120000;
		
		Laptop laptopFifteen = new Laptop();
		laptopFifteen.laptopId = 15;
		laptopFifteen.brand = "Alienware";
		laptopFifteen.processor = "i9";
		laptopFifteen.ram = 32;
		laptopFifteen.price = 200000;
		
		
		Laptop laptop[] = new Laptop[15];
		laptop[0] = laptopOne;
		laptop[1] = laptopTwo;
		laptop[2] = laptopThree;
		laptop[3] = laptopFour;
		laptop[4] = laptopFive;
		laptop[5] = laptopSix;
		laptop[6] = laptopSeven;
		laptop[7] = laptopEight;
		laptop[8] = laptopNine;
		laptop[9] = laptopTen;
		laptop[10] = laptopEleven;
		laptop[11] = laptopTwelve;
		laptop[12] = laptopThirteen;
		laptop[13] = laptopFourteen;
		laptop[14] = laptopFifteen;
		
		
		for(Laptop details : laptop){
			System.out.println(details.laptopId);
			System.out.println(details.brand);
			System.out.println(details.processor);
			System.out.println(details.ram);
			System.out.println(details.price);
			System.out.println("---------------");
		}
	}
}