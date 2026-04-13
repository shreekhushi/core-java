class PrisonThreeExecutor{
	public static void main(String[] p){
		Criminal criminal = new Criminal();
		Prison prison = new Prison(1701,"Central Jail",500,criminal);
		prison.getPrisonDetails();
	}
}