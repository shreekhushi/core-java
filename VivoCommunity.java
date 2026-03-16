class VivoCommunity{
	public static void logIn(String email, String password){
		System.out.println("VivoCommunity login using email and password");
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, String verificationCode){
		System.out.println("VivoCommunity login using mobile and verificationCode");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Verification Code: " + verificationCode);
	}

	public static void main(String[] args){
		logIn("vivo@gmail.com","vivo@123");
		logIn(8296897154L,"VER789");
	}
}