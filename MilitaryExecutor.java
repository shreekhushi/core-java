class MilitaryExecutor{

    public static void main(String[] args){

        Military military = new Military();

        boolean added = military.addWeapon("Rifle");
        System.out.println(added);
        System.out.println("---------------");

        added = military.addWeapon("Pistol");
        System.out.println(added);
        System.out.println("---------------");

        added = military.addWeapon("Machine Gun");
        System.out.println(added);
        System.out.println("---------------");

        added = military.addWeapon("Sniper Rifle");
        System.out.println(added);
        System.out.println("---------------");

        added = military.addWeapon("Shotgun");
        System.out.println(added);
        System.out.println("---------------");

        added = military.addWeapon("Grenade");
        System.out.println(added);
        System.out.println("---------------");

        added = military.addWeapon("Rocket Launcher");
        System.out.println(added);
        System.out.println("---------------");

        added = military.addWeapon("Missile");
        System.out.println(added);
        System.out.println("---------------");

        added = military.addWeapon("Tank");
        System.out.println(added);
        System.out.println("---------------");

        added = military.addWeapon("Fighter Jet");
        System.out.println(added);
        System.out.println("---------------");

        added = military.addWeapon("Submarine");
        System.out.println(added);
        System.out.println("---------------");

        added = military.addWeapon("Warship");
        System.out.println(added);
        System.out.println("---------------");

        added = military.addWeapon("Drone");
        System.out.println(added);
        System.out.println("---------------");

        added = military.addWeapon("Torpedo");
        System.out.println(added);
        System.out.println("---------------");

        added = military.addWeapon("Anti-Aircraft Gun");
        System.out.println(added);
        System.out.println("---------------");

        added = military.addWeapon("Mortar");
        System.out.println(added);
        System.out.println("---------------");

        added = military.addWeapon("Ballistic Missile");
        System.out.println(added);
        System.out.println("---------------");

        added = military.addWeapon("Cruise Missile");
        System.out.println(added);
        System.out.println("---------------");

        added = military.addWeapon("Combat Helicopter");
        System.out.println(added);
        System.out.println("---------------");

        added = military.addWeapon("Laser Weapon");
        System.out.println(added);
        System.out.println("---------------");

        added = military.addWeapon("Cyber Weapon");
        System.out.println(added);
        System.out.println("---------------");

        military.getWeapons();
		
		String name = military.getWeaponByName("Mortar");
		System.out.println(name + " is available");
		
		boolean update = military.updateWeapon("Cyber Weapon", "Cyber");
		System.out.println(update);
		
		military.getWeapons();
		
		boolean delete = military.deleteWeapon("Mortar");
		System.out.println(delete);
		
		military.getWeapons();
    }
}