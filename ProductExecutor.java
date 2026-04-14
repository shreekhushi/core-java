class ProductExecutor{
	
	public static void main(String[] p){
		
		Product productOne = new Product();
		productOne.productId = 1;
		productOne.name = "Laptop";
		productOne.price = 50000;
		productOne.quantity = 10;
		productOne.category = "Electronics";
		
		Product productTwo = new Product();
		productTwo.productId = 2;
		productTwo.name = "Mobile";
		productTwo.price = 20000;
		productTwo.quantity = 20;
		productTwo.category = "Electronics";
		
		Product productThree = new Product();
		productThree.productId = 3;
		productThree.name = "Chair";
		productThree.price = 3000;
		productThree.quantity = 15;
		productThree.category = "Furniture";
		
		Product productFour = new Product();
		productFour.productId = 4;
		productFour.name = "Table";
		productFour.price = 7000;
		productFour.quantity = 8;
		productFour.category = "Furniture";
		
		Product productFive = new Product();
		productFive.productId = 5;
		productFive.name = "Shoes";
		productFive.price = 2500;
		productFive.quantity = 25;
		productFive.category = "Fashion";
		
		Product productSix = new Product();
		productSix.productId = 6;
		productSix.name = "Watch";
		productSix.price = 5000;
		productSix.quantity = 18;
		productSix.category = "Accessories";
		
		Product productSeven = new Product();
		productSeven.productId = 7;
		productSeven.name = "Bag";
		productSeven.price = 1500;
		productSeven.quantity = 30;
		productSeven.category = "Fashion";
		
		Product productEight = new Product();
		productEight.productId = 8;
		productEight.name = "Headphones";
		productEight.price = 2000;
		productEight.quantity = 22;
		productEight.category = "Electronics";
		
		Product productNine = new Product();
		productNine.productId = 9;
		productNine.name = "Keyboard";
		productNine.price = 1200;
		productNine.quantity = 17;
		productNine.category = "Electronics";
		
		Product productTen = new Product();
		productTen.productId = 10;
		productTen.name = "Mouse";
		productTen.price = 800;
		productTen.quantity = 35;
		productTen.category = "Electronics";
		
		Product productEleven = new Product();
		productEleven.productId = 11;
		productEleven.name = "Bottle";
		productEleven.price = 300;
		productEleven.quantity = 40;
		productEleven.category = "Home";
		
		Product productTwelve = new Product();
		productTwelve.productId = 12;
		productTwelve.name = "Notebook";
		productTwelve.price = 100;
		productTwelve.quantity = 50;
		productTwelve.category = "Stationery";
		
		Product productThirteen = new Product();
		productThirteen.productId = 13;
		productThirteen.name = "Pen";
		productThirteen.price = 20;
		productThirteen.quantity = 100;
		productThirteen.category = "Stationery";
		
		Product productFourteen = new Product();
		productFourteen.productId = 14;
		productFourteen.name = "Fan";
		productFourteen.price = 2500;
		productFourteen.quantity = 12;
		productFourteen.category = "Home Appliances";
		
		Product productFifteen = new Product();
		productFifteen.productId = 15;
		productFifteen.name = "AC";
		productFifteen.price = 35000;
		productFifteen.quantity = 5;
		productFifteen.category = "Home Appliances";
		
		
		Product product[] = new Product[15];
		product[0] = productOne;
		product[1] = productTwo;
		product[2] = productThree;
		product[3] = productFour;
		product[4] = productFive;
		product[5] = productSix;
		product[6] = productSeven;
		product[7] = productEight;
		product[8] = productNine;
		product[9] = productTen;
		product[10] = productEleven;
		product[11] = productTwelve;
		product[12] = productThirteen;
		product[13] = productFourteen;
		product[14] = productFifteen;
		
		
		for(Product details : product){
			System.out.println(details.productId);
			System.out.println(details.name);
			System.out.println(details.price);
			System.out.println(details.quantity);
			System.out.println(details.category);
			System.out.println("---------------");
		}
	}
}