class Repository{
	int repoId;
	String repoName;
	String language;
	
	public void getRepositoryDetails(){
		System.out.println("getRepositoryDetails invoked");
		System.out.println("the repo id is: " +repoId);
		System.out.println("the repo name is: " +repoName);
		System.out.println("the language is: " +language);
		System.out.println("getRepositoryDetails ended");
	}
}