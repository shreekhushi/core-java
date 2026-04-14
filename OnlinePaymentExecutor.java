class OnlinePaymentExecutor{
	
	public static void main(String[] p){
		
		OnlinePayment paymentOne = new OnlinePayment();
		paymentOne.paymentId = 1;
		paymentOne.paymentMethod = "UPI";
		paymentOne.amount = 500;
		paymentOne.paymentDate = "01-01-2024";
		paymentOne.transactionStatus = "Success";
		
		OnlinePayment paymentTwo = new OnlinePayment();
		paymentTwo.paymentId = 2;
		paymentTwo.paymentMethod = "Credit Card";
		paymentTwo.amount = 1500;
		paymentTwo.paymentDate = "02-01-2024";
		paymentTwo.transactionStatus = "Success";
		
		OnlinePayment paymentThree = new OnlinePayment();
		paymentThree.paymentId = 3;
		paymentThree.paymentMethod = "Debit Card";
		paymentThree.amount = 2000;
		paymentThree.paymentDate = "03-01-2024";
		paymentThree.transactionStatus = "Failed";
		
		OnlinePayment paymentFour = new OnlinePayment();
		paymentFour.paymentId = 4;
		paymentFour.paymentMethod = "Net Banking";
		paymentFour.amount = 3000;
		paymentFour.paymentDate = "04-01-2024";
		paymentFour.transactionStatus = "Success";
		
		OnlinePayment paymentFive = new OnlinePayment();
		paymentFive.paymentId = 5;
		paymentFive.paymentMethod = "UPI";
		paymentFive.amount = 750;
		paymentFive.paymentDate = "05-01-2024";
		paymentFive.transactionStatus = "Pending";
		
		OnlinePayment paymentSix = new OnlinePayment();
		paymentSix.paymentId = 6;
		paymentSix.paymentMethod = "Credit Card";
		paymentSix.amount = 2200;
		paymentSix.paymentDate = "06-01-2024";
		paymentSix.transactionStatus = "Success";
		
		OnlinePayment paymentSeven = new OnlinePayment();
		paymentSeven.paymentId = 7;
		paymentSeven.paymentMethod = "Debit Card";
		paymentSeven.amount = 1800;
		paymentSeven.paymentDate = "07-01-2024";
		paymentSeven.transactionStatus = "Failed";
		
		OnlinePayment paymentEight = new OnlinePayment();
		paymentEight.paymentId = 8;
		paymentEight.paymentMethod = "UPI";
		paymentEight.amount = 950;
		paymentEight.paymentDate = "08-01-2024";
		paymentEight.transactionStatus = "Success";
		
		OnlinePayment paymentNine = new OnlinePayment();
		paymentNine.paymentId = 9;
		paymentNine.paymentMethod = "Net Banking";
		paymentNine.amount = 4000;
		paymentNine.paymentDate = "09-01-2024";
		paymentNine.transactionStatus = "Success";
		
		OnlinePayment paymentTen = new OnlinePayment();
		paymentTen.paymentId = 10;
		paymentTen.paymentMethod = "UPI";
		paymentTen.amount = 650;
		paymentTen.paymentDate = "10-01-2024";
		paymentTen.transactionStatus = "Pending";
		
		OnlinePayment paymentEleven = new OnlinePayment();
		paymentEleven.paymentId = 11;
		paymentEleven.paymentMethod = "Credit Card";
		paymentEleven.amount = 5000;
		paymentEleven.paymentDate = "11-01-2024";
		paymentEleven.transactionStatus = "Success";
		
		OnlinePayment paymentTwelve = new OnlinePayment();
		paymentTwelve.paymentId = 12;
		paymentTwelve.paymentMethod = "Debit Card";
		paymentTwelve.amount = 1200;
		paymentTwelve.paymentDate = "12-01-2024";
		paymentTwelve.transactionStatus = "Failed";
		
		OnlinePayment paymentThirteen = new OnlinePayment();
		paymentThirteen.paymentId = 13;
		paymentThirteen.paymentMethod = "UPI";
		paymentThirteen.amount = 850;
		paymentThirteen.paymentDate = "13-01-2024";
		paymentThirteen.transactionStatus = "Success";
		
		OnlinePayment paymentFourteen = new OnlinePayment();
		paymentFourteen.paymentId = 14;
		paymentFourteen.paymentMethod = "Net Banking";
		paymentFourteen.amount = 2750;
		paymentFourteen.paymentDate = "14-01-2024";
		paymentFourteen.transactionStatus = "Success";
		
		OnlinePayment paymentFifteen = new OnlinePayment();
		paymentFifteen.paymentId = 15;
		paymentFifteen.paymentMethod = "Credit Card";
		paymentFifteen.amount = 3200;
		paymentFifteen.paymentDate = "15-01-2024";
		paymentFifteen.transactionStatus = "Pending";
		
		
		OnlinePayment payment[] = new OnlinePayment[15];
		payment[0] = paymentOne;
		payment[1] = paymentTwo;
		payment[2] = paymentThree;
		payment[3] = paymentFour;
		payment[4] = paymentFive;
		payment[5] = paymentSix;
		payment[6] = paymentSeven;
		payment[7] = paymentEight;
		payment[8] = paymentNine;
		payment[9] = paymentTen;
		payment[10] = paymentEleven;
		payment[11] = paymentTwelve;
		payment[12] = paymentThirteen;
		payment[13] = paymentFourteen;
		payment[14] = paymentFifteen;
		
		
		for(OnlinePayment details : payment){
			System.out.println(details.paymentId);
			System.out.println(details.paymentMethod);
			System.out.println(details.amount);
			System.out.println(details.paymentDate);
			System.out.println(details.transactionStatus);
			System.out.println("---------------");
		}
	}
}