class AcerCommunity{
	public static void logIn(String email, String password){
		System.out.println("AcerCommunity login using email and password");
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, int otp){
		System.out.println("AcerCommunity login using mobile and OTP");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("OTP: " + otp);
	}

	public static void main(String[] args){
		logIn("acer@gmail.com","acer@123");
		logIn(8296897154L,4567);
	}
}