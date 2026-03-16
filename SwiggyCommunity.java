class SwiggyCommunity	{
	public static void logIn(String email, String password){
		System.out.println("SwiggyCommunity login using email and password");
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}

	public static void logIn(long mobileNumber, int otp){
		System.out.println("SwiggyCommunity login using mobile and OTP");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("OTP: " + otp);
	}

	public static void main(String[] args){
		logIn("swiggy@gmail.com","swiggy@123");
		logIn(8296897154L,1234);
	}
}