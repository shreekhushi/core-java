class Season{
	int seasonId;
	String seasonName;
	String duration;
	
	public void getSeasonDetails(){
		System.out.println("getSeasonDetails invoked");
		System.out.println("the season id is: " +seasonId);
		System.out.println("the season name is: " +seasonName);
		System.out.println("the duration is: " +duration);
		System.out.println("getSeasonDetails ended");
	}
}