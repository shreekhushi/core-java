class GitHubThreeExecutor{
	public static void main(String[] g){
		Repository repo = new Repository();
		GitHub gitHub = new GitHub(1101,"shreekhushi","khushi.shree04@gmail.com",repo);
		gitHub.getGitHubDetails();
	}
}