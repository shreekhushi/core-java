class CountryExecutor{
	
	public static void main(String[] i){
		
		Country state = new Country();
		
		boolean added = state.addState("Andhra Pradesh");
		System.out.println(added);
		System.out.println("---------------");
		
		added = state.addState("Arunachal Pradesh");
		System.out.println(added);
		System.out.println("---------------");
		
		added = state.addState("Assam");
		System.out.println(added);
		System.out.println("---------------");
		
		added = state.addState("Bihar");
		System.out.println(added);
		System.out.println("---------------");
		
		added = state.addState("Chhattisgarh");
		System.out.println(added);
		System.out.println("---------------");
		
		added = state.addState("Goa");
		System.out.println(added);
		System.out.println("---------------");
		
		added = state.addState("Gujarat");
		System.out.println(added);
		System.out.println("---------------");
		
		added = state.addState("Haryana");
		System.out.println(added);
		System.out.println("---------------");
		
		added = state.addState("Himachal Pradesh");
		System.out.println(added);
		System.out.println("---------------");
		
		added = state.addState("Jharkhand");
		System.out.println(added);
		System.out.println("---------------");
		
		added = state.addState("Karnataka");
		System.out.println(added);
		System.out.println("---------------");
		
		added = state.addState("Kerala");
		System.out.println(added);
		System.out.println("---------------");
		
		added = state.addState("Madhya Pradesh");
		System.out.println(added);
		System.out.println("---------------");
		
		added = state.addState("Maharashtra");
		System.out.println(added);
		System.out.println("---------------");
		
		added = state.addState("Manipur");
		System.out.println(added);
		System.out.println("---------------");
		
		added = state.addState("Meghalaya");
		System.out.println(added);
		System.out.println("---------------");
		
		added = state.addState("Mizoram");
		System.out.println(added);
		System.out.println("---------------");
		
		added = state.addState("Nagaland");
		System.out.println(added);
		System.out.println("---------------");
		
		added = state.addState("Odisha");
		System.out.println(added);
		System.out.println("---------------");
		
		added = state.addState("Punjab");
		System.out.println(added);
		System.out.println("---------------");
		
		added = state.addState("Rajasthan");
		System.out.println(added);
		System.out.println("---------------");
		
		added = state.addState("Sikkim");
		System.out.println(added);
		System.out.println("---------------");
		
		added = state.addState("Tamil Nadu");
		System.out.println(added);
		System.out.println("---------------");
		
		added = state.addState("Telangana");
		System.out.println(added);
		System.out.println("---------------");
		
		added = state.addState("Tripura");
		System.out.println(added);
		System.out.println("---------------");
		
		added = state.addState("Uttar Pradesh");
		System.out.println(added);
		System.out.println("---------------");
		
		added = state.addState("Uttarakhand");
		System.out.println(added);
		System.out.println("---------------");
		
		added = state.addState("West Bengal");
		System.out.println(added);
		System.out.println("---------------");
		
		
		state.getStates();
		
		String name = state.getStatesByName("Sikkim");
		System.out.println(name + " is available");
		
		boolean update = state.updateState("Sikkim", "Karnataka");
		System.out.println(update);
		
		state.getStates();
		
		boolean delete = state.deleteState("Uttar Pradesh");
		System.out.println(delete);
		
		state.getStates();
	}
}