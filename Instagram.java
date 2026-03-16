class Instagram{
	public static void logIn(String userName, int password){
		System.out.println("login through username and password");
		System.out.println("the username: " + userName); 
		System.out.println("password: " + password);
	}
	
	public static void logIn(long number, int passowrd){
		System.out.println("login through mobile number and password");
		System.out.println("the mobile number: " + number);
		System.out.println("the password: " + passowrd);
	}
	
	public static void main(String[] args){
		logIn("khushim" , 1234);
		logIn(8296897154L , 1234);
		
	}
}