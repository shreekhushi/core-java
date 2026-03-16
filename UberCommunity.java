class UberCommunity{
	public static void logIn(String email, String password){
		System.out.println("UberCommunity login using email and password");
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}

	public static void logIn(long mobileNumber, int otp){
		System.out.println("UberCommunity login using mobile and OTP");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("OTP: " + otp);
	}

	public static void main(String[] args){
		logIn("uber@gmail.com","uber@123");
		logIn(8296897154L,7890);
	}
}