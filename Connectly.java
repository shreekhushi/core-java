class Connectly{
	public static void logIn(String userName, int password){
		System.out.println("Connectly login through username and password");
		System.out.println("the username: " + userName);
		System.out.println("password: " + password);
	}

	public static void logIn(long number, int password){
		System.out.println("Connectly login through mobile number and password");
		System.out.println("the mobile number: " + number);
		System.out.println("the password: " + password);
	}

	public static void main(String[] args){
		logIn("connectlyUser",1313);
		logIn(9100000013L,1313);
	}
}