class HPCommunity{
	public static void logIn(String email, String password){
		System.out.println("HPCommunity login using email and password");
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, String verificationCode){
		System.out.println("HPCommunity login using mobile and verificationCode");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Verification Code: " + verificationCode);
	}

	public static void main(String[] args){
		logIn("hp@gmail.com","hp@123");
		logIn(8296897154L,"VER1234");
	}
}