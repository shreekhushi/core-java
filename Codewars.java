class Codewars{
	public static void logIn(String email, String password){
		System.out.println("Codewars login using email and password");
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}

	public static void logIn(long mobileNumber, String captcha){
		System.out.println("Codewars login using mobile and captcha");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Captcha: " + captcha);
	}

	public static void main(String[] args){
		logIn("codewars@gmail.com","wars@123");
		logIn(8296897154L,"CAP456");
	}
}