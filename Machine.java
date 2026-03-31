class Machine{

    int machineId;
    String machineName;
    String type;
    int capacity;
    String status;

    public void getMachineDetails() {
        System.out.println("Machine Details:");
        System.out.println("Machine Id: " + machineId);
        System.out.println("Machine Name: " + machineName);
        System.out.println("Type: " + type);
        System.out.println("Capacity: " + capacity);
        System.out.println("Status: " + status);
        System.out.println("-----------------------------");
    }
}