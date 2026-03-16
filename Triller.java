class Triller{
	public static void logIn(String email, String password){
		System.out.println("Triller login using email and password");
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}

	public static void logIn(long mobileNumber, int otp){
		System.out.println("Triller login using mobile and OTP");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("OTP: " + otp);
	}

	public static void main(String[] args){
		logIn("triller@gmail.com","triller@123");
		logIn(8296897154L,6666);
	}
}