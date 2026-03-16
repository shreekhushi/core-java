class Substack{
	public static void logIn(String email, String password){
		System.out.println("Substack login using email and password");
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, String captcha){
		System.out.println("Substack login using mobile and captcha");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Captcha: " + captcha);
	}

	public static void main(String[] args){
		logIn("substack@gmail.com","substack@123");
		logIn(8296897154L,"CAP789");
	}
}