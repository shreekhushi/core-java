class GitHub{
	int userId;
	String username;
	String email;
	Repository repository;
	
	public void getGitHubDetails(){
		System.out.println("getGitHubDetails invoked");
		System.out.println("the user id is: " +userId);
		System.out.println("the username is: " +username);
		System.out.println("the email is: " +email);
		repository.getRepositoryDetails();
		System.out.println("getGitHubDetails ended");
	}
	
	GitHub(int userId, String username, String email, Repository repository){
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.repository = repository;
	}
	
	GitHub(){
		
	}
	
	public boolean createRepository(Repository repository){
		this.repository = repository;
		return true;
	}
}