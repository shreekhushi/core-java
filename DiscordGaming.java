class DiscordGaming{
	public static void logIn(String email, String password){
		System.out.println("DiscordGaming login using email and password");
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, String verificationToken){
		System.out.println("DiscordGaming login using mobile and verificationToken");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Verification Token: " + verificationToken);
	}

	public static void main(String[] args){
		logIn("discord@gmail.com","discord@123");
		logIn(8296897154L,"TOKEN456");
	}
}