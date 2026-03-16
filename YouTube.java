class YouTube{
	public static void logIn(String email, String password){
		System.out.println("YouTube login using email and password");
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}

	public static void logIn(long mobileNumber, int otp){
		System.out.println("YouTube login using mobile and OTP");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("OTP: " + otp);
	}

	public static void main(String[] args){
		logIn("youtube@gmail.com","yt@123");
		logIn(8296897154L,1234);
	}
}