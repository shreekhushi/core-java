class Lock{

    int lockId;
    String type;
    String material;
    boolean isLocked;
    String brand;

    public void getLockDetails() {
        System.out.println("Lock Details:");
        System.out.println("Lock Id: " + lockId);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Is Locked: " + isLocked);
        System.out.println("Brand: " + brand);
        System.out.println("-----------------------------");
    }
}