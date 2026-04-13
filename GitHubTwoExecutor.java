class GitHubTwoExecutor{
	public static void main(String[] g){
		GitHub gitHub = new GitHub();
		gitHub.userId = 1101;
		gitHub.username = "shreekhushi";
		gitHub.email = "khushi.shree04@gmail.com";
		
		Repository repo = new Repository();
		repo.repoId = 1201;
		repo.repoName = "CureQueue";
		repo.language = "Java";
		
		boolean create = gitHub.createRepository(repo);
		System.out.println(create);
		
		gitHub.getGitHubDetails();
	}
}