class Tumblr{
	public static void logIn(String email, String password){
		System.out.println("Tumblr login using email and password");
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}

	public static void logIn(long mobileNumber, String captcha){
		System.out.println("Tumblr login using mobile and captcha");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Captcha: " + captcha);
	}

	public static void main(String[] args){
		logIn("tumblr@gmail.com","tumblr@123");
		logIn(8296897154L,"CAP456");
	}
}