class Brilliant{
	public static void logIn(String email, String password){
		System.out.println("Brilliant login using email and password");
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}

	public static void logIn(long mobileNumber, int otp){
		System.out.println("Brilliant login using mobile and OTP");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("OTP: " + otp);
	}

	public static void main(String[] args){
		logIn("brilliant@gmail.com","brill@123");
		logIn(8296897154L,6789);
	}
}