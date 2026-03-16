class AppleCommunity{
	public static void logIn(String email, String password){
		System.out.println("AppleCommunity login using email and password");
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, String securityCode){
		System.out.println("AppleCommunity login using mobile and securityCode");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Security Code: " + securityCode);
	}

	public static void main(String[] args){
		logIn("apple@gmail.com","apple@123");
		logIn(8296897154L,"SEC123");
	}
}