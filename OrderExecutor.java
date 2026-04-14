class OrderExecutor{
	
	public static void main(String[] o){
		
		Order orderOne = new Order();
		orderOne.orderId = 1;
		orderOne.orderDate = "01-01-2024";
		orderOne.totalAmount = 1500;
		orderOne.status = "Delivered";
		orderOne.customerName = "Rahul";
		
		Order orderTwo = new Order();
		orderTwo.orderId = 2;
		orderTwo.orderDate = "02-01-2024";
		orderTwo.totalAmount = 2500;
		orderTwo.status = "Pending";
		orderTwo.customerName = "Amit";
		
		Order orderThree = new Order();
		orderThree.orderId = 3;
		orderThree.orderDate = "03-01-2024";
		orderThree.totalAmount = 1800;
		orderThree.status = "Shipped";
		orderThree.customerName = "Sneha";
		
		Order orderFour = new Order();
		orderFour.orderId = 4;
		orderFour.orderDate = "04-01-2024";
		orderFour.totalAmount = 3200;
		orderFour.status = "Delivered";
		orderFour.customerName = "Kiran";
		
		Order orderFive = new Order();
		orderFive.orderId = 5;
		orderFive.orderDate = "05-01-2024";
		orderFive.totalAmount = 4100;
		orderFive.status = "Cancelled";
		orderFive.customerName = "Anjali";
		
		Order orderSix = new Order();
		orderSix.orderId = 6;
		orderSix.orderDate = "06-01-2024";
		orderSix.totalAmount = 900;
		orderSix.status = "Delivered";
		orderSix.customerName = "Ravi";
		
		Order orderSeven = new Order();
		orderSeven.orderId = 7;
		orderSeven.orderDate = "07-01-2024";
		orderSeven.totalAmount = 2200;
		orderSeven.status = "Pending";
		orderSeven.customerName = "Priya";
		
		Order orderEight = new Order();
		orderEight.orderId = 8;
		orderEight.orderDate = "08-01-2024";
		orderEight.totalAmount = 1750;
		orderEight.status = "Shipped";
		orderEight.customerName = "Arjun";
		
		Order orderNine = new Order();
		orderNine.orderId = 9;
		orderNine.orderDate = "09-01-2024";
		orderNine.totalAmount = 2600;
		orderNine.status = "Delivered";
		orderNine.customerName = "Meena";
		
		Order orderTen = new Order();
		orderTen.orderId = 10;
		orderTen.orderDate = "10-01-2024";
		orderTen.totalAmount = 3050;
		orderTen.status = "Pending";
		orderTen.customerName = "Sanjay";
		
		Order orderEleven = new Order();
		orderEleven.orderId = 11;
		orderEleven.orderDate = "11-01-2024";
		orderEleven.totalAmount = 4200;
		orderEleven.status = "Delivered";
		orderEleven.customerName = "Kavya";
		
		Order orderTwelve = new Order();
		orderTwelve.orderId = 12;
		orderTwelve.orderDate = "12-01-2024";
		orderTwelve.totalAmount = 1500;
		orderTwelve.status = "Cancelled";
		orderTwelve.customerName = "Ramesh";
		
		Order orderThirteen = new Order();
		orderThirteen.orderId = 13;
		orderThirteen.orderDate = "13-01-2024";
		orderThirteen.totalAmount = 2750;
		orderThirteen.status = "Shipped";
		orderThirteen.customerName = "Pooja";
		
		Order orderFourteen = new Order();
		orderFourteen.orderId = 14;
		orderFourteen.orderDate = "14-01-2024";
		orderFourteen.totalAmount = 3600;
		orderFourteen.status = "Delivered";
		orderFourteen.customerName = "Vikram";
		
		Order orderFifteen = new Order();
		orderFifteen.orderId = 15;
		orderFifteen.orderDate = "15-01-2024";
		orderFifteen.totalAmount = 1900;
		orderFifteen.status = "Pending";
		orderFifteen.customerName = "Neha";
		
		
		Order order[] = new Order[15];
		order[0] = orderOne;
		order[1] = orderTwo;
		order[2] = orderThree;
		order[3] = orderFour;
		order[4] = orderFive;
		order[5] = orderSix;
		order[6] = orderSeven;
		order[7] = orderEight;
		order[8] = orderNine;
		order[9] = orderTen;
		order[10] = orderEleven;
		order[11] = orderTwelve;
		order[12] = orderThirteen;
		order[13] = orderFourteen;
		order[14] = orderFifteen;
		
		
		for(Order details : order){
			System.out.println(details.orderId);
			System.out.println(details.orderDate);
			System.out.println(details.totalAmount);
			System.out.println(details.status);
			System.out.println(details.customerName);
			System.out.println("---------------");
		}
	}
}