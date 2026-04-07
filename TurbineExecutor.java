class TurbineExecutor{

    public static void main(String[] args){

        Turbine turbine = new Turbine();

        boolean added = turbine.addTurbine("Steam Turbine");
        System.out.println(added);
        System.out.println("---------------");

        added = turbine.addTurbine("Gas Turbine");
        System.out.println(added);
        System.out.println("---------------");

        added = turbine.addTurbine("Wind Turbine");
        System.out.println(added);
        System.out.println("---------------");

        added = turbine.addTurbine("Hydraulic Turbine");
        System.out.println(added);
        System.out.println("---------------");

        added = turbine.addTurbine("Pelton Turbine");
        System.out.println(added);
        System.out.println("---------------");

        added = turbine.addTurbine("Francis Turbine");
        System.out.println(added);
        System.out.println("---------------");

        added = turbine.addTurbine("Kaplan Turbine");
        System.out.println(added);
        System.out.println("---------------");

        added = turbine.addTurbine("Impulse Turbine");
        System.out.println(added);
        System.out.println("---------------");

        added = turbine.addTurbine("Reaction Turbine");
        System.out.println(added);
        System.out.println("---------------");

        added = turbine.addTurbine("Micro Turbine");
        System.out.println(added);
        System.out.println("---------------");

        turbine.getTurbines();
		
		String name = turbine.getTurbineByName("Wind Turbine");
		System.out.println(name + " is available");
		
		boolean update = turbine.updateTurbine("Wind Turbine" , "Offshore Wind Turbine");
		System.out.println(update);
		turbine.getTurbines();
		
		boolean delete = turbine.deleteTurbine("Offshore Wind Turbine");
		System.out.println(delete);
		
		turbine.getTurbines();
    }
}