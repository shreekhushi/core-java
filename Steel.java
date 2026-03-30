class Steel{
    String type;
    double weight;
    String grade;
    String usage;
    int price;

    Steel() {
        System.out.println("Steel default constructor");
    }

    Steel(String type) {
        this.type = type;
    }

    Steel(String type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    Steel(String type, double weight, String grade) {
        this.type = type;
        this.weight = weight;
        this.grade = grade;
    }

    Steel(String type, double weight, String grade, String usage) {
        this.type = type;
        this.weight = weight;
        this.grade = grade;
        this.usage = usage;
    }

    Steel(String type, double weight, String grade, String usage, int price) {
        this.type = type;
        this.weight = weight;
        this.grade = grade;
        this.usage = usage;
        this.price = price;
    }

    void display() {
        System.out.println(type + " " + weight + " " + grade + " " + usage + " " + price);
    }
}