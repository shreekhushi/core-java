class WaterPurifier {
    public static String getBrand() {
        System.out.println("getBrand invoked");
        return "Native by UC";
    }

    public static int getCapacity() {
        System.out.println("getCapacity invoked");
        return 8;
    }

    public static String getFeature() {
        System.out.println("getFeature invoked");
        return "Reduce TDS";
    }

    public static String getMaterial() {
        System.out.println("getMaterial invoked");
        return "Polypropylene";
    }
}