class StateElectionExecutor{

    public static void main(String[] args) {

        StateElection election = new StateElection();

        boolean added = election.addParty("BJP");
        System.out.println(added);
        System.out.println("---------------");

        added = election.addParty("Congress");
        System.out.println(added);
        System.out.println("---------------");

        added = election.addParty("AAP");
        System.out.println(added);
        System.out.println("---------------");

        added = election.addParty("TMC");
        System.out.println(added);
        System.out.println("---------------");

        added = election.addParty("DMK");
        System.out.println(added);
        System.out.println("---------------");

        added = election.addParty("Shiv Sena");
        System.out.println(added);
        System.out.println("---------------");

        added = election.addParty("JD(U)");
        System.out.println(added);
        System.out.println("---------------");

        election.getParties();
		
		String name = election.getPartyByName("AAP");
		System.out.println(name);
		
		boolean update = election.updatePartyName("AAP", "Aam Aadmi Party");
		System.out.println(update);
		
		election.getParties();
		
		boolean delete = election.deletePartyName("TMC");
		System.out.println(delete);
		
		election.getParties();
    }
}